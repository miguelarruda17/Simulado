package org.example.ativ4;

public class ContaCorrente {
    private int numeroConta;
    private double saldo;

    public ContaCorrente(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Depósito de R$:"+valor+" realizado.");
        }
        else{
            System.out.println("Valor inválido para depósito");
        }
    }
    public void sacar(double valor){
        if (valor > 0.0 && valor <= this.saldo){
            this.saldo -= valor;
            System.out.println("Saque de R$:" +valor);;
        }
        else {
            System.out.println("Saque inválido");
        }
    }

}