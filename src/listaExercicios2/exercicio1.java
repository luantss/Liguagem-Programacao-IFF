package listaExercicios2;

import java.util.Scanner;

//Faça um programa que peça um valor e mostre na tela se o valor é positivo, negativo ou nulo.

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float num;
		
		System.out.print("Entre com um valor: ");
		num = leia.nextFloat();
		
		if(num >= 0) {
			
			if(num == 0) {
				
				System.out.println("Esse número é nulo!");
			} else {
				
				System.out.println("Esse número é positivo!");
			}
		} else {
			
			System.out.println("Esse número é negativo!");
		}
	}
}
