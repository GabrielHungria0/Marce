/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadebanco;

/**
 *
 * @author gabri
 */
public class ContaCorrente extends Conta {
    
    
    public ContaCorrente(String numeroDaConta,PessoaFisica cliente) {
            super(numeroDaConta,cliente);
    }
    
    @Override
    public void setCliente(Cliente cliente) {
        if (!cliente.eDoTipo(TipoCliente.PessoaFisica)) {
            throw new IllegalArgumentException("Conta Corrente aceita apenas Pessoa Física");
        }
        super.setCliente(cliente); 
    }

    @Override
    public boolean setSaldo(float saldo) {
        if(saldo<0){
            return false;
        }else{
            this.saldo = saldo;
            return true;
        }
    }

    @Override
    public boolean sacar(float valor) {
        if(valor>this.saldo){
            return false;
        }else{
            this.saldo-=valor;
            return true;
        }

    }   
}
