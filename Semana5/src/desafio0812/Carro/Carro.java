package desafio0812.Carro;

public class Carro {

    private String modelo;
    private int ano;
    private double velocidadeMaxima;

    public Carro(String modelo, int ano, double velocidadeMaxima) {
        setModelo(modelo);
        setAno(ano);
        setVelocidadeMaxima(velocidadeMaxima);
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("Modelo não pode ser vazio.");
        }
        this.modelo = modelo.trim();
    }

    public void setAno(int ano) {
        if (ano < 1886) {
            throw new IllegalArgumentException("Ano deve ser >= 1886.");
        }
        this.ano = ano;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        if (velocidadeMaxima <= 0) {
            throw new IllegalArgumentException("Velocidade máxima deve ser maior que 0.");
        }
        this.velocidadeMaxima = velocidadeMaxima;
    }

    @Override
    public String toString() {
        return "Carro: " +
                "modelo = '" + modelo + '\'' +
                ", ano = " + ano +
                ", velocidadeMaxima = " + velocidadeMaxima;
    }

}
