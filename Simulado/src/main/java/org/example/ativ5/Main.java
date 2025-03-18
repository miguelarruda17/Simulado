package org.example.ativ5;

import org.example.ativ1.Pessoa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Maya", 18);

        System.out.println("Nome: " + pessoa.getNome());

        System.out.println("Idade: " + pessoa.getIdade());
    }
}