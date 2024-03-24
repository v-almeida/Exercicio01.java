/*Escreva um algoritmo que leia os valores de dois números inteiros distintos nas
variáveis A e B e informe qual deles é o maior. Caso os números sejam iguais informar
ao usuário que a sequência de números informados é inválida.  */

import java.util.Scanner;

public class Exercicio03 {

    public static void executar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int A = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int B = scanner.nextInt();

        if (A > B) {
            System.out.println("O primeiro numero informado é maior que o segundo.");
        } else if (A < B) {
            System.out.println("O segundo numero informado é maior que o Primeiro.");
        } else {
            System.out.println("A sequência de números informada é inválida.");
        }
        scanner.close();
    }
}
