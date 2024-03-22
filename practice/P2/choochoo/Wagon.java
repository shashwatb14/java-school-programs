package P2.choochoo;

import java.util.Stack;

public class Wagon extends RollingStock
{

    public Stack<Parcel> mParcels = new Stack<>();
    private int mParcelCount;
    private Wagon next;

    public Wagon getNextWagon() {
        return next;
    }

    public void setNextWagon(Wagon wagon) {
        this.next = wagon;
    }

    public Wagon(int ID)
    {
        super(ID, 32000);           // Empty wagon weighs 32000 kilograms
        // mParcels = new Parcel[100];
        mParcelCount = 0;
    }
    // Accessor methods
    public int getWagonID()
    {
        return this.getID();
    }

    public double getWeight()
    {
        double weight = super.getWeight();
        
        /*for (int i = 0; i < mParcelCount; i++) {
            weight += mParcels[i].getWeight();
        }*/

        Stack<Parcel> temp = new Stack<>();
        temp.addAll(mParcels);

        while (!temp.isEmpty()) {
            weight += temp.pop().getWeight();
        }
        return weight;
    }

    public void addParcel(Parcel parcel) {
        mParcels.push(parcel);
        mParcelCount++;
    }

    public Parcel getParcel() {
        mParcelCount--;
        return mParcels.pop();
    }
    //...
    // Other methods
    //...
}
