package listaExercicios1;

import java.util.Scanner;

public class InverterEx4 {

	public static void main(String[] args) {
		
		/*Faça um algoritmo para ler os valores para as variáveis A e B, e efetuar a troca dos valores de forma que,
		a variável A passe a possuir o valor da variável B e que a variável B passe a possuir o valor da variável A.
		Apresentar os valores trocados*/
		
		Scanner leia = new Scanner(System.in);
		float a, b, aux;
		
		System.out.print("Entre com o valor de A: ");
		a = leia.nextFloat();
		System.out.print("Entre com o valor de B: ");
		b = leia.nextFloat();
		
		aux = a;
		a = b;
		b = aux;
		
		System.out.println("\nO valor trocado de A é: " + a);
		System.out.println("O valor trocado de B é: " + b);
	}
}
