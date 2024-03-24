/*A expressão an = a1 + (n – 1) * r é denominada termo geral da Progressão
Aritmética (PA). Nesta fórmula, temos que an é o termo de ordem n (n-ésimo termo),
r é a razão e a1 é o primeiro termo da Progressão Aritmética. Escreva um algoritmo
que encontre o n-ésimo termo de uma progressão aritmética. Exemplo: a1 = 10, n =
7, r = 3. Resultado: an = 28
 */

import java.util.Scanner;
public class Exercicio14 {

    public static void executar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("informe o valor de A1: ");
        int a1 = scanner.nextInt();

        System.out.println("informe o valor de N: ");
        int n = scanner.nextInt();

        System.out.println("informe o valor de R: ");
        int r = scanner.nextInt();

        int an = a1 + (n-1)*r;

        System.out.println("O resultado é: "+ an);

        scanner.close();





    }

}
