package aula20.Heranca;

public class Engenheiro extends Funcionario{
    private int crea;
    public Engenheiro(String nome, String sobrenome, int matricula){ //CONSTRUTOR
        super(nome,sobrenome,matricula);
    }
    public int getCrea(){
        return crea;
    }
    public void setCrea(int crea){
        this.crea = crea;
    }
}
