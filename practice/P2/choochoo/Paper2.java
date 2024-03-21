package P2.choochoo;

public class Paper2
{

	public static void main (String[] args)
	{
		Train A = new Train(123);
		Engine B = new Engine(7);
		A.addEngine(B);
		Wagon C = new Wagon(23);
		A.addWagon(C);
		Wagon D = new Wagon(66);
		A.addWagon(D);
		Wagon E = new Wagon(71);
		A.addWagon(E);
		A.addEngine(new Engine(9));

	}
}

