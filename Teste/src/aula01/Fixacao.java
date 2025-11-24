package aula01;

import java.util.Scanner;

public class Fixacao {

    public static void main(String[] args) {

        String cidade,uf;
        int cond;
        Scanner ler = new Scanner(System.in);

        do {

        cond = 0;

        IO.println("Ola. Por favor digite seu estado em sigla:");
        uf = ler.nextLine();

        uf = uf.trim();

        if (uf.length() != 2 || uf.isBlank()){
            IO.println("Voce inseriu errado. Por favor tente de novo!");
            cond = 1;
        }


        } while (cond != 0);

        IO.println("Digite o nome da sua cidade: ");
        cidade = ler.nextLine();

        cidade = cidade.trim();


        IO.println("Seu estado e " + uf + " e voce mora em " + cidade);

        ler.close();
    }
}
