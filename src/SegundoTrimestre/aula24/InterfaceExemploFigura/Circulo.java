package SegundoTrimestre.aula24.InterfaceExemploFigura;

public class Circulo implements Figura{
    double raio;
    public Circulo(double r){
        raio = r;
    }
    @Override
    public double calculaArea() {
        return raio*raio*Math.PI;
    }

    @Override
    public double calculaPerimetro() {
        return 2*raio*Math.PI;
    }

    @Override
    public String getNomeFigura() {
        return "Círculo";
    }
    @Override
    public String toString(){
        return "dados da figura:" + "\nnome: " + getNomeFigura() + "\nárea: " +
                String.format("%.2f",calculaArea()) + "\nPerímetro: " + String.format("%.2f",calculaPerimetro());
    }
}
