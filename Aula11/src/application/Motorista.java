package application;

public class Motorista extends Empregado {

    private String tipoDeCarta;

    public Motorista(String nome, String sobreNome, String bI, String tipoDeCarta) {
        super(nome, sobreNome, bI);
        this.tipoDeCarta = tipoDeCarta;
    }

    public String getTipoDeCarta() {
        return tipoDeCarta;
    }

    public void setTipoDeCarta(String tipoDeCarta) {
        this.tipoDeCarta = tipoDeCarta;
    }

    @Override
    public String toString() {
        System.out.println("O tipo de carta é " + getTipoDeCarta());
        return super.toString();
    }

    @Override
    public boolean mostraDepartamento() {
        return super.mostraDepartamento();
    }

}
