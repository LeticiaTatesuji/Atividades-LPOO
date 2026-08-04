public class MainProduto {
    static void main(String[] args) {
        Produto produto1 = new Produto("Morango",
                12.90,
                30);

        Produto produto2 = new Produto("Uva",
                15.99,
                40);

        produto1.apresentarProduto();
        produto2.apresentarProduto();

    }
}
