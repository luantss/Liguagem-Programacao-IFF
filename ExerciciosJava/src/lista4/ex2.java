package lista4;

import java.util.Scanner;

/*Escreva um algoritmo que receba números do usuário enquanto eles forem positivos. No final o algoritmo deve
imprimir quantos números foram digitados.*/

public class ex2 {
    
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double num;
        int total=0;

        System.out.println("Entre com um número: ");
        num = leia.nextDouble();
        if(num >= 0) {
            
            while(num >= 0) {
                total++;
                System.out.println("Entre com um número: ");
                num = leia.nextDouble();
            }
            System.out.println("O total de números foi: "+total);
            
        } else {
            System.out.println("O número deve ser positivo para contabilizar!!");
        }
    }
}
