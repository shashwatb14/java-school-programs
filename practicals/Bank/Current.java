package Bank;

public class Current extends Account {

    private double penaltyFee;
    private double overdraftFee;

    public Current(String number, double funds) {
        super(number, funds);
        this.overdraftFee = 300; // hard-coded
    }

    public double getOverdraftFee() {
        return this.overdraftFee;
    }

    public void setOverdraftFee(double overdraftFee) {
        this.overdraftFee = overdraftFee;
    }

    public double getPenaltyFee() {
        return this.penaltyFee;
    }

    public void setPenaltyFee(double penaltyFee) {
        this.penaltyFee = penaltyFee;
    }

    @Override
    public void withdraw(double money) {
        this.penaltyFee = Math.abs(this.getFunds() - money) + this.overdraftFee;
        this.setFunds(0);
    }

    @Override
    public double calculateInterest() {
        return 0;
    }

    public boolean equals(Current account) {
        return this.getNumber() == account.getNumber();
    }

    public String toString() {
        return super.toString() + "  Overdraft penalty fee: $" + this.penaltyFee;
    }
}
