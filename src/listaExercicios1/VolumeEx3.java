package listaExercicios1;

import java.util.Scanner;

public class VolumeEx3 {
	
	public static void main(String[] args) {
		
		/*Faça um Programa que peça o comprimento a largura e a altura de uma caixa d’água retangular. 
		Calcule e informe o volume da caixa.*/

		
		Scanner leia = new Scanner(System.in);
		float comprimento, largura, altura, volume;
		
		System.out.print("Entre com o comprimento: ");
		comprimento = leia.nextFloat();
		System.out.print("Entre com a largura: ");
		largura = leia.nextFloat();
		System.out.print("Entre com a altura: ");
		altura = leia.nextFloat();
		
		volume = altura * largura * comprimento;
		
		System.out.println("\nO volume é: " + volume);
	}
}
