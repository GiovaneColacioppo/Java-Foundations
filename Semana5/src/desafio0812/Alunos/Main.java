package desafio0812.Alunos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno("Giovane", 10, 10);

        System.out.println(aluno.toString());

        sc.close();


    }

}
