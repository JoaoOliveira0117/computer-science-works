import java.util.ArrayList;

public class Comparar {

    public static void programaPeloMesmoTempo(Programador func1, Programador func2) {
        ArrayList<Linguagem> func1Linguagem = func1.getLinguagens();
        ArrayList<Linguagem> func2Linguagem = func2.getLinguagens();

        for(int i = 0; i < func1Linguagem.size(); i++) {
            for(int j = 0; j < func2Linguagem.size(); j++) {
                Linguagem func1L = func1Linguagem.get(i);
                Linguagem func2L = func2Linguagem.get(j);

                if(func1L.getNome().equals(func2L.getNome())){
                    System.out.println(func1L.getExperiencia() == func2L.getExperiencia());
                }
            }
        }
    }
}
