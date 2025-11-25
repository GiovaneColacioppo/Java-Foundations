package testes;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String nome = "";
        int caso = 0;
        
        System.out.println("Digite seu nome:");
        nome = input.nextLine();
        
        nome = nome.trim().toLowerCase();

        String[] palavras = nome.split(" ");

        palavras[0] = palavras[0].substring(0, 1).toUpperCase() + palavras[0].substring(1);
        palavras[1] = palavras[1].substring(0, 1).toUpperCase() + palavras[1].substring(1);

        System.out.println("Seu nome e " + palavras[0] + " " + palavras[1]);

        do {
            System.out.println("Escolhe como vai ser seu nome: \n1 para Normal- \n2 para tudo maiusculo- \n3 para todo minusculo-");
            caso = input.nextInt();
        } while(caso < 1 || caso > 3);

        switch (caso) {
            case 1:
                System.out.println(palavras[0] + " " + palavras[1]);
                break;
            case 2:
                nome = nome.toUpperCase();
                System.out.println(nome);
                break;
            case 3:
                nome = nome.toLowerCase();
                System.out.println(nome);
        }

    }
}

