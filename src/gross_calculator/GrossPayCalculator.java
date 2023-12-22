package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {
    
    public static void main(String[] args){
       
        // Get the number of hours worked
        System.out.println("How many hours are normally worked per week?");
        Scanner scanner = new Scanner(System.in);
           int userHours =  scanner.nextInt();
        
            //Get the hourly pay rate
       System.out.println("What is the worker's hourly pay rate?");
       Scanner scanner2 = new Scanner(System.in);
        int userPayRate = scanner2.nextInt();
    
        // Multiply hours & pay rate
        double userGrossPay = (userHours * userPayRate) * 52;

        // Display result

            System.out.println("The Gross Annual Pay is " + userGrossPay);
        }
    

    }

