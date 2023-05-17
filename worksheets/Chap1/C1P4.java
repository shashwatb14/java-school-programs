/*
 * Pr 1.4
 */

public class C1P4 {
	public static void main(String [] args) {	
		int num = 1;
		for (int i = 2; i < 102; num += i, i++) {
			System.out.println(num);
		}
	}
}
