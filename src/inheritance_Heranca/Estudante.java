package inheritance_Heranca;

/**
 *
 * @author kaunda-daniel
 */
public class Estudante extends Pessoa {

    private String turma;

    public Estudante(String nome, String sobreNome ,int idade, String turma) {
        super(nome, sobreNome, idade );
        this.turma=turma;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
    
    public String ler(String tituloLivro ){
        System.out.println("Boa Leitura");
        return tituloLivro;
    }

}
