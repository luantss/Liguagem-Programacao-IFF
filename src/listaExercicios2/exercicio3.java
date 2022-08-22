package listaExercicios2;

import java.util.Scanner;

/*Faça um programa que verifique se uma letra digitada é "F", "M" ou "O". Conforme a letra escrever: 
F - Feminino,
M - Masculino,
O - Outros,
Não cadastrado no sistema
Obs: O programa deve funcionar para letras maiusculas e minúsculas.
*/

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String letra;
		
		System.out.println("Entre com a letra: ");
		letra = leia.nextLine();
		
		switch(letra) {	
			case "F":
			case "f":
				System.out.println("Feminino!");
				break;
			case "M":
			case "m":
				System.out.println("Masculino!");
				break;
			case "O":
			case "o":
				System.out.println("Outros!");
				break;
			default:
				System.out.println("Não cadastrado no sistema!");
		}
	}
}
