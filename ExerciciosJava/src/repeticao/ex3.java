package repeticao;

import java.util.Scanner;

/*Prepare um programa para somar os números compreendidos entre 1 e 1000. (Utilizar a estrutura de
repetição for)*/

public class ex3 {
    
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int num, soma = 0;

        for(num = 1; num <= 1000; num++) {

            soma = soma + num;
        }

        System.out.println("A soma dos números entre 1 e 1000 é: "+soma);

    }
}
