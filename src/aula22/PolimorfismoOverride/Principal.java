package aula22.PolimorfismoOverride;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Pedro", "Silva", 22);
        System.out.println(p1); // vai procurar o método "toString" da classe
        // nesse caso, o comportamento padrão é exibir o endereço de memória da instância
        Aluno a1 = new Aluno("Airon", "Lazzaretti", 18, 1234);
        System.out.println(a1); //toString foi sobrescrito nesta classe
    }
}
