package aula23.Abstrato;

public class Teste {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        c1.setRaio(3);
        System.out.println("Este " + c1.getNomeFigura() + " possui");
        System.out.println("Área: " + String.format("%.2f",c1.calculaArea()));
        System.out.println("Perímetro: " + String.format("%.2f",c1.calculaPerimetro()));
        Retangulo r1 = new Retangulo();
        r1.setAltura(10);
        r1.setBase(3);
        System.out.println("Este " + c1.getNomeFigura() + " possui");

    }
}
