package listaExercicios1;

import java.util.Scanner;

public class ReajusteEx9 {

	public static void main(String[] args) {
		
		//Leia o salário mensal atual de um funcionário e o percentual de reajuste. 
		//Calcular e escrever o valor do novo salário.
		
		Scanner leia = new Scanner(System.in);
	    float salarioA, reajuste, salarioN;
	    
	    System.out.print("Entre com o salário atual: ");
	    salarioA = leia.nextFloat();
	    System.out.print("Entre com o percentual de reajuste: ");
	    reajuste = leia.nextFloat();
	    
	    salarioN = salarioA + (salarioA * reajuste/100);
	    
	    System.out.println("O novo salário com reajuste de "+ reajuste + "% é " + salarioN);

	}
}
