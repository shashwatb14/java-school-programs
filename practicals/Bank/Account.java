package Bank;

public abstract class Account
{
    private String number;
    private double funds;

    public Account(String number, double funds)
    {
        this.number = number;
        this.funds = funds;
    }

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public double getFunds()
    {
        return funds;
    }

    public void setFunds(double funds)
    {
        this.funds = funds;
    }

    public boolean equals(Account account)
    {
        return this.number == account.number;
    }

    public void deposit(double money)
    {
        this.setFunds( this.getFunds() + money );
    }

    public void withdraw(double money)
    {
        if( this.hasFunds() )
        {
            this.setFunds(this.getFunds() - money);
        } else
        {
            System.out.println("Not enough funds");
        }
    }

    public boolean hasFunds()
    {
        return this.getFunds() > 0;
    }

    public abstract double calculateInterest();

    @Override
    public String toString()
    {
        return "Acct: " + this.getClass().getSimpleName() +
                "  Number: " + number +
                "  Funds: " + String.format("$%,.2f", funds);
    }
}
