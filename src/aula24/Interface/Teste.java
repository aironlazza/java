package aula24.Interface;

public class Teste {
    public static void main(String[] args) {
        Vetor v1 = new Vetor();
        System.out.println("Vetor:");
        v1.adiciona("a");
        v1.adiciona("b");
        v1.adiciona("oi");
        System.out.println(v1);
        v1.remove();
        System.out.println(v1);

        Fila f1 = new Fila();
        System.out.println("\nFila:");
        f1.adiciona("a");
        f1.adiciona("b");
        f1.adiciona("oi");
        System.out.println(f1);
        f1.remove();
        System.out.println(f1);

        //para criar uma instância de uma interface, usa-se o construtor de uma classe que a implemente
        Lista l1 = new Vetor();
        //Nessa instância, só estarão disponíveis os métodos comuns entre a interface e a classe, e vão possuir
        //o comportamento dos métodos na classe;
    }
}
