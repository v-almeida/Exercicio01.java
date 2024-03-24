/*Elabore um algoritmo que receba três notas de um aluno os pesos referentes a
cada nota e retorne a sua média ponderada. Veja o cálculo da média ponderada:
                  
                     nota1 * peso1 + nota2 * peso2 + nota3 * peso3
Média ponderada = ---------------------------------------------------
                              peso1 + peso2 + peso3

Exemplo: nota1 = 10, nota2 = 5.5, nota3 = 8, peso1 = 5, peso2 = 3, peso3 = 2
Média ponderada = 8.25
 */

import java.util.Scanner;

public class Exercicio17 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a sua segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a sua terceira nota: ");
        double nota3 = scanner.nextDouble();

        int peso1 = 5;
        int peso2 = 3;
        int peso3 = 2;

        double MediaPonderada = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3);

        String MediaPonderadaFormatada = String.format("%.2f", MediaPonderada);

        System.out.println("A sua média ponderada é: " + MediaPonderada / 10);

        scanner.close();
    }

}
