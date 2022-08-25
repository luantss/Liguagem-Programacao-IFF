package repeticao;

import java.util.Scanner;

/*Prepare um programa para controlar as informaçõoes sobre utilização de um banco eletrônico. Seu programa
deverá perguntar aos clientes qual foi a operação que eles realizaram.
O programa deverá mostrar um menu com as as seguintes opções:
1 - Depósito
2 - Retirada
3 - Saldo
4 - Extrato
5 - Sair do Programa
O programa deverá ficar em loop, apresentando o menu e lendo a opção do usuário. Após lida a opção de
sair do programa, informe quantas operações foram efetuadas de cada tipo e finalize a execução. (Utilizar
a estrutura de repetição do...while e a estrutura de seleção switch...case)*/


public class ex11 {
    
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int vezesDeposito=0, vezesRetirada=0, vezesSaldo=0, vezesExtrato=0, opcao;
        float deposito=0, retirada=0, saldo=0, totaldeposito=0, totalretirada=0;
        
        do {

            System.out.println("\n======= Banco Eletrônico =======\n");
            System.out.println("1 - Depósito");
            System.out.println("2 - Retirada");
            System.out.println("3 - Saldo");
            System.out.println("4 - Extrato");
            System.out.println("5 - Sair do Programa");
            System.out.print("\nEntre com a opção desejada: ");
            opcao = leia.nextInt();

            switch(opcao) {

                case 1:
                    System.out.println("\n==================================");
                    System.out.print("Quanto deseja depositar: ");
                    deposito = leia.nextFloat();
                    totaldeposito = totaldeposito + deposito;
                    saldo = saldo + deposito;
                    vezesDeposito++;
                    break;
                case 2:
                    System.out.println("\n==================================");
                    System.out.print("Quanto deseja retirar: ");
                    retirada = leia.nextFloat();
                    if(retirada > saldo) {
                        do {
                            System.out.print("\nRetirada Negada!!!");
                            System.out.println(" Sua retirada não pode ser maior que o seu saldo");
                            System.out.println("Seu saldo é de R$"+saldo);
                            System.out.print("\nEntre com o valor de retirada válido: ");
                            retirada = leia.nextFloat();
                        } while(retirada > saldo);
                    }
                    totalretirada = totalretirada + retirada;
                    saldo = saldo - retirada;
                    vezesRetirada++;
                    break;
                case 3:
                    System.out.println("\n==================================");
                    System.out.println("Seu saldo é R$"+saldo);
                    vezesSaldo++;
                    break;
                case 4:
                    System.out.println("\n==================================");
                    System.out.println("Valor total depositado R$"+totaldeposito);
                    System.out.println("Valor total retirado R$"+totalretirada);
                    vezesExtrato++;
                    break;
            }
        }
        while(opcao != 5);

        System.out.println("\nOperações de depósito realizadas: "+vezesDeposito);
        System.out.println("Operações de retirada realizadas: "+vezesRetirada);
        System.out.println("Operações de saldo realizadas: "+vezesSaldo);
        System.out.println("Operações de extrato realizadas: "+vezesExtrato);
    }
}
