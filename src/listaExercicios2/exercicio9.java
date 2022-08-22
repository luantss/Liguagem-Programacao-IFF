package listaExercicios2;

import java.util.Scanner;

/*Dado o salario fixo, o valor das vendas efetuadas pelo vendedor de uma empresa e sabendo-se que ele recebe
uma comissão de 3% sobre o total das vendas ate R$1.500,00 e 5% sobre o que ultrapassar este valor, calcular e
escrever o seu salario total.*/

public class exercicio9 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float salario, vendas, comissao;
		
		System.out.println("Entre com o salário: ");
		salario = leia.nextFloat();
		System.out.println("Entre com o valor das vendas:");
		vendas = leia.nextFloat();
		
		if(vendas <= 1500) {
			
			comissao = vendas * 3/100;
			System.out.println("O salário total é R$"+(comissao+salario));
		} else {
			
			comissao = vendas * 5/100;
			System.out.println("O salário total é R$"+(comissao+salario));
		}
	}
}
