package inheritance_Heranca;

public class Professor extends Pessoa {

    private String disciplina;

    public Professor(String nome, String sobreNome, int idade, String disciplina) {
        super(nome, sobreNome, idade);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Professor(String disciplina, String nome, String sobrenome, int idade) {
        super(nome, sobrenome, idade);
        this.disciplina = disciplina;
    }
    

}
