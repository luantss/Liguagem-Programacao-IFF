package listaExercicios1;

import java.util.Scanner;

public class ReajusteEx9 {

	public static void main(String[] args) {
		
		//Leia o sal�rio mensal atual de um funcion�rio e o percentual de reajuste. 
		//Calcular e escrever o valor do novo sal�rio.
		
		Scanner leia = new Scanner(System.in);
	    float salarioA, reajuste, salarioN;
	    
	    System.out.print("Entre com o sal�rio atual: ");
	    salarioA = leia.nextFloat();
	    System.out.print("Entre com o percentual de reajuste: ");
	    reajuste = leia.nextFloat();
	    
	    salarioN = salarioA + (salarioA * reajuste/100);
	    
	    System.out.println("O novo sal�rio com reajuste de "+ reajuste + "% � " + salarioN);

	}
}
