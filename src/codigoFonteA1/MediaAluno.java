package codigoFonteA1;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float notaP1, notaP2, mediaDasNotas; //Declara��o das vari�veis
		
		System.out.println("Programa M�dia!");	
		System.out.print("Entre com a nota da P1: ");
		notaP1 = leia.nextFloat();
		
		System.out.print("Entre com a nota da P2: ");
		notaP2 = leia.nextFloat();
		
		mediaDasNotas = (notaP1 + notaP2) / 2;
		System.out.println("M�dia do Aluno: " + mediaDasNotas);

	}

}
