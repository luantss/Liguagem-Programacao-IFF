package lista5;

import java.util.Scanner;

/*Prepare um algoritmo para perguntar o nome e a altura de 20 pessoas e informar:
(a) a média destas alturas
(b) a altura da pessoa mais baixa
(c) o nome da pessoa mais alta*/

public class ex2 {
    
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Double height, media, lowHeight, sum=0.0, highest;
        String name, highestName;
        
        System.out.print("Entre com o nome: ");
        name = read.nextLine();
        System.out.print("Entre com a altura: ");
        height = read.nextDouble();

        highestName = name;
        highest = height;
        lowHeight = height;
        sum = sum + height;
        for(int i = 0; i < 3; i++) {

            read.nextLine();
            System.out.print("Entre com o nome: ");
            name = read.nextLine();
            System.out.print("Entre com a altura: ");
            height = read.nextDouble();
            sum = sum + height;

            if(height > highest) {
                highest = height;
                highestName = name;
            } else {
                if(height < lowHeight) {
                    lowHeight = height;
                }
            }           
        }
        media = sum / 20;
        System.out.println("A média das alturas é: "+media);
        System.out.println("A altura da pessoa mais baixa é: "+lowHeight);
        System.out.println("O nome da pessoa mais alta é: "+highestName);

    }
}
