package aula20.Heranca;

public class Testes {
    public static void main(String[] args) {
        Motorista m1 = new Motorista("Sandro","Borges",123);
//        m1.setNome("Sandro");
//        m1.setSobrenome("Borges");
//        m1.setMatricula(123);
        m1.setCnh("oieee");
        System.out.println("O nome do novo motorista é " + m1.getNome() + " " + m1.getSobrenome());
        Engenheiro e1 = new Engenheiro("Claudecir","Mbappe",124);
//        e1.setNome("Claudecir");
//        e1.setSobrenome("Mbappe");
//        e1.setMatricula(124);
        e1.setCrea(4444);
        System.out.println("O nome do novo engenheiro é " + e1.getNome() + " " + e1.getSobrenome());
    }
}
