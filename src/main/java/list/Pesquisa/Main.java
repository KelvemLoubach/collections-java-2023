package main.java.list.Pesquisa;

public class Main {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("O senhor dos Aneis!","Desconhecido", 2023);
        catalogoLivros.adicionarLivro("Avatar", "James Cameron", 2005);
        catalogoLivros.adicionarLivro("Avatar", "James Cameron", 2010);
        catalogoLivros.adicionarLivro("Avatar", "James Cameron", 2010);
        catalogoLivros.adicionarLivro("No limite do amanhã", "Não sei", 2014);

        System.out.println(catalogoLivros.contarLivros());

        System.out.println(catalogoLivros.pesquisarAutor("desconhecido"));
        System.out.println(catalogoLivros.pesquisarIntervaloAno(2010,2014));
        System.out.println(catalogoLivros.pesquisaTitulo("avatar"));

    }

}
