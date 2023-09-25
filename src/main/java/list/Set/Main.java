package main.java.list.Set;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();

        conjuntoConvidado.adicionarConvidado("Kelvem", 1234);
        conjuntoConvidado.adicionarConvidado("kelvem", 1235);
        conjuntoConvidado.adicionarConvidado("Kelvem", 1235);

        System.out.println("Foi removido o " + conjuntoConvidado.removerConvidadoCodigo(1235));
        conjuntoConvidado.exibirConvidado();

        System.out.println(conjuntoConvidado.contarConvidado());
    }
}
