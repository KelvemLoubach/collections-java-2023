package main.java.list.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos(){
        this.produtoSet = new HashSet<>();
    }

    public void adcionarProdutos(long codigo, String nome, int quantidade, double preco){
        produtoSet.add(new Produto(nome, codigo,preco,quantidade));
    }

    public Set<Produto> exibirProdutosNome(){
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPreco.addAll(produtoSet);
        return produtosPreco;
    }
}
