package aula22.PolimorfismoOverride;

public class Aluno extends Pessoa{
    private int matricula;
    Aluno(String nome, String sobrenome, int idade, int matricula){
        super(nome,sobrenome,idade);
        this.matricula = matricula;
    }
    @Override //sobrescreve o método da superclasse Pessoa
    public String obterDados(){
        String retorno = "Nome: " + getNome() + " " + getSobrenome();
        retorno += "\nIdade: " + getIdade();
        retorno += "\nMatrícula: " + getMatricula();
        return retorno;
    }
    @Override //sobrescreve o método da superclasse Object
    public String toString(){
        String retorno = "Nome: " + getNome() + " " + getSobrenome();
        retorno += "\nIdade: " + getIdade();
        retorno += "\nMatrícula: " + getMatricula();
        return retorno;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

}
