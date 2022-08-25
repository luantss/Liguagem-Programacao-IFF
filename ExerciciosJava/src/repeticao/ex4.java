package repeticao;

import java.util.Scanner;

/*Prepare um programa para calcular a soma dos números entre 1 e N inclusive. O valor de N deve ser
perguntado no início do programa. (Utilizar a estrutura de repetição for)*/

public class ex4 {
    
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        double n, aux, soma=0;

        System.out.println("Entre com o número que deseja somar: ");
        n = leia.nextInt();

        for(aux = 0; aux <= n; aux++) {

            soma = soma + aux;
        }

        System.out.println("A soma dos números de 1 até "+n+" é: "+soma);
    }
}
