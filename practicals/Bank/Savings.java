package Bank;

public class Savings extends Account {
    private String clientID;
    public final static double INTEREST = 0.05;

    public Savings(String number, double funds, String clientID) {
        super(number, funds);
        this.clientID = clientID;
    }

    public String getClientID() {
        return this.clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    @Override
    public double calculateInterest() {
        return getFunds() * INTEREST;
    }

    public boolean equals(Savings account) {
        return this.clientID == account.clientID && this.getNumber() == account.getNumber();
    }

    public String toString() {
        return "ClientID: " + this.clientID + "  " +  super.toString();
    }
}
