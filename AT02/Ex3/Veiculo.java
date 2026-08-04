package AT02.Ex3;

public class Veiculo {
    String modelo;
    String marca;
    int velocidadeAtual;

    public Veiculo(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
        this.velocidadeAtual = 0;
    }

    public void acelerar(int valor) {
        if (valor > 0) {
            velocidadeAtual = velocidadeAtual + valor;
            System.out.println("Aceleração de " + valor + "km/h");
        } else {
            System.out.println("Valor de aceleração inválida");
        }
    }

    public void frear(int valor) {
        if (velocidadeAtual - valor > 0) {
            velocidadeAtual = velocidadeAtual - valor;
            System.out.println("Frenagem de " + valor + "km/h");
        } else {
            velocidadeAtual = 0;
            System.out.println("Velocidade ajustada para 0km/h. A velocidade não pode ser negativa");
        }
    }

    public void mostrarDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade atual: " + velocidadeAtual + "km/h");
    }
}
