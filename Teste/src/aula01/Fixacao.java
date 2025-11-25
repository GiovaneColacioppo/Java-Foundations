package aula01;

import java.util.Arrays;
import java.util.Scanner;

public class Fixacao {

    public static void main(String[] args) {

        String cidade,uf;
        int cond, cond2;
        Scanner ler = new Scanner(System.in);

        do {

        cond = 0;

        System.out.println("Ola. Por favor digite seu estado em sigla:");
        uf = ler.nextLine();

        uf = uf.trim().toUpperCase();

        if (uf.length() != 2 || uf.isBlank()){
            System.out.println("Voce inseriu errado. Por favor tente de novo!");
            cond = 1;
        }


        } while (cond != 0);

        do {

            cond2 = 0;

            System.out.println("Digite o nome da sua cidade: ");
            cidade = ler.nextLine();

            cidade = cidade.trim();

            if (cidade.isBlank()){
                System.out.println("Voce inseriu errado. Por favor tente de novo!");
                cond2 = 1;
            }

        } while (cond2 != 0);

        String[] palavrasMinusculas = {"de", "da", "do", "das", "dos", "e", "em", "para", "com", "por", "sem", "sob", "sobre", "entre"};

        cidade = cidade.trim();

        String[] palavras = cidade.split("\\s+");

        StringBuilder cidadeCapitalizada = new StringBuilder();

        for (int i = 0; i < palavras.length; i++) {
            if (!palavras[i].isEmpty()) {
                String palavraFormatada;
                String palavraLower = palavras[i].toLowerCase();  // Minusculo só para comparação

                if (Arrays.asList(palavrasMinusculas).contains(palavraLower) && i > 0) {
                    palavraFormatada = palavraLower;  // Mantém em minúsculo
                } else {
                    // Capitaliza: primeira maiúscula, resto minúsculo
                    palavraFormatada = palavras[i].substring(0, 1).toUpperCase()
                            + palavras[i].substring(1).toLowerCase();
                }

                cidadeCapitalizada.append(palavraFormatada).append(" ");
            }
        }

        cidade = cidadeCapitalizada.toString().trim();

        System.out.println("Seu estado e " + uf + " e voce mora em " + cidade);

        ler.close();
    }
}
