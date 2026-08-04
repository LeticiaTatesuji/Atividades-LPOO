package AT02.Ex3;

public class MainVeiculo {
    static void main(String[] args) {
        Veiculo carro = new Veiculo(
                "Skyline R34",
                "Nissan");

        System.out.println("\n==== DADOS INICIAIS ====");
        carro.mostrarDados();

        System.out.println("\n==== ACELERANDO ====");
        carro.acelerar(150);
        carro.mostrarDados();

        System.out.println("\n==== FREAR ====");
        carro.frear(30);
        carro.mostrarDados();

        System.out.println("\n==== FRENAGEM MAIOR QUE A VEL ATUAL ====");
        carro.frear(160);
        carro.mostrarDados();
    }
}
