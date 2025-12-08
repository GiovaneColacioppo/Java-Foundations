package desafio0812.Carro;

public class Main {

    public static void main(String[] args) {
        try {
            Carro c1 = new Carro("Fusca", 1959, 120.0);
            System.out.println(c1);

            // exemplo que gera exceção
            Carro c2 = new Carro("   ", 2020, 200.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar carro: " + e.getMessage());
        }

        try {
            Carro c3 = new Carro("Modelo X", 2023, 0.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar carro: " + e.getMessage());
        }
    }

}
