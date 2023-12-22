package gross_calculator;

import java.util.Scanner;

public class StoryWriter {

    public static void main(String[] args){
        System.out.println("What is your favorite season?");
        Scanner scanner = new Scanner(System.in);
        String userSeason = scanner.nextLine();

        System.out.println("Pick a whole number");
        Scanner scanner2 = new Scanner(System.in);
        int userNumber = scanner2.nextInt();

        System.out.println("What adjective best describes your breakfast this morning?");
        Scanner scanner3 = new Scanner(System.in);
        String userBreakfast = scanner3.nextLine();

        System.out.println("On a " + userBreakfast + " " + userSeason + 
            " day, I drink a minimum of " + userNumber + " cups of coffee.");
    }
    
}
