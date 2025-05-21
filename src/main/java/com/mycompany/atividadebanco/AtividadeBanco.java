/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadebanco;

/**
 *
 * @author gabri
 */
public class AtividadeBanco {
    public static void main(String[] args) {
        Cliente cliente1 = new PessoaFisica("Fulano", 30, "12345678900");
        Cliente cliente2 = new PessoaJuridica("Beltrano", 30, "12345678922");
        
        Conta conta1 = new ContaCorrente("0", (PessoaFisica) cliente1);
        Conta conta2 = new ContaEmpresarial("1", (PessoaJuridica) cliente2, 1000);
        
        var result = conta2.transferir(conta1, 1000);
        System.out.println(result);
        
        conta2.setCliente(cliente1);
    }
}
