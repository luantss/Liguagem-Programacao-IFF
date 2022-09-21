package lista4;

import java.util.Scanner;

/*Faça um algoritmo para simular uma situação simples de deposito, retirada e consulta em um banco. O algoritmo
inicialmente deverá mostrar um menu com as seguintes opções:
(a) Deposito
(b) Retirada
(c) Saldo
(d) Sair do programa
Se a escolha do usuario for deposito ou retirada, o algoritmo deverá pedir o valor da operação e atualizar
automaticamente o valor existente na conta. O algoritmo deverá ser utilizado até que o usuário escolha a opção
sair do programa.*/

public class ex5 {
    
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        String op;
        Double saldo=0.0, deposito, retirada;

        do {
            System.out.println("=================================");
            System.out.println("(a) Depósito");
            System.out.println("(b) Retirada");
            System.out.println("(c) Saldo");
            System.out.println("(d) Sair do programa");
            System.out.println("\nEscolha sua opção: ");
            op = leia.nextLine();

            if(op.equals("a") || op.equals("b") || op.equals("c")) {
                switch(op) {
                    case "a":
                        System.out.println("Entre com o valor do depósito: ");
                        deposito = leia.nextDouble();
                        saldo = saldo + deposito;
                        leia.nextLine();
                        break;
                    case "b":
                        System.out.println("Entre com o valor da retirada: ");
                        retirada = leia.nextDouble();
                        if(retirada > saldo) {
                            System.out.println("Você não tem saldo suficiente para retirar R$"+retirada);
                            System.out.println("Seu saldo é de R$"+saldo);
                        } else {
                            saldo = saldo - retirada;
                        }
                        leia.nextLine();
                        break;
                    case "c":
                        System.out.println("Seu saldo é de R$"+saldo);
                        break;
                }
            }
        } while(op.equals("a") || op.equals("b") || op.equals("c"));

    }
}
