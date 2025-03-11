package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.println("Enter an adjective: ");
        adjective1 = input.nextLine();
        System.out.println("Enter a noun: ");
        noun1 = input.nextLine();
        System.out.println("Enter an adjective: ");
        adjective2 = input.nextLine();
        System.out.println("Enter a verb with -ing: ");
        verb1 = input.nextLine();
        System.out.println("Enter an adjective: ");
        adjective3 = input.nextLine();

        System.out.println("Today I went yo a " + adjective1 + " zoo ");
        System.out.println("In an exhibit,  I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");


        input.close();


    }
    }
