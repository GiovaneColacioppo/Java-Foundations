package desafio0812;

import java.util.Scanner;

public class Estoque {

    String marca, tipo, tamanho;
    int quantidade;
    double preco;

    public Estoque(String marca, String tipo, String tamanho, int quantidade, double preco) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public double valorTotal(){

        return this.preco * this.quantidade;

    }

    public void venda(){


        if (this.quantidade > 0 && quantidade == this.quantidade){

        this.quantidade -= quantidade;
        }else {

            System.out.println("Quantidade Invalida");

        }

    }

    public void abastecimento(){
        if (this.quantidade < 0){

            this.quantidade += quantidade;
            System.out.println("Estoque abastecido");


        }
    }

    @Override
    public String toString() {
        return "Estoque{" +
                "Marca= " + marca +
                "\nTipo= " + tipo +
                "\nTamanho= " + tamanho +
                "\nQuantidade= " + quantidade +
                "\nPreco= " + preco +
                "\nValorTotal= " + valorTotal() +
                '}';
    }

    public static void main(String[] args) {



    }
}
