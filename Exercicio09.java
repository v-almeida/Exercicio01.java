/*Leia dois números nas variáveis A e B e identifique se os valores são iguais ou
diferentes. Caso eles sejam iguais imprima uma mensagem dizendo que são iguais.
Caso sejam diferentes, informe que são diferentes e qual número é o maior.  */

import java.util.Scanner;

public class Exercicio09 {

    public static void executar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um Número: ");
        int A = scanner.nextInt();

        System.out.println("Digite outro Número: ");
        int B = scanner.nextInt();

        if (A == B) {
            System.out.println("Os números são iguais!");
        } else if (A > B) {
            System.out.println("Os Números são diferentes, sendo que " + A + " é maior que " + B);
        } else if (A < B) {
            System.out.println("Os Números são diferentes, sendo que " + B + " é maior que " + A);

        }
        scanner.close();

    }

}
