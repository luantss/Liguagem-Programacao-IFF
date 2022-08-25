package repeticao;

import java.util.Scanner;

//Faça a multiplicação entre dois números usando somente soma.(Utilizar a estrutura de repetição for)

public class ex10 {
    
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        float num1, num2, resultado=0, aux;

        System.out.print("Entre com o primeiro número da multiplicação: ");
        num1 = leia.nextFloat();
        System.out.print("Entre com o segundo número da multiplicação: ");
        num2 = leia.nextFloat();

        for(aux = 0; aux < num2; aux++) {

            resultado = resultado + num1;
        }
        System.out.println("\n"+num1+" x "+num2+" = "+resultado);
    }
}
