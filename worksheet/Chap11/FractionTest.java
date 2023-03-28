/*
 * Ch 11
 */

public class FractionTest {
    public static void main(String[] args) {
        
        // Pr 11.4
        try {
            Fraction f = new Fraction(); // create a fraction
            f.enter();
            System.out.println(f); // print itself

            Fraction a = new Fraction();
            a.enter(); // get the first fraction
            Fraction b = new Fraction();
            b.enter(); // get the second one
            Fraction c = new Fraction();
            c = a.add(b); // add b to a and put result into c
            System.out.println(c);

            Fraction d = new Fraction();
            d.enter(); // get the fraction
            System.out.println(d); // print it
            double x = d.toDecimal();
            System.out.println(d + " in decimals = " + x);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
