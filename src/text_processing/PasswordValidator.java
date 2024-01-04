package text_processing;

import java.util.Scanner;

public class PasswordValidator {

    private static String currentUsername = "janedoe";
    private static String currentPassword = "ABC_1234";

    public static void main(String[] args){
        printPasswordRules();

        Scanner scanner = new Scanner(System.in);
        boolean valid;

        do{
            System.out.println("Enter your new passowrd:");

            String newPassword = scanner.nextLine();
            valid = changePassword(newPassword);
        }while(!valid);

        System.out.println("The proposed password is valid");

        scanner.close();
    }
    
    public static void printPasswordRules(){
        System.out.println("Your new password must meet the following requirements:");        
        System.out.println("* at least 8 characters long");
        System.out.println("* contain an upper case letter");
        System.out.println("* contain a special character");
        System.out.println("* not contain your username");
        System.out.println("* cannot be the same as your old password");
        System.out.println();

    }

    public static boolean changePassword(String newPassword){
        boolean valid = true;
        String errorMessage = "";
        if(newPassword.length() < 8){
            valid = false;
            errorMessage += "\n Your password must be at least 8 characters long";
        }

        if(newPassword.equals(newPassword.toLowerCase())){
            valid = false;
            errorMessage += "\n Your password must contain at least one capital letter";

        }

        if(newPassword.matches("[a-zA-Z0-9]*")){
            valid = false;
            errorMessage += "\n Your password must include a special character";
        }

        if(newPassword.toUpperCase().contains(currentUsername.toUpperCase())){
            valid = false;
            errorMessage += "\n Your password cannot contain your username";
        }

        if(newPassword.equals(currentPassword)){
            valid = false;
            errorMessage += "\n You already used that password; you need to enter a new one";
        }

        if(!valid){
            System.out.println(errorMessage);
        }

        return valid;
    }
}
