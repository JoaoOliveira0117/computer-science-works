public class Main {
    public static void main(String args[]) {
        // não consegui pensar em nada para aplicar sobrecarga ou sobreposição 🤔
        // embora eu tenha entendido
        Circulo circulo = new Circulo(2);
        Cubo cubo = new Cubo(4);
        Esfera esfera = new Esfera(2);
        Quadrado quad = new Quadrado(4);
        Tetraedro tetra = new Tetraedro(6);
        Triangulo trian = new Triangulo(2, 4);
        Forma[] formas = {circulo, cubo, esfera, quad, tetra, trian};

        for (Forma forma : formas) {
            if ( forma instanceof FormaBidimensional) {
                System.out.println(forma.getClass() + " é do tipo Bidimensional e sua área é: " + forma.obterArea());
            } else {
                System.out.println(forma.getClass() + " é do tipo Tridimensional e sua área e volume respectivamente são: " 
                    + forma.obterArea() + " e " + forma.obterVolume());
            }

        }
    }
}
