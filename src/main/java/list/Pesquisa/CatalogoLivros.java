package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> catalogoLivros;

    public CatalogoLivros(){
        this.catalogoLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoLancamento){
        catalogoLivros.add(new Livro(titulo,autor,anoLancamento));
    }

    public List<Livro> pesquisarAutor(String autor){

        List<Livro> listaAutor = new ArrayList<>();
        if(!catalogoLivros.isEmpty()){
            for( Livro l : catalogoLivros){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    listaAutor.add(l);
                }

            }
        }
        return listaAutor;
    }

    public List<Livro> pesquisarIntervaloAno(int anoInicio, int anoFim){

        List<Livro> intervaloAnoLivro = new ArrayList<>();

        if(!catalogoLivros.isEmpty()){
            for(Livro l : catalogoLivros){
                if(l.getAnoLancamento() >= anoInicio && l.getAnoLancamento() <= anoFim){
                    intervaloAnoLivro.add(l);
                }
            }
        }
        return intervaloAnoLivro;
    }

    public int contarLivros(){
        return catalogoLivros.size();
    }

    @Override
    public String toString() {
        return "CatalogoLivros{" +
                "catalogoLivros=" + catalogoLivros +
                '}';
    }
}
