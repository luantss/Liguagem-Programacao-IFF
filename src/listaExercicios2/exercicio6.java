package listaExercicios2;

import java.util.Scanner;

//Escreva um programa que receba um numero e imprima se o numero é ou não e multiplo de 3.

public class exercicio6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num;
		
		System.out.println("Entre com um número: ");
		num = leia.nextInt();
		
		if(num % 3 == 0) {
			
			System.out.println("O número "+num+" é múltiplo de 3!");
		} else {
			
			System.out.println("O número "+num+" NÃO é múltiplo de 3!");
		}
	}
}
