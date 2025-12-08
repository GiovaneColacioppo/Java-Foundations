package desafio0812.roupa;

public class Main {

    public static void main(String[] args) {
        Roupa roupa = new Roupa("Nike", "Blusa", "M",  10, 200);

         roupa.venda(10);
        roupa.abastecimento(50);

        roupa.quantidade = 50;

        System.out.println(roupa.toString());

    }
}
