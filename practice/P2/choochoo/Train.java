package P2.choochoo;

public class Train
{

    private Engine[] mEngines;
    private Wagon firstWagon;
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
        // mWagons = new Wagon[100]; // The train can have up to 100 wagons
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
        newWagon.setNextWagon(firstWagon);
        firstWagon = newWagon;
        mWagonCount++;
    }

    // returns the number of wagons currently coupled to the train.
	public int getNumberOfWagons()
	{	return this.mWagonCount;
	}

    public Wagon removeWagon(int ID)
    {	
		/*if( this.getNumberOfWagons() > 0 )
        {   mWagonCount--;
			return mWagons[mWagonCount];
		}
		return null;*/

        Wagon prevWagon = firstWagon;
        Wagon currentWagon = firstWagon.getNextWagon();
        Wagon toReturn = null;
        while (currentWagon != null) {
            if (currentWagon.getWagonID() == ID) {
                toReturn = currentWagon;
                prevWagon.setNextWagon(currentWagon.getNextWagon());
            }
            currentWagon = currentWagon.getNextWagon();
        }

        return toReturn;
    }

    public double getWeight()
    {
        double weight = 0;
        for (int i = 0; i < mEngineCount; i++) {
            weight += mEngines[i].getWeight();
        }
        /*for (int i = 0; i < mWagonCount; i++) {
            weight += mWagons[i].getWeight();
        }*/

        Wagon tempWagon = firstWagon;
        while (tempWagon != null) {
            weight += tempWagon.getWeight();
            tempWagon = tempWagon.getNextWagon();
        }

        return weight;
    }
    // ...
}

