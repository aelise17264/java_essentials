package RepetitionStructures;

import java.util.Scanner;
import java.util.Random;

public class loops {

    public static void main(String[] args){
        int finish = 20;
        int currentSpace = 0;
        int maxRolls = 5;
        Random random = new Random();

        System.out.println("Let's roll");
       
        for(int i = 0; i <= maxRolls; i++){
            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;

            System.out.println(String.format("Roll #%d: You've rolled a %d. ", i, die));

            if(currentSpace == finish){
                System.out.println("You're on space " + currentSpace + ". Congrats you won!");
                break;
            }else if(currentSpace > finish){
                System.out.println("You've gone too far, sorry you lose");
                break;
            }
            else if(i == maxRolls && currentSpace < finish){
                System.out.println("You're on space " + currentSpace + " and you're out of rolls");
                System.out.println("You didn't make it to " + finish + " You lose");
            }else{
                int spacesToGo = finish - currentSpace;
                System.out.println("You are on space " + currentSpace + " and have " + spacesToGo + " more to go");
            }
            System.out.println();
        }
       
    }
    
}


//break statement
//  System.out.println("Enter some text:");
// Scanner scanner = new Scanner(System.in);
// String text = scanner.next();
// scanner.close();

// boolean letterFound = false;

// for (int i = 0; i < text.length(); i++){
//     char currentLetter = text.charAt(i);
//     if(currentLetter == 'A' || currentLetter == 'a'){
//         letterFound = true;
//         break;
//     }
// }

// for loop
//  System.out.println("Enter the number of items you would like to scan:");
//     Scanner scanner = new Scanner(System.in);

//     int quantity = scanner.nextInt();

//     double total = 0;

//     for(int i = 0; i < quantity; i++){
//         System.out.println("Enter cost of this item");
//         double price = scanner.nextDouble();

//         total = total + price;
//     }
//     scanner.close();

//     System.out.println("Your total is $" + total);

// do while loop
// Scanner scanner = new Scanner(System.in);
//         int runAgain = 0;

//         do{
//             System.out.println("Enter a number");
//             double number1 = scanner.nextDouble();

//             System.out.println("Enter another number");
//             double number2 = scanner.nextDouble();

//             double sum = number1 + number2;
//             System.out.println("The sum of the two numbers is " + sum);

//             System.out.println("Would you like to start over? Enter 1 for Yes, 2 for No");
//             runAgain = scanner.nextInt();

//         }while(runAgain == 1);

//         scanner.close();