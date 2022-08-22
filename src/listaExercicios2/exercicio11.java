package listaExercicios2;

import java.util.Scanner;

/*Elabore um algoritmo que dada a idade de um nadador classica-o em uma das seguintes categorias: 
	infantil A= 5-7 anos; 
	infantil B = 8-10 anos; 
	juvenil A = 11-13 anos; 
	juvenil B = 14-17 anos; 
	adulto = maiores de 18 anos.*/

public class exercicio11 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int idade;
		
		System.out.println("Entre com a idade: ");
		idade = leia.nextInt();
		
		if(idade < 5) {
			
			System.out.println("Não tem idade para participar!");
		} else {
			
			if(idade <= 7) {
				
				System.out.println("Infantil A");
			} else {
				
				if(idade <= 10) {
					
					System.out.println("Infantil B");
				} else {
					
					if(idade <= 13) {
						
						System.out.println("Juvenil A");
					} else {
						
						if(idade <= 17) {
							
							System.out.println("Juvenil B");
						} else {
							
							System.out.println("Adulto");
						}
					}
				}
			}
		}
	}
}
