package org.example.ativ4;

public class Main {
    public static void main(String[] args) {
        ContaCorrente minhaCC = new ContaCorrente(2,250.0);

        minhaCC.depositar(695.0);
        System.out.println("Saldo atual R$:" +minhaCC.getSaldo());

        minhaCC.sacar(250);
        System.out.println("Saldo Atual R$:" +minhaCC.getSaldo());
    }
}