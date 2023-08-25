public class Zebra extends Animal {

    private String habitat;

    public Zebra(String name, int birthYear, String habitat) {
        super(name, birthYear);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return this.habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void talk() {
        System.out.println(this.getName() + " goes Bray Bray.");
    }

    public void eat() {
        System.out.println(this.getName() + " eats Chomp Chomp.");
    }

    public String toString() {
        return super.toString() + " | Habitat: " + habitat;
    }
}
