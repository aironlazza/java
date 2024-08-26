package aula22.PolimorfismoOverride;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    Pessoa(String nome, String sobrenome, int idade){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    public String obterDados(){
        String retorno = "Nome: " + nome + sobrenome;
        retorno += "\nIdade: " + idade;
        return retorno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
