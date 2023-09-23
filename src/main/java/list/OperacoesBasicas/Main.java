package main.java.list.OperacoesBasicas;

public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Limpar a casa!");
        listaTarefas.adicionarTarefa("Limpar a sala!");
        listaTarefas.adicionarTarefa("Limpar a moto!");
        listaTarefas.adicionarTarefa("Limpar a máquina!");
        listaTarefas.adicionarTarefa("Limpar a cozinha!");

        System.out.println("O número total de tarefas é: " + listaTarefas.obterNumeroTarefas());

        listaTarefas.removerTarefa("limpar a casa!");

        System.out.println("O número total de tarefas é: " + listaTarefas.obterNumeroTarefas());

        System.out.println(listaTarefas.toString());
    }
}
