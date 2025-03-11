import java.util.Scanner;

public class compundCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double principle;
        double rate;
        int timesCompunded;
        int years;
        double amount;

        System.out.println("Enter the priciple amount: ");
        principle = input.nextDouble();

        System.out.println("Enter the interest rate (in %): ");
        rate = input.nextDouble() /100;

        System.out.println("Enter the number of times compunded per year: " );
        timesCompunded = input.nextInt();

        System.out.println("Enter the number of years: ");
        years = input.nextInt();

        amount = principle * Math.pow(1 + rate / timesCompunded, timesCompunded * years);

        System.out.printf("The amount after %d years is %f", years, amount);


        input.close();

    }

}
