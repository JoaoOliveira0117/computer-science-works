public class Esfera extends FormaTridimensional{
    private double raio;
    
    public Esfera(double raio){
        this.raio = raio;
    }

    public double obterArea() {
        double resultado = (4 * Math.PI) * (Math.pow(raio, 2));
        return resultado;
    }

    public double obterVolume() {
        double resultado = ((4/3) * Math.PI) * (Math.pow(raio, 3));
        return resultado;
    }
}
