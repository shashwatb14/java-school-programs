package P2.choochoo;

public class Train
{

    private Engine[] mEngines;
    private Wagon[] mWagons;
    private int mEngineCount;
    private int mWagonCount;
    private int mTrainNumber;
    private double mWeight;

    public Train(int number)
    {
		//  Total weight in kilograms
        mTrainNumber = number;
        mEngines = new Engine[6]; // The train can have up to 6 engines
        mEngineCount = 0;
        mWagons = new Wagon[100]; // The train can have up to 100 wagons
        mWagonCount = 0;
        mWeight = 0;
    }

    public void addEngine(Engine newEngine)
    {
        mEngines[mEngineCount] = newEngine;
        mEngineCount++;
    }

    public Engine removeEngine()
    {
        mEngineCount--;
        return mEngines[mEngineCount];
    }

    public void addWagon(Wagon newWagon)
    {
        mWagons[mWagonCount] = newWagon;
        mWagonCount++;
    }

	public int getNumberOfWagons()
	{	return this.mWagonCount;
	}

    public Wagon removeWagon()
    {	// returns the number of wagons currently coupled to the train.
		if( this.getNumberOfWagons() > 0 )
		{	mWagonCount--;
			return mWagons[mWagonCount];
		}
		return null;
    }

    public double getWeight()
    {
        // Code to be written
    }
    // ...
}

