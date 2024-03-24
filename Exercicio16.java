/*Elabore um algoritmo que receba três notas de um aluno e retorne a sua média
aritmética. Exemplo: nota1 = 10.0, nota2 = 5.5, nota3 = 8.0. Média: 7.83 */

import java.util.Scanner;

public class Exercicio16 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a sua segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a sua terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        String mediaFormatada = String.format("%.2f", media);

        System.out.println("A sua média é: " + mediaFormatada);

    }

}
