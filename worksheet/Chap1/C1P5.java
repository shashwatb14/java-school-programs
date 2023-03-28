/*
 * Pr 1.5
 */

public class C1P5 {
	public static void main(String [] args) {	
		for (int i = 0; i < 20; i++) {
			int num = 1;
			for (int j = 0; j < i; j++) {
				num *= 2;
			}
			System.out.println(num);
		}
	}
}
