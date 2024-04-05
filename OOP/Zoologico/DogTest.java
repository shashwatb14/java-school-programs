public class DogTest {
    public static void main(String[] args) {
        Dog neo = new Dog("Neo", 2012, "Poodle");
        System.out.println(neo);
        neo.setBirthYear(2015);
        neo.setBreed("Shih Tzu");
        System.out.println(neo.getName() + " is a " + neo.getBreed() + " who was born on " + neo.getBirthYear());
        neo.talk();
        neo.eat();
    }
}
