/*Escreva um algoritmo que leia dois números e ao final mostre a soma, subtração,
multiplicação e a divisão dos números lidos.  */

public class Exercicio04 {

    public static void executar() {

        int num = 10;
        int num2 = 2;
        System.out.println("Este é o numero 1: " + num + "\n" + "Este é o numero2: " + num2);

        int soma = num + num2;
        int subtracao = num - num2;
        int multiplicacao = num * num2;
        int divisao = num / num2;
        System.out.println("\nsoma: " + soma + "\nSubtração: " + subtracao + "\nMultiplicação: " + multiplicacao
                + "\nDivisão: " + divisao);

    }

}
