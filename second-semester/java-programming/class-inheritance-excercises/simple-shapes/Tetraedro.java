public class Tetraedro extends FormaTridimensional{
    private double aresta;

    public Tetraedro(double aresta){
        this.aresta = aresta;
    }

    public double obterArea() {
        double resultado = (aresta * aresta) * Math.sqrt(3);
        return resultado;
    }

    public double obterVolume() {
        double resultado = (Math.pow(aresta, 3) * Math.sqrt(2)) / 12;
        return resultado;
    }
}
