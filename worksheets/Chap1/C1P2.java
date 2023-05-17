/*
 * Pr 1.2
 */

public class C1P2 {
	public static void main(String [] args) {
		int step = IBIO.inputInt("Enter step: ");
		int start = IBIO.inputInt("Enter start: ");
		int increment = IBIO.inputInt("Enter increment: ");
		
		for (int i = 0; i < step; i++, start += increment) {
			System.out.println(start);
		}
	}
}
