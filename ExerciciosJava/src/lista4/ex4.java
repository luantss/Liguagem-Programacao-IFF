package lista4;

import java.util.Scanner;

/*Escreva um algoritmo que leia um conjunto de 50 fichas, cada uma contendo a altura e o sexo (M/F) de uma
pessoa. Calcule e imprima:
(a) A maior e a menor altura da turma
(b) A media de altura das mulheres
(c) A media de altura da turma*/

public class ex4 {
    
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String gender;
        double height, lowerHeight, higherHeight, sumClass=0, sumWoman=0;
        int aux, contF=0;

        System.out.print("Entre com a altura: ");
        height = read.nextDouble();
        read.nextLine();
        System.out.print("Entre com o sexo (M/F): ");
        gender = read.nextLine();
        lowerHeight = height;
        higherHeight = height;
        sumClass = sumClass + height;
        if(gender.equals("F")) {
            contF++;
            sumWoman = sumWoman + height;
        }
        for(aux = 1; aux < 2; aux++) {
            System.out.print("Entre com a altura: ");
            height = read.nextDouble();
            read.nextLine();
            System.out.print("Entre com o sexo (M/F): ");
            gender = read.nextLine();

            if(gender.equals("F")) {
                contF++;
                sumWoman = sumWoman + height;
            }
            if(height > higherHeight) {
                higherHeight = height;
            } else {
                if(height < lowerHeight) {
                    lowerHeight = height;
                }
            }
            sumClass = sumClass + height;
        }

        System.out.println("A maior altura é: "+higherHeight);
        System.out.println("A menor altura é: "+lowerHeight);
        System.out.println("A média das alturas das mulheres é: "+sumWoman/contF);
        System.out.println("A média das alturas da turma é: "+sumClass/2);

    }
}
