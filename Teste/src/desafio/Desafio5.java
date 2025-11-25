package desafio;

import java.util.Scanner;

public class Desafio5 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Areia e perimetro de um círculo");

        System.out.println("Digite o raio do círculo:");

        double raio = ler.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        double perimetro = 2 * Math.PI * raio;

        System.out.println("A área do círculo é: " + String.format("%.2f", area));

        System.out.println("O perímetro do círculo é: " + String.format("%.2f ", perimetro));


    }

}
