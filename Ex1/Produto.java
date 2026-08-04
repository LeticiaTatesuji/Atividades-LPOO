package Ex1;

public class Produto {
    String nome;
    double preco;
    int qtdeEstoque;

    public Produto(String nome, double preco, int qtdeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdeEstoque = qtdeEstoque;
    }

    public void apresentarProduto() {
        System.out.println("\nNome do produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em estoque: " + qtdeEstoque);
    }
}
