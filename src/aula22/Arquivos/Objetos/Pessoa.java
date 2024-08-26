package aula22.Arquivos.Objetos;

import java.io.Serializable;

public class Pessoa implements Serializable {
    private String nome;
    private String sobrenome;
    private int idade;
    @Override
    public String toString(){
        return "Nome: " + nome + " " + sobrenome + "\n Idade: " + idade;
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
