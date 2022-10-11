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

        double meal = 0;

        while (meal != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 19.99 (-1 to end): ");
            meal = input.nextDouble ();
            if (meal != -1) {
                calc1.addMeal (meal);
            }
            else {
                break;
            }
        }

        System.out.println ("-----------------------------------------------------------");
        System.out.printf ("Total Bill Before Tip: $%.2f\n", calc1.getTotalBillBeforeTip ());
        System.out.println ("Tip Percentage: " + calc1.getTipPercentage ());
        System.out.printf ("Total Tip: $%.2f\n", calc1.tipAmount ());
        System.out.printf ("Total Meal With Tip: $%.2f\n", calc1.totalBill ());
        System.out.printf ("Per Person Cost Before Tip: $%.2f\n", calc1.perPersonCostBeforeTip ());
        System.out.printf ("Tip Per Person: $%.2f\n", calc1.perPersonTipAmount ());
        System.out.printf ("Total Cost Per Person: $%.2f\n", calc1.personTotalCost ());
    }
}
