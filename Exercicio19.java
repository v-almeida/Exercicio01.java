/*Faça um algoritmo que receba o raio e a altura de um cilindro e retorne o seu
volume calculado de acordo com a seguinte fórmula: volume = 3.14 * raio2
* altura;
Exemplo: raio = 10, altura = 15. Volume = 4710 */

import java.util.Scanner;

public class Exercicio19 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o raio do cilindro: ");
        int raio = scanner.nextInt();

        System.out.println("Qual é a altura do cilindro: ");
        int altura = scanner.nextInt();

        scanner.close();

        double volume = 3.14 * Math.pow(raio, 2) * altura;

        System.out.println("O resultado é: " + volume);

    }

}
