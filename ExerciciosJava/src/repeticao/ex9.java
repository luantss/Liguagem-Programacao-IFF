package repeticao;

import java.util.Scanner;

/*Escreva um programa que receba números do usuário enquanto eles forem positivos. No final o programa
deve imprimir quantos números foram digitados.*/

public class ex9 {
    
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        float num, digitados=0;
        System.out.println("Entre com um número: ");
        num = leia.nextFloat();
        digitados++;
        while(num > 0) {
            
            System.out.println("Entre com um número: ");
            num = leia.nextFloat();   
            digitados++;  
        }
        System.out.println("Números digitados: "+digitados);
    }
}
