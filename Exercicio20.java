/*Elabore um algoritmo que calcule a quantidade de litros de combustível gasta em
uma viagem, utilizando um automóvel que faz 12km por litro e considerando que são
fornecidos o tempo em hora e a velocidade média da viagem. */

import java.util.Scanner;

public class Exercicio20 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o tempo da viagem: ");
        double tempo = scanner.nextDouble();

        System.out.println("Qual é a velocidade média da viagem: ");
        double vm = scanner.nextDouble();

        scanner.close();

        double litros = tempo * vm;

        System.out.println("A quantidade de combustível gasta na viagem foi " + litros / 12);

    }

}
