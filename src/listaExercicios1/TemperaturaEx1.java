package listaExercicios1;

import java.util.Scanner;

public class TemperaturaEx1 {

	public static void main(String[] args) {
		
		//Leia um valor de temperatura em graus Celsius e converta-o em graus Fahrenheit e Kelvin
		
		Scanner leia = new Scanner(System.in);
		float grausC, grausF, grausK;
		
		System.out.print("Entre com o valor em graus Celsius: ");
		grausC = leia.nextFloat();
		
		grausF = (9 * grausC + 160) / 5;
		grausK = grausC + 273;
		
		System.out.println("\nO valor em graus Fahrenheit é: " + grausF);
		System.out.println("\nO valor em graus Kelvin é: " + grausK);
	}
}
