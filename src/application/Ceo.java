package application;

public class Ceo extends Empregado {
    private double salario;

    public Ceo(String nome, String sobreNome, String bI, double salario) {
        super(nome, sobreNome, bI);
        this.salario=salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    

    @Override
    public void toString1() {
        System.out.println("O seu salario é " +getSalario());
         super.toString1(); 
    }

    @Override
    public boolean mostraDepartamento() {
        return super.mostraDepartamento(); 
    }

}
