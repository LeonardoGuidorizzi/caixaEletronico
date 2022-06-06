/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.caixa.eletronico;

import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {
        // declaração do objeto de conta;
        Conta objConta = new Conta();
        // declaração do objeto de scanner;

        Scanner objScanner = new Scanner(System.in);
        /* menu de acesso:*/

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("escolha uma opção (digite o numero):");
            System.out.println("1-verificar saldo");
            System.out.println("2-realizar depósito");
            System.out.println("3-realizar saque");
            System.out.println("4 - sair");
            opcao = objScanner.nextInt();

            double valor = 0;

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual:" + objConta.verificarSaldo());
                    break;

                case 2:
                    System.out.println("digite o valor do deposito");
                    valor = objScanner.nextDouble();
                    objConta.realizarDeposito(valor);
                    System.out.println("Saldo atual:" + objConta.verificarSaldo());
                    break;

                case 3:
                    System.out.println("digite o valor do saque");
                    valor = objScanner.nextDouble();
                    objConta.realizarSaque(0);
                    System.out.println("Saldo atual:" + objConta.verificarSaldo());
                    break;

                case 4:
                    System.out.println("Obrigado por usar o sistema");
                    break;

                default:
                    System.out.println("opção invalida");
            }

        }

        /* exibição dos dados de agencia conta e saldo;*/
//       System.out.println("numero da agencia:" +objConta.getAgencia());
//        objConta.setAgencia("ag-345");
//        System.out.println("numero da agencia:"+objConta.getAgencia());
//        
//        System.out.println("numero da conta:"+objConta.getConta());
//        objConta.setConta("123334-33324");
//        System.out.println("numero da conta:"+objConta.getConta());
//        
//        System.out.println("saldo disponivel:"+objConta.getSaldo());
//        objConta.setSaldo(4000);
//        System.out.println("saldo disponivel:"+objConta.getSaldo());
//        
    }

}
