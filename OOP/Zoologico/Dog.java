public class Dog extends Animal {

    private String breed;

    public Dog(String name) {
        super(name);
    }

    public Dog(String name, int birthYear) {
        super(name, birthYear);
    }

    public Dog(String name, int birthYear, String breed) {
        super(name, birthYear);
        this.breed = breed;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void talk() {
        System.out.println("Woof woof!");
    }

    public void eat() {
        System.out.println("Crunch crunch");
    }

    public String toString() {
        return "Name: " + this.getName() + " | " + this.getAge() + " years old | Breed: " + this.getBreed();
    }
}
