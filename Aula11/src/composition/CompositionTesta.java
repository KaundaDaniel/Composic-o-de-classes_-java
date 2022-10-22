package composition;

public class CompositionTesta {

    public static void main(String[] args) {
        Engine engine = new Engine("WV", 4, "V1");
        Wheal wheal = new Wheal("Black", 12, "Violeta");

        Car car = new Car(4, 5, engine, "Mazda", wheal);
        System.out.println("Name of Car: "+car.getName());
        System.out.println("Name of Motor: "+engine.getName());
        System.out.println("Name of Wheal: "+wheal.getName());
        
       ;
       //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
    }

}
