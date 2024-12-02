
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        System.out.println("Digite o tipo de capa do livro:");
         String capa = input.nextLine();
         System.out.println("Digite o nome do livro:");
         String nome_livro=input.nextLine();
         System.out.println("Digite o nome do autor:");
         String nome_autor = input.nextLine();
         System.out.printf("Digite o ano que o livro foi escrito:");
         int ano_escrito = input.nextInt();
         System.out.println("Digite o genero literário:");
         String genero = input.nextLine();
        System.out.println("Digite a classificação do livro:");
         String tipo=input.nextLine()
         System.out.printf("Digite o ano que foi publicado:");
         int ano_publicado = input.nextInt();
         System.out.println("Digite a data que o livro foi pego:");
         String data_pegoulivro = input.nextLine();
         System.out.println("Digite a data que foi devolvido:");
         String data_devolucao = input.nextLine();
         System.out.println("Digite o nome do leitor");
          String nome_leitor = input.nextLine();
         System.out.println("Digite a sua opiniao sobre o livro");
          String feedback = input.nextLine();
        System.out.println("Digite o nome do leitor:");
           String nome = input.nextLine();
        System.out.println("Digite o email do leitor:");
        String email=input.nextLine();
        System.out.println("Digite o telefone do leitor:");
        String telefone=input.nextLine();
         
        System.out.println("Tipo de capa dp livro:" +capa);
        System.out.println("O nome do livro:"+nome_livro);
        System.out.println("O nome do autor:"+nome_autor);
        System.out.println("O ano que o livro foi escrito:"+ano_escrito);
        System.out.println("O genero literáro:"+genero);
         System.out.println("O genero literáro:"+tipo);
        System.out.println("O ano que foi publicado:"+ano_publicado);
        System.out.println("A data que o livro foi pego:"+data_pegoulivro);
        System.out.println("A data que o livro foi devolvido:"+data_devolucao);
        System.out.println("O nome do leitor:"+nome_leitor);
        System.out.println("Opiniao sobre o livro:"+feedback);
         System.out.println("O genero literáro:"+nome);
        System.out.println("O genero literáro:"+email);
        System.out.println("O genero literáro:"+telefone);
        
 
 
 
    }
}
