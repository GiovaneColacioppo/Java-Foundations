package desafio0812.contaBancaria;

public class ContaBancaria {

    private String nome, cpf;
    private double saldo;

    public ContaBancaria(String nome, String cpf ) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSaldo() {
        return saldo;
    }



}
