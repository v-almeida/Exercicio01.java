/*Escreva um algoritmo que leia um número e diga, através de uma mensagem, se
este número está no intervalo entre 100 e 200. Caso o número esteja fora do intervalo
o usuário também deverá ser informado.  */

import java.util.Scanner;

public class Exercicio07 {

    public static void executar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um Número: ");
        int num = scanner.nextInt();

        if (num >= 100 && num <= 200) {

            System.out.println("O número digitado está entre 100 e 200.");

        } else {
            System.out.println("Este número não está entre 100 e 200.");
        }
        scanner.close();
    }

}
