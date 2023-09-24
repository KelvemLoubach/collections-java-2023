package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    List<Pessoa> pessoaList;

    public OrdenacaoPessoa(){
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarIdade(int idade){

        List<Pessoa> ordenarIdade = new ArrayList<>(pessoaList);
        Collections.sort(ordenarIdade);
        return ordenarIdade;
    }

    public List<Pessoa> ordenarAltura(){
        List<Pessoa> ordenarAltura = new ArrayList<>(pessoaList);
        Collections.sort(ordenarAltura, new CompareAltura());
        return ordenarAltura;
    }
}
