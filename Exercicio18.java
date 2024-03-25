/*Elabore um algoritmo que receba três notas de um aluno e retorne a sua média
harmônica.
                                            3
Média harmônica ---------------------------------------------------------------
                    1            1                   1
                ---------- + ------------ + ----------------------------
                  nota 1       nota 2              nota3


Exemplo: nota1 = 10, nota2 = 5.5, nota3 = 8
Média: 7.37                  
 */

import java.util.Scanner;

public class Exercicio18 {
    public static void executar() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a sua segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a sua terceira nota: ");
        double nota3 = scanner.nextDouble();

        scanner.close();

        double mh = 3 / (1 / nota1 + 1 / nota2 + 1 / nota3);

        System.out.println("Média Harmônica de sua nota é: " + mh);

    }
}
