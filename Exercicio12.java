/*Escreva um algoritmo que receba o número do mês e mostre o mês
correspondente. Valide mês inválido.
 */

import java.util.Scanner;

public class Exercicio12 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número do mês: ");
        int num = scanner.nextInt();
        String mes = scanner.nextLine();

        switch (num) {
            case 1:
                mes = "Janeiro";
                System.out.println("Janeiro");
                break;
            case 2:
                mes = "Feveiro";
                System.out.println("Fevereiro");
                break;
            case 3:
                mes = "Março";
                System.out.println("Março");
                break;
            case 4:
                mes = "Abril";
                System.out.println("Abril");
                break;
            case 5:
                mes = "Maio";
                System.out.println("Maio");
                break;
            case 6:
                mes = "Junho";
                System.out.println("Junho");
                break;
            case 7:
                mes = "Julho";
                System.out.println("Julho");
                break;
            case 8:
                mes = "Agosto";
                System.out.println("Agosto");
                break;
            case 9:
                mes = "Setembro";
                System.out.println("Setembro");
                break;
            case 10:
                mes = "Outubro";
                System.out.println("Outubro");
                break;
            case 11:
                mes = "Novembro";
                System.out.println("Novembro");
                break;
            case 12:
                mes = "Dezembro";
                System.out.println("Dezembro");
                break;

            default:
                mes = "Mês invalido";
                break;
        }

        System.out.println("O mês é: " + mes);
    }
}
