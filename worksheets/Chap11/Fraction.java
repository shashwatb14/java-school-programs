/*
 * Ch 11
 */

import java.util.Scanner;

public class Fraction {

    // the attributes/fields for the fraction
    private int num;
    private int den;

    // constructor that creates a fraction
    Fraction(int num, int den) {
        this.num = num;
        this.den = den;
        this.simplify();
    }

    // overloaded constructor to give default values
    Fraction() {
        num = 0;
        den = 1;
    }

    // to give a string representation of the object
    public String toString() {
        String result = "";
        if (den == 1)
            result += num;
        else
            result += num + "/" + den;
        return result;
    }

    public void enter() throws Exception {
        String strFraction = IBIO.input("Enter fraction (a/b format): ");
        strFraction = strFraction.replace("/", " "); // changes slash to space
        Scanner parse = new Scanner(strFraction); // to parse fraction

        // extract numerator and denominator
        this.num = parse.nextInt();
        this.den = parse.nextInt();
        
        // Pr 11.4
        if (this.den <= 0)
            throw new Exception("Denominator must be greater than 0");

        this.simplify(); // simplifies the fraction object
    }

    // Pr 11.1
    public Fraction add(Fraction frac) {
        Fraction result = new Fraction();
        result.num = (this.num * frac.den) + (this.den * frac.num);
        result.den = this.den * frac.den;
        result.simplify();
        return result;
    }

    // Pr 11.2
    private static int gcd(int num, int den) {
        if (num <= 0)
            return 1;

        while (num != den) {
            if (num > den)
                num -= den;
            else
                den -= num;
        }
        return num;
    }

    // Pr 11.2
    private void simplify() {
        int div = gcd(this.num, this.den);
        this.num /= div;
        this.den /= div;
    }

    // Pr 11.3
    public double toDecimal() {
        return (double) this.num / this.den;
    }
}
