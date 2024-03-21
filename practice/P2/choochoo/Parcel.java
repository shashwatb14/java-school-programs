package P2.choochoo;

public class Parcel
{

    private int trackingID;
    private double weight;
    public String destinationAddress; // Address destinationAddress
    public String originAddress;	  // Address originAddress

    public Parcel(int ID)
    {
        trackingID = ID;
        weight = 0;
    }

    public void setWeight(double newWeight)
    {
        weight = newWeight;
    }

    public double getWeight()
    {
        return weight;
    }
}
