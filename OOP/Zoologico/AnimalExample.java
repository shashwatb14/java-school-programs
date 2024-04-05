public class AnimalExample {

    public static void main(String[] args) {
        // `new` calls the constructor and instantiates the object
        // parameters initialize object's attributes
        Animal ahMeng = new Animal("Ah Meng", 1990);
        System.out.println(ahMeng); // default output: Animal@6d03e736
        System.out.println(ahMeng.getName() + " was born in " + ahMeng.getBirthYear());
        ahMeng.setName("Bob"); // setter allows us to modify attributes
        System.out.printf("Name: %10s\nBirth year: %d\n", ahMeng.getName(), ahMeng.getBirthYear());
        ahMeng.talk();
        ahMeng.eat();
    }
}
