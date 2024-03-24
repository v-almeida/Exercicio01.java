/*Escreva um algoritmo que leia um número e mostre uma mensagem caso este
número seja maior ou igual a 50, outra se ele for menor que 50.  */

import java.util.Scanner;

public class Exercicio08 {

    public static void executar() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um Número: ");
        int num = scanner.nextInt();

        if (num >= 50) {
            System.out.println("Este número é maior ou igual que 50.");
        } else {
            System.out.println("Este número é menor que 50.");
        }

        scanner.close();
    }

}
