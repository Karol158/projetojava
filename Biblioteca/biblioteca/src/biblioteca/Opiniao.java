package biblioteca;

public class Opiniao extends Livros {
private String feedback;

    public Opiniao(String capa, String nome_livro, String nome_autor, int ano_escrito, 
    String genero, int ano_publicado,String feedback) {
        super(capa,nome_livro,nome_autor,ano_escrito,genero,ano_publicado);
        this.feedback = feedback;
    }


    public String getFeedback() {
        return this.feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

}

   