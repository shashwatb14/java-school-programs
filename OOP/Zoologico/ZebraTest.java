public class ZebraTest {
    public static void main(String[] args) {
        Zebra zebra = new Zebra("Stripey", 2012, "Savannah");
        System.out.println(zebra);
        System.out.println(zebra.getName() + " born on " + zebra.getBirthYear());
        zebra.setHabitat("Grasslands");
        System.out.println(zebra.getHabitat());
        zebra.talk();
        zebra.eat();
    }
}
