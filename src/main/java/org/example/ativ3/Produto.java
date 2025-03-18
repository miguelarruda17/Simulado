package org.example.ativ3;

public class Produto {

    private String nome;
    private Double preco;


    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    public void exibirDetalhes(){

        System.out.println("Nome: " + nome);
        System.out.println("\nPreço: " + preco);

    }

}
