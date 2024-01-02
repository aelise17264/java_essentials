package decision_structures;

import java.util.Scanner;

/*
 * SWITCH
 * Have a user enter their letter grade, and using a switch statement,
 * print out a message letting them know how they did.
 */
public class GradeMessage {

    public static void main(String[] args){
        String message;

        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.nextLine();
        switch (grade) {
            case "A": 
                message = "Execellent job!";
                break;
            case "B": 
                message = "Good job!";
                break;
            case "C": 
                message = "Good Effort!";
                break;
            case "D": 
                message = "You need to work a bit harder";
                break;
            case "F": 
                message = "Oh no";
                break;
            default:
                message = "Error. Invalid grade";
                break;
        }
        //  String message = switch (grade) {
        //     case "A" -> "Execellent job!";
        //     case "B", "C" -> "Good job!";
        //     case "D" -> "You need to work a bit harder";
        //     case "F" -> "Oh no";
        //     default -> "Error. Invalid grade";

        // };
    
        System.out.println(message);
    }
    }

