package desafio;

import java.util.Scanner;

public class Desafio4 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Calculadora de juros simples");

        System.out.println("Vamos calcular juros composto. \nPrimeiro informe seu capital inicial:");
        double capitalInicial = ler.nextDouble();

        System.out.println("Agora informe a taxa de juros (em %):");
        double taxaJuros = ler.nextDouble();

        System.out.println("Por fim, informe o período (em meses):");
        double periodo = ler.nextDouble();

        System.out.println("Calculo de juros simples:");

        double jurosSimples = (capitalInicial * taxaJuros * periodo) / 100;

    }

}
