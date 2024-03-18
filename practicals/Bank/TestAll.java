package Bank;

public class TestAll {
    private static void separator() {
        for(int i = 0; i < 105; i++)
            System.out.print("-");
        System.out.println();
    }
    public static void main(String[] args) {
        separator();
        Savings mySavingsAcc = new Savings("SA-1111", 5000, "pepeperez" );
        System.out.println("Expected output: ClientID: pepeperez  Acct: Savings  Number: SA-1111  Funds: $5,000.00");
        System.out.println(">>> Your output: " + mySavingsAcc);
        separator();
        System.out.println("Expected output: Withdrawing $5k -> Funds: false -> Deposit $2kFunds -> Funds? true");
        System.out.print(">>> Your output: ");
        System.out.print("Withdrawing $5k -> "); mySavingsAcc.withdraw(5000);
        System.out.print("Funds: " + mySavingsAcc.hasFunds() + " -> Deposit $2kFunds -> ");
        mySavingsAcc.deposit(2000); System.out.println("Funds? " + mySavingsAcc.hasFunds());
        separator();
        System.out.print("Expected output: ");
        System.out.println("Savings acct. interest rate(%) = 0.05 -> Interest for SA-1111 = $100.0");
        System.out.print(">>> Your output: ");
        System.out.print("Savings acct. interest rate(%) = " + Savings.INTEREST);
        System.out.println(" -> Interest for " + mySavingsAcc.getNumber() + " = $" + mySavingsAcc.calculateInterest());
        separator();
        Savings dodgy = new Savings("SA-1111", 5000000, "pepeperez" );
        Savings yourSavings = new Savings("SA-2222", 15000, "juanpavez" );
        System.out.println("Testing Savings account class equals method");
        System.out.print("Expected output: ");
        System.out.println("mySavingsAcc.equals(dodgy) = true; mySavingsAcc.equals(yourSavings) = false");
        System.out.print(">>> Your output: mySavingsAcc.equals(dodgy) = ");
        System.out.print(mySavingsAcc.equals(dodgy) + "; mySavingsAcc.equals(yourSavings) = ");
        System.out.println(mySavingsAcc.equals(yourSavings));

        separator();
        Current myCurrentAcc = new Current("CA-1234", 3500 );
        System.out.println("Expected output: Acct: Current  Number: CA-1234  Funds: $3,500.00  Overdraft penalty fee: $0.00");
        System.out.println(">>> Your output: " + myCurrentAcc);
        separator();
        System.out.println("Overdraft fee: $" + myCurrentAcc.getOverdraftFee() + "  Expected output: $300.0");
        myCurrentAcc.setOverdraftFee(875);
        System.out.println("Overdraft fee: $" + myCurrentAcc.getOverdraftFee() + "  Expected output: $875.0");
        separator();
        System.out.println("Expected output: Withdrawing $5k -> Funds: false -> Overdraft penalty fee: $2,375.00" );
        System.out.print(">>> Your output: ");
        System.out.print("Withdrawing $5k -> "); myCurrentAcc.withdraw(5000);
        System.out.println("Funds: " + myCurrentAcc.hasFunds() + " -> Overdraft penalty fee: " +
                String.format("$%,.2f", myCurrentAcc.getPenaltyFee()));
        Current dos = new Current("CA-5677", 50000);
        Current tres= new Current("CA-5677", 650000);
        System.out.println("Testing Current account class equals method");
        System.out.print("Expected output: ");
        System.out.println("dos.equals(tres) = true; myCurrentAcc.equals(dos) = false");
        System.out.print(">>> Your output: mySavingsAcc.equals(dodgy) = ");
        System.out.print(dos.equals(tres) + "; myCurrentAcc.equals(dos) = ");
        System.out.println(myCurrentAcc.equals(dos));

        separator();
        Term fixed = new Term("TA-9876", 25000, "ricardo_rojo");
        System.out.println("Expected output:\nClientID: ricardo_rojo  Acct: Term  Number: TA-9876  Funds: $25,000.00  Term: 6 months  Interest: 2.70%");
        System.out.println(">>>>Your output:");
        System.out.println(fixed);
        System.out.println("Expected output: Calculated interest earned -> $337.50");
        System.out.printf(">>> Your output: Calculated interest earned -> $%,.2f\n", fixed.calculateInterest() );
        separator();
        System.out.println("Expected output: Extending to 12 months and doubling interest rate -> 12 months @ 5.40");
        fixed.setTermMonths(fixed.getTermMonths() * 2); fixed.setInterestRate( fixed.getInterestRate() *2 );
        System.out.printf(">>> Your output: Extending to 12 months and doubling interest rate -> %d months @ %.2f\n",
                fixed.getTermMonths(), fixed.getInterestRate());
        System.out.println("Expected output: Calculated interest earned -> $1,350.00");
        System.out.printf(">>> Your output: Calculated interest earned -> $%,.2f\n", fixed.calculateInterest() );
        separator();
        Term t2 = new Term("TA-9876", 425000, "ricardo_rojo", 12,5.7 );
        Term t3= new Term("TA-6767", 650000, "jose_diaz");
        System.out.println("Testing Term account class equals method");
        System.out.println("Expected output: fixed.equals(t3) = true; fixed.equals(t3) = false");
        System.out.println(">>> Your output: fixed.equals(t3) = " + fixed.equals(t2) +
                "; fixed.equals(t3) = " + fixed.equals(t3));
        System.out.println("Good luck :]");
    }
}
