package modelo_associacao_3;

public class TesteLivro {

public static void main(String[] args) {
        Livro l = new Livro("Romeu e Julieta", 248,
           new Edicao(2, 1996, 
           new Patrocinador("Editora Moderna",
           new Endereco("Avenida Americana", 2),
                   new Editora("123", "Grupo Companhia das Letras",
                           new Endereco("Avenida Brasileira", 7)))));
        
        
        System.out.println(l);
    } 
}
