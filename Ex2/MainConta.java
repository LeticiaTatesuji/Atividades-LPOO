package Ex2;

public class MainConta {
    static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(
                "Letícia",
                1234560,
                1000.00);

        conta.mostrarSaldo();

        System.out.println("\n==== REALIZANDO DEPÓSITO ====");
        conta.depositar(2000.0);
        conta.mostrarSaldo();

        System.out.println("\n==== REALIZANDO SAQUE ====");
        conta.sacar(500.0);
        conta.mostrarSaldo();

        System.out.println("\n==== SAQUE MAIOR QUE O SALDO ====");
        conta.sacar(5000);
        conta.mostrarSaldo();

    }
}
