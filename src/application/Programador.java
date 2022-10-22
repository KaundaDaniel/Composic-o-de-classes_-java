package application;

public class Programador extends Empregado {

    private String linguagem;

    //Construtor
    public Programador(String nome, String sobreNome, String bI, String linguagem) {
        super(nome, sobreNome, bI);
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }

    @Override
    public boolean mostraDepartamento() {
        return super.mostraDepartamento();
    }

    @Override
    public void toString1() {
        
        super.toString1(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Linguagem de Programação: " + getLinguagem());
    }

    

}
