import java.util.Scanner;

public class weightConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight conversion program");
        System.out.println("1: convert lbs to kgs");
        System.out.println("2: convert lgs to lbs");

        System.out.println("choose an option");

        choice = input.nextInt();

        if(choice == 1) {

            System.out.println("Enter the weight in lbs: ");
            weight = input.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is: %.2f", newWeight);

        }

        else if (choice == 2) {

            System.out.println("Enter the weight in Kgs: ");
            weight = input.nextDouble();
            newWeight = weight * 2.20468;
            System.out.printf("The new weight in lbs is: %.2f", newWeight);


        }
        else {
            System.out.println("That is not a valid choice");

        }

        input.close();


    }
}
