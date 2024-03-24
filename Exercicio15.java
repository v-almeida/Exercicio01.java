/*Tendo como dados de entrada dois pontos quaisquer no plano, P1(x1, y1) e P2(x2,
y2), calcule e retorne a distância entre eles. 
A fórmula que efetua tal cálculo é: d = raiz
(((x2 - x1)2
) + ((y2 - y1)2
)). Exemplo: p1(0, 5), p2(10, 20). Distancia: 18,03
*/

import java.util.Scanner;

public class Exercicio15 {
    public static void executar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o ponto P1, sendo x1 do plano: ");
        double x1 = scanner.nextDouble();

        System.out.println("Informe o ponto P1, sendo y1 do plano: ");
        double y1 = scanner.nextDouble();

        System.out.println("Informe o ponto P2, sendo x2 do plano: ");
        double x2 = scanner.nextDouble();

        System.out.println("Informe o ponto P2, sendo y2 do plano: ");
        double y2 = scanner.nextDouble();

        double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        String dFormatado = String.format("%.2f", d);

        System.out.println("A distância entre os pontos é: " + dFormatado);

        scanner.close();

    }
}
