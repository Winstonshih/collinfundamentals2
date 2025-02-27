/*
 * Validates email address String using Chapter 9 methods
 * Winston Shih 4/4/2023
 * JDK Version 17.0.1
 */
import java.util.*;
public class StringValidation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String email;
        boolean valid=false;
        char[] emailArray;
        while(valid==false)
        {
            System.out.println("Enter your email address (Must contain 1 letter, an @, and be between 15-25 characters long): ");
            email=input.next();
            emailArray=email.toCharArray();
            for(int i=0;i<email.length();i++)
            {
                if(email.length()>14&&email.length()<26&&email.contains("@")&&Character.isDigit(emailArray[i]))
                {
                    valid=true;
                }
            }
            if(valid)
            {
                System.out.println("Valid");
            }
            else
            {
                System.out.println("Invalid");
            }
        }
    }
}

