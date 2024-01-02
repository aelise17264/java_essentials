package decision_structures;

import java.util.Scanner;

public class ChangeForADollar {
    public static void main(String[] args){

    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Welcome to 'Change for a Dollar'! Your goal is to enter enough change to make exactly $1.00");
        System.out.println("Enter your number of pennies:");
        int numP = scanner.nextInt();

        System.out.println("Enter your number of nickles:");
        int numN = scanner.nextInt();

        System.out.println("Enter your number of dimes:");
        int numD = scanner.nextInt();

        System.out.println("Enter your number of quarters:");
        int numQ = scanner.nextInt();

        int userTotal = numP + (5 * numN) + (10 * numD) + (25 * numQ);
        int dollar = 100;
        if(userTotal > dollar ){
            System.out.println("Oops you went over by " + (userTotal - dollar) + " cents");
        }else if(userTotal < dollar){
            System.out.println("Not quite, you were " + (dollar - userTotal) + " cents short");
        }else{
            System.out.println("Spot on! That equals $1.00");
        }
    }

}
}

