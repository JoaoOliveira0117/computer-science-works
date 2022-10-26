public class Linguagem {
    private String nome;
    private int experiencia;
    private int preferencia;

    public Linguagem(String nome, int exp, int pref){
        this.nome = nome;
        experiencia = exp;
        preferencia = pref;
    }

    public String getNome() {
        return nome;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public int getPreferencia() {
        return preferencia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setExperiencia(int exp) {
        experiencia = exp;
    }

    public void setPreferencia(int pref) {
        preferencia = pref;
    }
}
