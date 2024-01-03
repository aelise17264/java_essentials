package RepetitionStructures;

import java.util.Scanner;

public class loops {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int runAgain = 0;

        do{
            System.out.println("Enter a number");
            double number1 = scanner.nextDouble();

            System.out.println("Enter another number");
            double number2 = scanner.nextDouble();

            double sum = number1 + number2;
            System.out.println("The sum of the two numbers is " + sum);

            System.out.println("Would you like to start over? Enter 1 for Yes, 2 for No");
            runAgain = scanner.nextInt();

        }while(runAgain == 1);

        scanner.close();

    }
    
}
