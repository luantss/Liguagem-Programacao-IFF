package listaExercicios1;

import java.util.Scanner;

public class MedidaEx2 {

	public static void main(String[] args) {
		
		//Fa�a um programa que converta uma medida de metros para cent�metros
		
		Scanner leia = new Scanner(System.in);
		float metro, centimetro;
		
		System.out.print("Entre com o valor em metros: ");
		metro = leia.nextFloat();
		
		centimetro = metro * 100;
		
		System.out.println(metro + " metros s�o " + centimetro + " centimetros");
	}
}
