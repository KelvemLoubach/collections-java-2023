package main.java.list.Ordenacao;

public class Main {

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Kelvem", 22, 1.75);
        ordenacaoPessoa.adicionarPessoa("Kelvem", 10, 1.35);
        ordenacaoPessoa.adicionarPessoa("Kelvem", 40, 1.85);
        ordenacaoPessoa.adicionarPessoa("Kelvem", 30, 1.75);
        ordenacaoPessoa.adicionarPessoa("Kelvem", 20, 1.55);



        System.out.println(ordenacaoPessoa.ordenarAltura());

        System.out.println(ordenacaoPessoa.ordenarIdade(20));
    }
}
