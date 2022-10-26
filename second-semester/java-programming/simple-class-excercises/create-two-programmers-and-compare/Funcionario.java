public class Funcionario {
    private String nome;
    private String sobrenome;
    private String area;

    public Funcionario(String nome, String sobrenome, String area){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.area = area;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getArea() {
        return area;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public void setArea(String area) {
        this.area = area;
    }

}
