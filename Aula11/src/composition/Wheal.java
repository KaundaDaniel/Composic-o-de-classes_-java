package composition;

public class Wheal {

    private String colour;
    private int inch;
    private String name;

    public Wheal(String colour, int inch, String name) {
        this.colour = colour;
        this.inch = inch;
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
