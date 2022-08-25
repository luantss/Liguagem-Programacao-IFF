package repeticao;

import java.util.Scanner;

/*Faça um programa que escreva todos os números múltiplos de 7 entre 1 e N, sendo N um valor introduzido
pelo usuário. Por exemplos: 7, 14, 21, 28, 35. (Utilizar a estrutura de repetição for)*/

public class ex7 {
    
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int n, aux;

        System.out.print("Entre com o valor final: ");
        n = leia.nextInt();

        for(aux = 1; aux <= n; aux++) {

            if(aux % 7 == 0) {

                System.out.println("Múltiplo de 7: "+aux);
            }
        }

    }
}
