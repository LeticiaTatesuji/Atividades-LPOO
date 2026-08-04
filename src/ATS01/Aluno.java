package ATS01;

//classe aluno
public class Aluno {
    //variáveis globais
    String nome;
    String curso;
    int idade;

    //método
    public Aluno(String nome, String curso, int idade) { //variáveis dentro do parâmetro é local
        //this pega o valor desta classe
        this.nome = nome;
        this.curso = curso;
        this.idade = idade;
    }

    public void apresentarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Idade: " + idade);
    }

    //validação da maioridade
    public boolean verificarMaiorIdade() {
        return idade >= 18;
    }
}
