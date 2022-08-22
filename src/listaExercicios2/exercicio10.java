package listaExercicios2;

import java.util.Scanner;

/*Faça um programa que peça para entrar com um ano com 4 digitos 
e determine se o mesmo é ou não bissexto.*/

public class exercicio10 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int ano;
		
		System.out.println("Entre com o ano: ");
		ano = leia.nextInt();
		
		if(ano % 4 == 0) {
			
			System.out.println("O ano "+ano+" é bissexto!");
		} else {
			
			System.out.println("O ano "+ano+" não é bissexto!");
		}
	}
}
