package listaExercicios1;

import java.util.Scanner;

public class DeslocamentoEx5 {

	public static void main(String[] args) {
		
		 /*Prepare um algoritmo para calcular a posi��o para a qual se deslocou um m�vel em movimento retil�neo uniforme
		 dada a seguinte f�rmula:
		 S = So + V * T. Inicialmente o algoritmo dever� perguntar ao usu�rio os valores do espa�o inicial(So), da
		 velocidade(V) e do tempo(T). Ap�s a entrada dos devidos valores estes devem ser substitu�dos na f�rmula,
		 resultando assim na posi��o de deslocamento(S) que dever� ser informada na tela do usu�rio.*/
		
		Scanner leia = new Scanner(System.in);
		float So, V, T, S;
		
		System.out.print("Entre com o espa�o inicial: ");
		So = leia.nextFloat();
		System.out.print("Entre com a velocidade: ");
		V = leia.nextFloat();
		System.out.println("Entre com o tempo: ");
		T = leia.nextFloat();
		
		S = So + V * T;
		
		System.out.println("\nA posi��o de deslocamento �: " + S);
	}
}
