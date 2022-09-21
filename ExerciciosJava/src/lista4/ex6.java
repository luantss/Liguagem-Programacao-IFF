package lista4;

import java.util.Scanner;

/*Faça um algoritmo para calcular a area de figuras geométricas. Inicialmente o algoritmo deverá apresentar ao
usuário um menu principal, onde será escolhida uma dentre as seguintes opções:
1 - Calcular a area do quadrado
2 - Calcular a area do retangulo
3 - Calcular a area do triangulo
4 - Calcular a area do cırculo
5 - Sair do algoritmo
Após ser escolhida uma das figuras, o usuario deverá então entrar com as devidas medidas da mesma para que o
cálculo possa ser realizado. Depois de informar o resultado*/

public class ex6 {
    
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Double ladoQuadrado, baseRetangulo, alturaRetangulo, baseTriangulo, alturaTriangulo, raio;
        int op;

        do{

            System.out.println("================================");
            System.out.println("1 - Calcular a area do quadrado");
            System.out.println("2 - Calcular a area do retangulo");
            System.out.println("3 - Calcular a area do triangulo");
            System.out.println("4 - Calcular a area do circulo");
            System.out.println("5 - Sair do algoritmo");
            System.out.println("Escolha sua opção: ");
            op = leia.nextInt();

            if(op==1 || op==2 || op==3 || op==4) {
                switch(op) {
                    case 1:
                        System.out.print("Entre com o valor do lado do quadrado: ");
                        ladoQuadrado = leia.nextDouble();
                        System.out.println("A área do quadrado é: "+Math.pow(ladoQuadrado, 2));
                        break;
                    case 2:
                        System.out.print("Entre com o valor da base do retângulo: ");
                        baseRetangulo = leia.nextDouble();
                        System.out.print("Entre com o valor da altura do retângulo: ");
                        alturaRetangulo = leia.nextDouble();
                        System.out.println("A área do retângulo é: "+baseRetangulo*alturaRetangulo);
                        break;
                    case 3:
                        System.out.print("Entre com o valor da base do triângulo: ");
                        baseTriangulo = leia.nextDouble();
                        System.out.print("Entre com o valor da altura do triângulo: ");
                        alturaTriangulo = leia.nextDouble();
                        System.out.println("A área do triângulo é: "+(baseTriangulo*alturaTriangulo)/2);
                        break;
                    case 4:
                        System.out.print("Entre com o raio do círculo: ");
                        raio = leia.nextDouble();
                        System.out.println("A área do círculo é: "+3.14*Math.pow(raio, 2));
                        break;
                }
            }
        } while(op==1 || op==2 || op==3 || op==4);
    }
}
