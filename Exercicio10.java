/*Escreva um algoritmo que leia um número de 1 a 5 e escreva-o por extenso. Caso
o usuário digite um valor que não esteja neste intervalo, exibir a mensagem: “Número
inválido!”.  */

import java.util.Scanner;

public class Exercicio10 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um Número de 1 a 5: ");
        int num = scanner.nextInt();
        String extenso = scanner.nextLine();

        switch (num) {
            case 1:
                extenso = "Um";
                System.out.println("Um");

                break;
            case 2:
                extenso = "Dois";
                System.out.println("Dois");
                break;
            case 3:
                extenso = "Três";
                System.out.println("Três");
                break;
            case 4:
                extenso = "Quatro";
                System.out.println("Quatro");
                break;
            case 5:
                extenso = "Cinco";
                System.out.println("Cinco");
                break;

            default:

                extenso = "Número inválido";
                System.out.println("Número inválido");

        }
        scanner.close();
    }
}
