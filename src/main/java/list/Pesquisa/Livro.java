package main.java.list.Pesquisa;

public class Livro {

    private String titulo;
    private String autor;
    private int anoLancamento;
    public Livro(String titulo, String autor, int anoLancamento){
        this.titulo = titulo;
        this.autor = autor;
        this.anoLancamento = anoLancamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }
}
