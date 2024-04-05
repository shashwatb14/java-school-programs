public class Rabbit extends Animal {

    private String hideColour;

    public Rabbit(String name, int birthYear, String hideColor) {
        super(name, birthYear); // calls Animal's constructor
        this.hideColour = hideColor;
    }

    public Rabbit(String name, String hideColour) {
        super(name);
        this.hideColour = hideColour;
    }

    public String getHideColour() {
        return this.hideColour;
    }

    public void setHideColour(String hideColour) {
        this.hideColour = hideColour;
    }

    public void talk() {
        System.out.println("Squeak squeak");
    }

    public void eat() {
        System.out.println("Nibble nibble");
    }

    public String toString() {
        return super.toString() + " | Hide color: " + this.hideColour;
    }
}
