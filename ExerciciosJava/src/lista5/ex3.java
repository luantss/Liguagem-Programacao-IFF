package lista5;

import java.util.Scanner;

/*Prepare um algoritmo para perguntar a um certo número de pessoas seu nome, sexo, peso e nacionalidade.
Informe:
(a) A média de peso destas pessoas
(b) O nome da pessoa mais pesada
(c) O nome da mulher brasileira mais leve*/

public class ex3 {
    
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String name, heavyName, lightWeightName="", nationality, gender;
        Double weight, heavyWeight, lightWeight=0.0, sum=0.0, media;
        int i, aux;
        
        System.out.print("Entre com o número de pessoas a serem entrevistadas: ");
        i = read.nextInt();
        read.nextLine();
        System.out.print("\nEntre com o nome: ");
        name = read.nextLine();
        System.out.print("Entre com o sexo: ");
        gender = read.nextLine();
        System.out.print("Entre com o peso: ");
        weight = read.nextDouble();
        read.nextLine();
        System.out.print("Entre com a nacionalidade: ");
        nationality = read.nextLine();

        nationality = nationality.toUpperCase();
        gender = gender.toUpperCase();
        if(lightWeight == 0) {
            if(nationality.equals("BRASILEIRA")) {
                if(gender.equals("FEMININO")) {
                    lightWeight = weight;
                    lightWeightName = name;
                }
            }
        }
        heavyName = name;
        heavyWeight = weight;
        sum = sum + weight;
        i = i- 1;
        for(aux = 0; aux < i; aux++) {

            System.out.print("\nEntre com o nome: ");
            name = read.nextLine();
            System.out.print("Entre com o sexo: ");
            gender = read.nextLine();
            System.out.print("Entre com o peso: ");
            weight = read.nextDouble();
            read.nextLine();
            System.out.print("Entre com a nacionalidade: ");
            nationality = read.nextLine();
            sum = sum + weight;
            nationality = nationality.toUpperCase();
            gender = gender.toUpperCase();
            
            if(lightWeight == 0) {
                if(nationality.equals("BRASILEIRA")) {
                    if(gender.equals("FEMININO")) {
                        lightWeight = weight;
                        lightWeightName = name;
                    }
                }
            }
            if(weight > heavyWeight) {
                heavyWeight = weight;
                heavyName = name;
            } else {
                if(nationality.equals("BRASILEIRA")) {
                    if(gender.equals("FEMININO")) {
                        if(weight < lightWeight) {
                            lightWeight = weight;
                            lightWeightName = name;
                    }
                    }
                }
            }
        }

        media = sum / (i+1);
        System.out.println("A média de peso das pessoas é: "+media);
        System.out.println("O nome da pessoa mais pesada é: "+heavyName);
        System.out.println("O nome da mulher brasileira mais leve é: "+lightWeightName);
    }

}
