package desafio;

import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Vamos calcular juros composto. \nPrimeiro informe seu capital inicial:");
        double capitalInicial = ler.nextDouble();

        System.out.println("Agora informe a taxa de juros (em %):");
        double taxaJuros = ler.nextDouble();

        System.out.println("Por fim, informe o período (em meses):");
        double periodo = ler.nextDouble();

        double montante = capitalInicial * Math.pow((1 + taxaJuros / 100), periodo);

        String montanteF = String.format("%.2f", montante);

        System.out.printf("O montante após " + periodo + " meses será: " + montanteF);


    }

}
