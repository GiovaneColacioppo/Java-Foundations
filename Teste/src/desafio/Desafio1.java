package desafio;

import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Selecione uma temperatura para que seja transformada em Farenheit(F) e Kelvin(K)");
        double celsius = ler.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;

        double kelvin = celsius + 273.15;

        System.out.println("A temperatura em Celsius é: " + celsius + " °C");
        System.out.printf("A temperatura em Farenheit é: %.2f F%n", fahrenheit);
        System.out.printf("A temperatura em Kelvin é: %.2f K%n", kelvin);

    }

}
