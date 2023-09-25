package main.java.list.Set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    Set<Convidado> convidadoSet;

    public ConjuntoConvidado(){
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
         convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public Convidado removerConvidadoCodigo(int codigoConvidado){
        Convidado removerConvidado = null;

        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvidado){
                removerConvidado = c;
                break;
            }
        }
        convidadoSet.remove(removerConvidado);
        return removerConvidado;
    }

    public int contarConvidado(){
        return convidadoSet.size();
    }

    public void exibirConvidado(){
        System.out.println(convidadoSet);
    }

}
