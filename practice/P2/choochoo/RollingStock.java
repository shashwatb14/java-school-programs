package P2.choochoo;

public class RollingStock
{

    private int mIDNumber;
    private double mWeight;

    public RollingStock(int ID, double weight)
    {
        mIDNumber = ID;
        mWeight = weight;  // Weight is in kilograms
    }
    // Accessor methods
    public double getWeight()
    {
        return mWeight;
    }

    public int getID()
    {
        return mIDNumber;
    }
    // ...
    // Other methods
    //...
}
