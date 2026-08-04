package AT02.Ex2;

public class ContaBancaria {
    String titular;
    int numConta;
    double saldo;

    public ContaBancaria(String titular, int numConta, double saldo) {
        this.titular = titular;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor < saldo) {
            saldo = saldo - valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else if (valor > saldo) {
            System.out.println("Valor insuficiente para realizar o saque!");
        } else {
            System.out.println("Valor de saque inválido!");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Número da conta: " + numConta);
        System.out.println("Saldo atual: " + saldo);
    }
}
