package desafio0812.roupa;

public class Roupa {

    String marca, tipo, tamanho;
    int quantidade;
    double preco;

    public Roupa(String marca, String tipo, String tamanho, int quantidade, double preco) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public double valorTotal(){

        return this.preco * this.quantidade;

    }

    public void venda(int quantidadeVendida){


        if (quantidadeVendida > 0 && quantidadeVendida <= this.quantidade){

        this.quantidade -= quantidadeVendida;

        }else {

            System.out.println("Quantidade Invalida");

        }

    }

    public void abastecimento(int quantidadeAbastecimento){
        if (quantidadeAbastecimento < 0){

            this.quantidade += quantidadeAbastecimento;
            System.out.println("Estoque abastecido");

        } else {
            System.out.println("Quantidade Invalida");
        }
    }

    @Override
    public String toString() {
        return "Estoque{\n" +
                "Marca= " + marca +
                "\nTipo= " + tipo +
                "\nTamanho= " + tamanho +
                "\nQuantidade= " + quantidade +
                "\nPreco= " + preco +
                "\nValorTotal= " + valorTotal() +
                "\n}";
    }

}
