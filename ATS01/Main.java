package ATS01;

public class Main {
    static void main(String[] args) {
        Aluno aluno1 = new Aluno(
                "Letícia",
                "Ciência da Computação",
                20
        );
        aluno1.apresentarDados();

        if (aluno1.verificarMaiorIdade()) {
            System.out.println("O aluno é maior de idade!");
        } else {
            System.out.println("O aluno é menor de idade!");
        }
    }
}