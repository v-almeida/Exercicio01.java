/*Leia valores nas variáveis A e B, e efetue a troca dos valores de forma que o valor
da variável A passe a ser o valor da variável B e o valor da variável B passe a ser o
valor da variável A. Apresentar uma mensagem com o valor original de cada variável
e outra com os valores trocados.  */

public class Exercicio05 {

    public static void executar() {

        int A = 5;
        int B = 10;

        System.out.println("Valor A: " + A + "\n" + "Valor B: " + B + "\nValores originais.");

        int troca = A;
        A = B;
        B = troca;

        System.out.println("Valor A: " + A + "\n" + "Valor B: " + B + "\nValores trocados.");

    }

}
