package listaExercicios2;

import java.util.Scanner;

/*A prefeitura de Campos abriu uma linha de credito para os funcionarios estatutarios. O valor maximo da
prestação não podera ultrapassar 30% do salario bruto. Fazer um programa que permita entrar com o salario
bruto e o valor da prestação, e informar se o emprestimo pode ou não ser concedido.*/

public class exercicio8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float salario, prest;
		
		System.out.println("Entre com o salário bruto: ");
		salario = leia.nextFloat();
		System.out.println("Entre com o valor da prestação: ");
		prest = leia.nextFloat();
		
		if(prest <= salario*30 / 100) {
			
			System.out.println("Empréstimo concedido!!");
		} else {
			
			System.out.println("Empréstimo negado!!");
		}
		
	}
}
