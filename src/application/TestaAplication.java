
package application;


public class TestaAplication {
    public static void main(String[] args) {
        Ceo ceo= new Ceo("Lula", "Gustavo", "00gh939393", 45678.999);
        Programador programador= new Programador("Yander", "da Silva", "0056la098", "Java");
        programador.toString1();
        System.out.println("------------------");
        ceo.toString1();
    }
    
}
