/*Escreva um algoritmo que leia dois números digitados pelo usuário e exiba o
resultado da sua soma.  */

import java.util.Scanner;

public class Exercicio02 {

    public static void executar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = scanner.nextInt();

        int resultado = num + num2;

        System.out.println("A soma dos Números informados é: " + resultado);

        scanner.close();

    }

}
