package listaExercicios1;

import java.util.Scanner;

public class PonderadaEx7 {

	public static void main(String[] args) {
		
		 //Implemente um programa que leia tres valores e calcule a média ponderada para pesos 1, 2 e 3, respectivamente
		
		Scanner leia = new Scanner(System.in);
		float v1, v2, v3, mediaP;
		
		System.out.print("Entre com o primeiro valor: ");
		v1 = leia.nextFloat();
		System.out.print("Entre com o segundo valor: ");
		v2 = leia.nextFloat();
		System.out.print("Entre com o terceiro valor: ");
		v3 = leia.nextFloat();
		
		mediaP = ((v1 * 1) + (v2 * 2) + (v3 * 3)) / 6;
		
		System.out.println("\nA média ponderada é: " + mediaP);
	}
}
