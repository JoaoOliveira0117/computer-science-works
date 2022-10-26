public class Circulo extends FormaBidimensional{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double obterArea() {
        double resultado = raio * Math.PI;
        return resultado;
    }
}
