package Bank;

public class Term extends Savings {
    private int termMonths;
    private double interestRate;

    public Term(String number, double funds, String clientID) {
        super(number, funds, clientID);
        this.termMonths = 6;
        this.interestRate = 2.7;
    }

    public Term(String number, double funds, String clientID, int termMonths, double interestRate) {
        super(number, funds, clientID);
        this.interestRate = interestRate;
        this.termMonths = termMonths;
    }

    public int getTermMonths() {
        return this.termMonths;
    }

    public void setTermMonths(int termMonths) {
        this.termMonths = termMonths;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return (this.getFunds() * interestRate * termMonths) / 1200;
    }

    public String toString() {
        return super.toString() + "  Term: " + this.termMonths + " months  Interest: " + this.interestRate + "0%";
    }
}
