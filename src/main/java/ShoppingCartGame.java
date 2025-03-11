import java.util.Scanner;

public class ShoppingCartGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.println("What items did you buy ");
        item = input.nextLine();

        System.out.println("What is the price for each? ");
        price = input.nextDouble();

        System.out.println("How many would you like? ");
        quantity = input.nextInt();

        total = price * quantity;
        System.out.println("your total is " + total + " of " + item + " in " + currency);


        input.close();


    }
}


