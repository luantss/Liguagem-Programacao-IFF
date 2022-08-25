package repeticao;

import java.util.Scanner;

/*Criar um programa que leia os limites inferior e superior de um intervalo e imprima todos os números
pares no intervalo aberto e seu somatório.Suponha que os dados digitados são para um intervalo crescente,
ou seja, o primeiro valor é menor que o segundo.*/


public class ex6 {
    
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int inferior, superior, aux, soma = 0;

        System.out.print("Entre com o limite inferior: ");
        inferior = leia.nextInt();
        System.out.print("Entre com o limite superior: ");
        superior = leia.nextInt();
        while(superior < inferior) {

            System.out.print("===O limite superior deve ser maior que o limite inferior===");
            System.out.print("\nEntre com o limete superior: ");
            superior = leia.nextInt();
        }

        for(aux = inferior; inferior < superior; inferior++) {

            if(inferior % 2 == 0) {

                System.out.println("Par: "+inferior);
                soma = soma + inferior;
            }
        }

        System.out.println("Soma dos números pares: "+soma);

    }
}
