/*1. Escreva um algoritmo que leia um número digitado pelo usuário e mostre a
mensagem “Número maior do que 10!”, caso este número seja maior, ou “Número
menor ou igual a 10!”, caso este número seja menor ou igual*/

import java.util.Scanner;

public class Exercicio01 {

    public static void executar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");

        int num = scanner.nextInt();

        if (num > 10) {
            System.out.println("Número maior do que 10!");
        } else {
            System.out.println("Número menor ou igual a 10!");
        }

        scanner.close();
    }
}
