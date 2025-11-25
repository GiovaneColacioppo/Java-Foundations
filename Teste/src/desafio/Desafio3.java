package desafio;

import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Média de aluno");

        System.out.println("Digite a primeira nota:");

        double nota1 = ler.nextDouble();

        System.out.println("Digite a segunda nota:");

        double nota2 = ler.nextDouble();

        System.out.println("Digite a terceira nota:");

        double nota3 = ler.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        String mediaF = String.format("%.2f", media);

        System.out.println("A média do aluno é: " + mediaF);
    }

}
