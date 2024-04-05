public class FishTest {

    public static void main(String[] args) {
        Fish nemo = new Fish("Nemo", 1977, 'Y');
        System.out.println(nemo);
        nemo.setSeaWater('N');
        System.out.println(nemo);
        nemo.setSeaWater(true);
        System.out.println(nemo);
        nemo.talk();
        nemo.eat();

        Fish cartman = new Fish("Cartman", 1990, false);
        System.out.println(cartman);
        cartman.talk();
        cartman.eat();
    }
}
