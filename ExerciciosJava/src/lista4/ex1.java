package lista4;

import java.util.Scanner;

//Escreva um algoritmo que leia 20 números e imprima a soma dos positivos e o total de números negativos.

public class ex1 {
    
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double num, soma = 0;
        int totalNegativo = 0, aux = 0;

        while(aux < 20) {

            System.out.println("Entre com um número: ");
            num = leia.nextDouble();
            if(num >= 0) {
                soma = soma + num;
            } else {
                totalNegativo = totalNegativo + 1;
            }
            aux++;
        }

        System.out.println("O total de números negativos foi: "+totalNegativo);
        System.out.println("A soma dos números positivos foi: "+soma);
    }
}
