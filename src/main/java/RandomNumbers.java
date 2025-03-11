import java.util.Random;
import java.util.Scanner;


public class RandomNumbers {

    public static void main(String[] args)
    {

        Random random = new Random();
        int number;
        String name;

        number = random.nextInt(1,7);
        Scanner input = new Scanner(System.in);
        System.out.println("Put your name and press enter to roll your dice ");
        name = input.nextLine();
        System.out.println("Your lucky number is "+ number + " " + name);


    }
}
