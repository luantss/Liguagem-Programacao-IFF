package listaExercicios1;

import java.util.Scanner;

public class DeslocamentoEx5 {

	public static void main(String[] args) {
		
		 /*Prepare um algoritmo para calcular a posição para a qual se deslocou um móvel em movimento retilíneo uniforme
		 dada a seguinte fórmula:
		 S = So + V * T. Inicialmente o algoritmo deverá perguntar ao usuário os valores do espaço inicial(So), da
		 velocidade(V) e do tempo(T). Após a entrada dos devidos valores estes devem ser substituídos na fórmula,
		 resultando assim na posição de deslocamento(S) que deverá ser informada na tela do usuário.*/
		
		Scanner leia = new Scanner(System.in);
		float So, V, T, S;
		
		System.out.print("Entre com o espaço inicial: ");
		So = leia.nextFloat();
		System.out.print("Entre com a velocidade: ");
		V = leia.nextFloat();
		System.out.println("Entre com o tempo: ");
		T = leia.nextFloat();
		
		S = So + V * T;
		
		System.out.println("\nA posição de deslocamento é: " + S);
	}
}
