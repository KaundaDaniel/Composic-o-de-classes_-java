package composition;

public class Car {

    private int doors;
    private int seats;
    private Engine engine;
    private String name;
    private Wheal wheal;

    public Car(int doors, int seats, Engine engine, String name, Wheal wheal) {
        this.doors = doors;
        this.seats = seats;
        this.engine = engine;
        this.name = name;
        this.wheal = wheal;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wheal getWheal() {
        return wheal;
    }

    public void setWheal(Wheal wheal) {
        this.wheal = wheal;
    }
    
    
}
