package biblioteca;

public class Registro extends Livros {
    private String data_pegoulivro;
    private String data_devolucao;
     private Dadosleitor leitor;
    
    
     public Registro(String capa, String nome_livro, String nome_autor, int ano_escrito, 
    String genero, int ano_publicado, String data_pegoulivro, String data_devolucao) {
         super(capa,nome_livro,nome_autor,ano_escrito,genero,ano_publicado);
           this.data_pegoulivro = data_pegoulivro;
           this.data_devolucao = data_devolucao;
        
    }


    public String getData_pegoulivro() {
        return this.data_pegoulivro;
    }

    public void setData_pegoulivro(String data_pegoulivro) {
        this.data_pegoulivro = data_pegoulivro;
    }

    public String getData_devolucao() {
        return this.data_devolucao;
    }

    public void setData_devolucao(String data_devolucao) {
        this.data_devolucao = data_devolucao;
    }
 public Dadosleitor getDadosleitor(){
        return leitor;
     }
     public void setDadosleitor(Dadosleitor leitor){
        this.leitor=leitor;
     }
}
