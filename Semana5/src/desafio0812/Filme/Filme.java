package desafio0812.Filme;

public class Filme {

    String titulo;
    String genero;
    int duracao;

    public Filme(String titulo, String genero, int duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Titulo não pode ser vazio.");
        }
        this.titulo = titulo.trim();
    }

    public void setGenero(String genero) {
        this.genero = genero;
        if (genero == null || genero.trim().isEmpty()) {
            throw new IllegalArgumentException("Gereno não pode ser vazio.");
        }
        this.genero = genero.trim();
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
        if (duracao < 0) {
            throw new IllegalArgumentException("Duracao deve ser maior que 0 minutos.");
        }
    }

    @Override
    public String toString() {
        return "Filme: " + titulo + ", genero: " + genero + ", duracao: " + duracao;

    }

}
