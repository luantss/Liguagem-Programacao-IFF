package listaExercicios1;

import java.util.Scanner;

public class ImcEx8 {

	public static void main(String[] args) {
		
		//Dado o peso e a altura do usuário imprima seu Indice de Massa Corporal
		
		Scanner leia = new Scanner(System.in);
		double peso, altura, imc;
		
		System.out.print("Entre com o peso: ");
		peso = leia.nextFloat();
		System.out.print("Entre com a altura: ");
		altura = leia.nextFloat();
		
		imc = peso / Math.pow(altura, 2);
		
		System.out.println("\nO IMC é " + imc);
	}
}
