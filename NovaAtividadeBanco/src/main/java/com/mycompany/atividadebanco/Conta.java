/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadebanco;

/**
 *
 * @author gabri
 */
public abstract class Conta {
    
    private String numeroDaConta;
    protected float saldo;
    private Cliente cliente;
    
    public Conta(String numeroDaConta,Cliente cliente) {
        
        if (cliente == null) {
        throw new IllegalArgumentException("Cliente nao pode ser nulo");
    }    
        this.cliente = cliente;
        this.numeroDaConta = numeroDaConta;
        this.saldo=0;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }
    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente nao pode ser nulo");
        }else{
               this.cliente = cliente;
            }
    }
    
    
    public boolean depositar(float deposito){
        if(deposito>0){
            this.saldo+=deposito;
            return true;
        }else{
            return false;
        }
    }
    
    
    public  abstract boolean transferir(Conta transferencia,float valor);
    
    public abstract boolean setSaldo(float saldo);
    
    public abstract boolean sacar(float valor);
}
