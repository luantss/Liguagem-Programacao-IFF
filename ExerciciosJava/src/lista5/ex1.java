package lista5;

import java.util.Scanner;

/*Prepare um algoritmo para perguntar o nome e o sexo de 10 pessoas e informar quantas são homens e quantas
são mulheres.*/

public class ex1 {
    
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        String sexo, nome, upper;
        int quantHomem=0, quantMulher=0, aux;

        for(aux = 0; aux < 2; aux++) {

            System.out.print("Entre com o nome: ");
            nome = leia.nextLine();
            System.out.print("Entre com o sexo: ");
            sexo = leia.nextLine();

            //Para não ocorrer nenhum problema de caixa alta/baixa inserida pelo usuário
            upper = sexo.toUpperCase();

            if(upper.equals("FEMININO")) {
                quantMulher = quantMulher + 1;
            } else {
                if(upper.equals("MASCULINO")) {
                    quantHomem = quantHomem + 1;
                }
            }
        }

        System.out.println("Quantidade de mulheres: "+quantMulher);
        System.out.println("Quantidade de homens: "+quantHomem);

    }
}
