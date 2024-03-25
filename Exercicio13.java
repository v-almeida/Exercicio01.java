/*Escreva um algoritmo que leia valores REAIS nas variáveis A e B e o tipo de
operador em outra variável do tipo CARACTERE. Imprima o resultado da operação 
de A por B se o operador aritmético for válido; caso contrário deve ser impresso uma
mensagem de operador não definido. Tratar erro de divisão por zero */

import java.util.Scanner;

public class Exercicio13 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Qual o operador utilizado ('+' para soma, '-' para subtracao, '/' para divisao, '*' multiplicacao): ");
        char oper = scanner.next().charAt(0);
        if ("+-/*".indexOf(oper) == -1) {
            System.out.println("Operacao [" + oper + "] nao suportada");
            scanner.close();
            return;
        }
        System.out.println("Digite um número");
        double A = scanner.nextDouble();

        System.out.println("Digite outro número");
        double B = scanner.nextDouble();

        scanner.close();

        switch (oper) {
            case '+':
                System.out.println("O resultado da soma de " + A + "+" + "B eh" + A + B);
                break;
            case '-':
                System.out.println("O resultado da subtracao de " + A + "-" + "B eh" + (A - B));
                break;
            case '/':
                System.out.println("O resultado da divisao de " + A + "/" + " B é " + A / B);
                break;
            case '*':
                System.out.println("O resultado da multiplicacao de " + A + "*" + "B eh" + A * B);
                break;
            default:
                System.out.println("Se você chegou aqui, parabéns!");
                break;
        }

    }
}