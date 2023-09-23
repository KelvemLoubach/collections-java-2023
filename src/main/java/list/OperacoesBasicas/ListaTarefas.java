package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> tarefasList;

    public  ListaTarefas(){
        this.tarefasList = new ArrayList<>();

    }

    public void adicionarTarefa(String descricao){
        tarefasList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String remover){
        List<Tarefa> removerTarefasList = new ArrayList<>();
        for(Tarefa t : tarefasList){
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
        System.out.println(tarefasList.toString());
    }

    @Override
    public String toString() {
        return "ListaTaref" +
                "tarefasList" + tarefasList +
                '}';
    }
}
