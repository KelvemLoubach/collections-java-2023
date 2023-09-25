package main.java.list.Pesquisa;

import main.java.list.Ordenacao.CadastroProdutos;

public class Main {
    public static void main(String[] args) {

       /* CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("O senhor dos Aneis!","Desconhecido", 2023);
        catalogoLivros.adicionarLivro("Avatar", "James Cameron", 2005);
        catalogoLivros.adicionarLivro("Avatar", "James Cameron", 2010);
        catalogoLivros.adicionarLivro("Avatar", "James Cameron", 2010);
        catalogoLivros.adicionarLivro("No limite do amanhã", "Não sei", 2014);

        System.out.println(catalogoLivros.contarLivros());

        System.out.println(catalogoLivros.pesquisarAutor("desconhecido"));
        System.out.println(catalogoLivros.pesquisarIntervaloAno(2010,2014));
        System.out.println(catalogoLivros.pesquisaTitulo("avatar"));

        */

       /* AgendaContato agendaContato = new AgendaContato();

        agendaContato.adicionarContato("Kelvem", 2899937);
        agendaContato.adicionarContato("Kelvem TI", 654643);
        agendaContato.adicionarContato("Julesca", 56433);

        agendaContato.pesquisarNomeContato("Kel");
        agendaContato.atualizarContato("Kelvem", 1000);
        agendaContato.exibirContato();

        */

        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adcionarProdutos(2564,"Produto1",65,98.32);
        cadastroProdutos.adcionarProdutos(2567,"Produto2",5,18.32);
        cadastroProdutos.adcionarProdutos(2464,"Produto3",25,518.32);
        cadastroProdutos.adcionarProdutos(2514,"Produto4",55,481.32);
        cadastroProdutos.adcionarProdutos(2544,"Produto5",45,958.32);

        System.out.println(cadastroProdutos.exibirProdutosNome());
        System.out.println(cadastroProdutos.exibirPorPreco());


    }

}
