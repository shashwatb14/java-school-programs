    public class RabbitTest {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("idk", 2012, "White");
        System.out.println(rabbit);
        System.out.println(rabbit.getBirthYear());
        rabbit.talk();
        rabbit.eat();
    }
}
