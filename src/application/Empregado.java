package application;

public class Empregado {

    private String nome;
    private String sobreNome;
    private String bI;

    public Empregado(String nome, String sobreNome, String bI) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.bI = bI;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getBi() {
        return bI;
    }

    public void setBi(String bI) {
        this.bI = bI;
    }
    public boolean mostraDepartamento(){
        System.out.println("O seu Departamento é: ");
        return true;
    }
    
    public void toString1(){
        System.out.println("Nome: "+ getNome());
        System.out.println("Sobe Nome: "+ getSobreNome());
        System.out.println("Número de B.I: "+ getBi());
    }
}
