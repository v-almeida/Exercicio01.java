/*Ler uma temperatura em graus Celsius e apresentá-la convertida em graus
Fahrenheit. A fórmula de conversão é: 

F = (9 * C + 160) / 5

*/

public class Exercicio06 {

    public static void executar() {

        double celcius = 19;
        System.out.println("A temperatura de hoje em cwb: " + celcius + "ºC");

        double F = (9 * celcius + 160) / 5;
        System.out.println("\nA temperatura de hoje em Fahrenheit: " + F + "ºF");

    }

}
