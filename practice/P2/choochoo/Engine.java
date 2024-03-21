package P2.choochoo;

public class Engine extends RollingStock
{

    private double mPullingWeight;  // maximum weight engine can pull

    public Engine(int ID)
    {
        super(ID, 120000);         // Engines weigh 120000 kilograms
        mPullingWeight = 1400000;  // Engines can pull 1400000 kilograms
    }
    // Accessor methods
    public double getWeight()
    {
        return super.getWeight();
    }
    //...
    // Other methods
    //...
}
