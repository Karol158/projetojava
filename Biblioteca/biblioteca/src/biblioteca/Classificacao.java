package biblioteca;

public class Classificacao {
private String tipo;

    public Classificacao(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
/* é uma agregação pois a classificação existe sem precisar dos livros*/
}
