/*
 * Pr 1.6
 */

public class C1P6 {
	public static void main(String [] args) {	
		int end = IBIO.inputInt("Enter end number: ");
        int num1 = 0;
        int num2 = 1;
        int num3 = num1 + num2;
        System.out.println(num1);
        System.out.println(num2);


        for (int i = 0; i < end - 2; i++) {
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
            num3 = num1 + num2;
        }
	}
}
