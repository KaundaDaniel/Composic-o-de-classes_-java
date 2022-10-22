package inheritance_Heranca;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private int idade;
 //Construtor
    public Pessoa(String nome, String sobrenome, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }
//Segundo Construtor
   /* public Pessoa() {

    }*/
    //modificadores de acesso

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobnome) {
        this.sobrenome = sobnome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    

}
