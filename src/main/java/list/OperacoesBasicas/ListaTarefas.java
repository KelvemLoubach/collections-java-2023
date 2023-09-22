package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefas> tarefasList;

    public  ListaTarefas(){
        this.tarefasList = new ArrayList<>();

    }

    public void adicionarTarefa(String descricao){
        tarefasList.add(new Tarefas(descricao));
    }

    public void removerTarefa(String remover){
        List<Tarefas> removerTarefasList = new ArrayList<>();
        for(Tarefas t : tarefasList){
            if(t.getDescricao().equalsIgnoreCase(remover)){
                removerTarefasList.add(t);
            }
        }
        tarefasList.removeAll(removerTarefasList);
    }

    public int obterNumeroTarefas(){
        return tarefasList.size();
    }

    public void imprimirTarefas(){
        System.out.println(tarefasList);
    }

}
