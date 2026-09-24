package Banco;

public class Conta {
    private int numero;
    private double saldo;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saque inválido!");
            return false;
        }
    }

    public void setNumero(int numero) {
        if (String.valueOf(Math.abs(numero)).length() == 8) {
            this.numero = numero;
            System.out.println("Funciona!");
        } else {
            System.out.println("Número Inválido!! (permitido apenas 8 caracteres)");
        }

    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void consultarNumero() {
        System.out.println(numero);
    }

    public void definirNumero(int num) {
        numero = num;
    }
}
