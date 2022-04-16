public class Pessoa {
    String nome;
    int idade;
    Endereco endereco;

    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public void status() {
        System.out.println("Pessoa [endereco=" + endereco + ", idade=" + idade + ", nome=" + nome + "]");
    }

}
