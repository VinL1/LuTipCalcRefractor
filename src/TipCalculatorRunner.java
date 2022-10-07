import java.util.Scanner;

public class TipCalculatorRunner {
    public static void main (String [] args) {

        Scanner input = new Scanner (System.in);

        int numPeople;
        int tipPercentage;

        System.out.println ("Welcome to the tip calculator!");
        System.out.print ("How many people are in your group? ");
        numPeople = input.nextInt ();
        System.out.println ();
        System.out.print ("What's the tip percentage? (0-100): ");
        tipPercentage = input.nextInt ();
        System.out.println ();

        TipCalculator calc1 = new TipCalculator (numPeople, tipPercentage);

        while (input.nextInt () != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 19.99 (-1 to end): ");
            if (input.nextInt () != -1) {
                calc1.addMeal (input.nextDouble ());
            }
            else {
                break;
            }
        }

        System.out.println ("-----------------------------------------------------------");
        System.out.println ("Total Bill Before Tip: " + calc1.getTotalBillBeforeTip());
        System.out.println ("Tip Percentage: " + calc1.getTipPercentage());
    }
}
