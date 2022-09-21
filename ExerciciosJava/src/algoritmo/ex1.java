package algoritmo;

import java.util.Scanner;

/*Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O 
aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para 
carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um programa
que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e 
quantos Km foram percorridos. No final mostre o preço a ser pago de acordo com a 
tabela a seguir:
 - Carros populares (aluguel de R$90 por dia)
 - Até 100Km percorridos: R$0,20 por Km
 - Acima de 100Km percorridos: R$0,10 por Km
 - Carros de luxo (aluguel de R$150 por dia)
 - Até 200Km percorridos: R$0,30 por Km
 - Acima de 200Km percorridos: R$0,25 por Km*/

public class ex1 {
    
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        double km, preco;
        int tipo, dias;

        do {
        System.out.println("Qual é o tipo de carro: ");
        System.out.println("1 - Carro popular");
        System.out.println("2 - Carro de luxo");
        System.out.println("\nEscolha a opção: ");
        tipo = leia.nextInt();
        } while(tipo != 1 && tipo != 2);

        System.out.println("Quantos dias de aluguel?");
        dias = leia.nextInt();
        System.out.println("Quantos Km percorridos?");
        km = leia.nextFloat();

        switch(tipo) {

            case 1:
                preco = 90 * dias;
                if(km <= 100) {

                    preco = preco + km * 0.20;
                } else {

                    preco = preco + km * 0.10;
                }
                System.out.println("Preço a ser pago R$"+preco);
                break;
            case 2:
                preco = 150 * dias;
                if(km <= 200) {

                    preco = preco + km * 0.30;
                } else {

                    preco = preco + km * 0.25;
                }
                System.out.println("Preço a ser pago R$"+preco);
                break;
        }
    }
}
