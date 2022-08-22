package listaExercicios2;

import java.util.Scanner;

/*Construa um programa que determine (imprima) se um dado numero N inteiro (recebido atraves do teclado) e
PAR ou IMPAR.*/

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num;
		
		System.out.println("Entre com um número: ");
		num = leia.nextInt();
		
		if(num % 2 == 0) {
			
			System.out.println("O número "+num+" é par!");
		} else {
			
			System.out.println("O número "+num+" é ímpar!");
		}
	}
}
