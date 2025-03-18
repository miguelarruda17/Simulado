package org.example.ativ3;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

  Produto produto1 = new Produto("Detergente Max",24.05);

  System.out.println("===1ºProduto===\n");

  produto1.exibirDetalhes();


  Produto produto2 = new Produto("Alvejante Rex", 30.10);

  System.out.println("\n\n===2ºProduto===\n");

  produto2.exibirDetalhes();

    }
}