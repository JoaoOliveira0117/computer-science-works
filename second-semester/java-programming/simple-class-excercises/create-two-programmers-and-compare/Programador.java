import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Programador extends Funcionario {
    private ArrayList<Linguagem> linguagens;

    public Programador(String nome, String sobrenome){
        super(nome, sobrenome, "Programador");
    }

    public Programador(String nome, String sobrenome, ArrayList<Linguagem> linguagens){
        super(nome, sobrenome, "Programador");
        this.linguagens = linguagens;
    }

    public ArrayList<Linguagem> getLinguagens() {
        return linguagens;
    }

    public void setLinguagens(ArrayList<Linguagem> linguagens) {
        this.linguagens = linguagens;
        Collections.sort(this.linguagens, Comparator.comparing(Linguagem::getExperiencia));
    }
}
