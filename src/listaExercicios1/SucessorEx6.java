package listaExercicios1;

import java.util.Scanner;

public class SucessorEx6 {

	public static void main(String[] args) {
		
		//Leia um n�mero inteiro e imprima o seu antecessor e o seu sucessor.
		
		Scanner leia = new Scanner(System.in);
		int num, numA, numS;
		
		System.out.print("Entre com um n�mero inteiro: ");
		num = leia.nextInt();
		
		numA = num - 1;
		numS = num + 1;
		
		System.out.println("\nO n�mero antecessor de " + num + " � " + numA);
		System.out.println("\nO n�mero sucessor de " + num + " � " + numS);
	}
}
