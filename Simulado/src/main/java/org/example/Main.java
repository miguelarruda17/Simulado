package org.example;

import org.example.ativ6.Aluno;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        org.example.ativ6.Aluno aluno = new Aluno("Kayn",7.6, 6.7);

        System.out.println("Media de " + aluno.getNome() + ": " + aluno.calcularMedia());

    }
}