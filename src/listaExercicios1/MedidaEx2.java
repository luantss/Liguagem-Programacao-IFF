package listaExercicios1;

import java.util.Scanner;

public class MedidaEx2 {

	public static void main(String[] args) {
		
		//Faça um programa que converta uma medida de metros para centímetros
		
		Scanner leia = new Scanner(System.in);
		float metro, centimetro;
		
		System.out.print("Entre com o valor em metros: ");
		metro = leia.nextFloat();
		
		centimetro = metro * 100;
		
		System.out.println(metro + " metros são " + centimetro + " centimetros");
	}
}
