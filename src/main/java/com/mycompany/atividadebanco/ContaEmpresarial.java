/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadebanco;

/**
 *
 * @author gabri
 */
public class ContaEmpresarial extends Conta {
    
    
    private float chequeEspecial;

    public ContaEmpresarial(String numeroDaConta,PessoaJuridica cliente,float chequeEspecial) {
        
        super(numeroDaConta,cliente);
        this.chequeEspecial = chequeEspecial;
    }

    public float getChequeEspecial() {
        return chequeEspecial;
    }

    public boolean setChequeEspecial(float chequeEspecial) {
        if(chequeEspecial<0){
            return false;
        }else{
            this.chequeEspecial = chequeEspecial;
            return true;
        }
    }
    
    
    @Override
    public boolean setSaldo(float novoSaldo) {
        if(novoSaldo<0 && novoSaldo*(-1)>chequeEspecial){
            return false;
        }else{
            this.saldo = novoSaldo;
            return true;
        }
    }

    @Override
    public boolean sacar(float valor) {
        
       if(valor>0 && valor<=saldo+chequeEspecial){
           this.saldo -= valor;
           return true;
       }else{
           return false;
       }
    }
}
