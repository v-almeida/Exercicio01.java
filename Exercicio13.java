/*Escreva um algoritmo que leia valores REAIS nas variáveis A e B e o tipo de
operador em outra variável do tipo CARACTERE. Imprima o resultado da operação 
de A por B se o operador aritmético for válido; caso contrário deve ser impresso uma
mensagem de operador não definido. Tratar erro de divisão por zero */

import java.util.Scanner;

public class Exercicio13 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o operador utilizado: ");
        String oper = scanner.nextLine();

        System.out.println("Digite um número");
        double A = scanner.nextDouble();

        System.out.println("Digite outro número");
        double B = scanner.nextDouble();

        switch (oper) {
            case "adição":
                oper = "Adição";
                System.out.println("Adição");

                break;

            default:
                break;
        }

    }

}
