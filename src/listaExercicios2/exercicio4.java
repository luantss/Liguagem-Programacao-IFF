package listaExercicios2;

import java.util.Scanner;

//Faca um programa que verifique se uma letra digitada é vogal ou consoante.

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String letra;
		
		System.out.println("Entre com a letra:");
		letra = leia.nextLine();
		
		switch(letra) {
		
			case "a":
			case "A":
			case "e":
			case "E":
			case "i":
			case "I":
			case "o":
			case "O":
			case "u":
			case "U":
				System.out.println("Vogal!");
				break;
			default:
				System.out.println("Consoante!");
		}
	}
}
