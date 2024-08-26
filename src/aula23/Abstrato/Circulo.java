package aula23.Abstrato;

public class Circulo extends Figura{
    private double raio;

    public double getRaio() {
        return raio;
    }
    @Override
    public String getNomeFigura(){
        return "Círculo";
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea(){
        return raio*raio*Math.PI;
    }
    public double calculaPerimetro(){
        return 2 * Math.PI * raio;
    }
}
