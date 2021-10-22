package Chapter02;

import Chapter01.CreditCard;

public class PredatoryCreditCard extends CreditCard{
    // Additional instance variable
    private double apr;  // annual percentage rate

    // Constructor for this class
    public PredatoryCreditCard(String cust, String bk, String acnt, int lim, double initialBal, double rate){
        super(cust, bk, acnt, lim, initialBal);
        apr = rate;
    }

    // A new method for accessing monthly interest charges
    public void processMonth(){
        if (balance > 0){
            double monthlyFactor = Math.pow(1 + apr, 1.0/12);
            balance *= monthlyFactor;
        }
    }

    // Overriding the charge method defined in the superclass
    public boolean charge(double price){
        boolean isSuccess = super.charge(price);
        if (!isSuccess)
            balance += 5;
        return isSuccess;
    }

    // main method
    public static void main(String[] args){
        PredatoryCreditCard card1 = new PredatoryCreditCard("Xingchen", "Chase", "1234 1234 1234 1234",
                                                    5000, 4000, 0.2);
        CreditCard.printSummary(card1);
        card1.charge(500);
        System.out.println("Current balance: " + card1.getBalance());
        if (card1.charge(600))
            System.out.println("Card is charged successfully!");
        else {
            System.out.println("Not enough balance! A fee is charged.");
            System.out.println("Current balance: " + card1.getBalance());
        }
    }
}
