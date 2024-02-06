/*
password checking : 
Give a string (password). And check if it is a valid password as per given following rules if yes print 1 else print 0
Rules:
1. Password should  be a minimum of 8 characters in length .
2. Password should contain at least one uppercase , one lower case , one special character and one digit 
3. It should not contain white space.
*/

import java.util.*;

public class tech1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int upper_count = 0, lower_count = 0, digit_count = 0 , special_count = 0;
        System.out.print("Enter the password you want to check : ");
        String password = sc.nextLine();
        if (password.length() < 8) {
            System.out.println("0");
            System.exit(0);
        }
        for (int i = 0; i < password.length(); i++) {
            char current_char = password.charAt(i);
            if(current_char >= 97 && current_char <= 123){
                lower_count += 1;
            }
            else if(current_char >= 65 && current_char <= 96){
                upper_count += 1;
            }
            else if(current_char >= 48 && current_char <= 57){
                digit_count += 1;
            }
            else if(Character.isWhitespace(password.charAt(i))){
                System.out.println("0");
                System.exit(0);
            }
            else{
                special_count += 1;
            }
        }
        if (lower_count >0 && upper_count >0 && digit_count > 0 && special_count > 0){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        sc.close();
    }
}
