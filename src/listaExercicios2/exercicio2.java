package listaExercicios2;

import java.util.Scanner;

/*Prepare um programa para perguntar dois numeros e informar qual 
deles é o maior ou se os numeros são iguais.*/

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);		
		float num1, num2;
		
		System.out.println("Entre com o primeiro número: ");
		num1 = leia.nextFloat();
		System.out.println("Entre com o segundo número: ");
		num2 = leia.nextFloat();
		
		if(num1 > num2) {
			
			System.out.println("O número "+num1+" é o maior!");
		} else {
			
			if(num1 == num2) {
				
				System.out.println("Os números são iguais!");
			} else {
				
				System.out.println("O número "+num2+" é o maior!");
			}
		}
	}
}
