package repeticao;

/*Se tivermos uma lista dos números naturais menores do que 10 que são múltiplos de 3 ou 5 obtemos 3,
5, 6 e 9. A soma destes múltiplos é 23. Imprima a soma dos múltiplos de 3 ou 5 menores do que 1000.
(Utilizar a estrutura de repetição while)*/


public class ex8 {
 
    public static void main(String[] args) {

        int num=0, soma=0;

        while(num < 1000) {

            if(num % 3 == 0 || num % 5 == 0) {

                soma = soma + num;
            }
            num++;
        }
        System.out.println("A soma dos números múltiplos de 3 ou 5 menores que 1000 é: "+soma);
    }
}
