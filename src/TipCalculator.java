public class TipCalculator {
    private double totalBill;
    private int tipPercentage;
    private int numPeople;
    private double totalTipAmt;
    private double totalBillWithTip;
    private double tipPerPerson;

    public TipCalculator(double totalBill, int tipPercentage, int numPeople) {
        this.totalBill = totalBill;
        this.tipPercentage = tipPercentage;
        this.numPeople = numPeople;
        this.totalTipAmt = totalTipAmt;
        this.totalBillWithTip = totalBillWithTip;
        this.tipPerPerson = tipPerPerson;
    }

    // calculates the total amount for tip
    public double calcTotalTipAmt(double totalBill, int tipPercentage) {
        double totalTipAmt = totalBill * ((double) tipPercentage / 100);
        return totalTipAmt;
    }

    // calculates the total bill w/ tip included
    public double calcTotalBillWithTip(double totalBill, double totalTipAmt) {
        double totalBillWithTip = totalBill + totalTipAmt;
        return totalBillWithTip;
    }

    // calculates the tip per person
    public double calcTipPerPerson(double totalTipAmt, int numPeople) {
        double tipPerPerson = totalTipAmt / numPeople;
        return tipPerPerson;
    }

    // calculates total per person
    public double calcTotalPerPerson(double totalBill, int numPeople,double tipPerPerson) {
        double totalPerPerson = (totalBill / numPeople) + tipPerPerson;
        return totalPerPerson;
    }

}
