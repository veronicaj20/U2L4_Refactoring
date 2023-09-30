import java.util.Scanner;

public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // user inputted information
        System.out.print("Welcome! Enter your bill amount: $");
        String x = s.nextLine();
        double totalBillNoTip = Double.parseDouble(x);

        System.out.print("Enter your tip percentage: ");
        String y = s.nextLine();
        int tipPercentage = Integer.parseInt(y);

        System.out.print("Enter the total number of people in your party: ");
        String z = s.nextLine();
        int numPeople = Integer.parseInt(z);
        System.out.println();

        System.out.println("--------------------------------");
        System.out.println();
        TipCalculator price = new TipCalculator(totalBillNoTip, tipPercentage, numPeople);

        // calling methods
        double totalTipAmt = price.calcTotalTipAmt(totalBillNoTip, tipPercentage);
        double totalBillWithTip = price.calcTotalBillWithTip(totalBillNoTip, totalTipAmt);
        double tipPerPerson = price.calcTipPerPerson(totalTipAmt, numPeople);
        double totalPerPerson = price.calcTotalPerPerson(totalBillNoTip, numPeople, tipPerPerson);

        System.out.print("Your total tip amount is: $");
        System.out.format("%.2f", totalTipAmt);
        System.out.println();

        System.out.print("Your total bill with tip is: $");
        System.out.format("%.2f", totalBillWithTip);
        System.out.println();

        System.out.print("The amount each person should tip is: $");
        System.out.format("%.2f", tipPerPerson);
        System.out.println();

        System.out.print("The total per person is: $");
        System.out.format("%.2f", totalPerPerson);
        System.out.println();


    }
}