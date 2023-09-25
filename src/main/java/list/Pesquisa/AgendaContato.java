package main.java.list.Pesquisa;
import java.util.HashSet;
import java.util.Set;

public class AgendaContato {

private Set<Contato> contatoSet;

public AgendaContato(){
    this.contatoSet = new HashSet<>();
}

public void adicionarContato(String nome, int numero){
    contatoSet.add(new Contato(nome, numero));
}

public void exibirContato(){
    System.out.println(contatoSet);
}

public void pesquisarNomeContato(String nome){

    Set<Contato> nomeContato = new HashSet<>();
    for(Contato c : contatoSet){
        if(c.getNome().startsWith(nome)){
            nomeContato.add(c);
        }
    }
    System.out.println(nomeContato);
}

public Contato atualizarContato(String nome, int novoNumero){

    Contato contatoAtualizado = null;

    for(Contato c : contatoSet){
       if(c.getNome().equalsIgnoreCase(nome)){
           c.setNumero(novoNumero);
           contatoAtualizado = c;
       }
    }
    return contatoAtualizado;
}



}
