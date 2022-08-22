package listaExercicios2;

import java.util.Scanner;

/*Construa um programa que indique se um numero digitado esta compreendido no 
intervalo aberto de 0 a 100 (0 e 100 não estão na faixa de valores).*/

public class exercicio7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float num;
		
		System.out.println("Entre com um número: ");
		num = leia.nextFloat();
		
		if(num > 0 && num < 100) {
			
			System.out.println("O número "+num+" está entre 0 e 100");
		} else {
			
			System.out.println("O número "+num+" não está no intervalo!");
		}
	}
}
