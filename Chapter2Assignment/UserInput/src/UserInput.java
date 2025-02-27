/**
 * This program takes 3 numbers from user and outputs result of first number 
 * divided by second number times the third number.
 * Written by Winston Shih on
 * JDK Version 17.0.1
 */
import java.util.*;
import javax.swing.JOptionPane;
public class UserInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String input= JOptionPane.showInputDialog(null, "Enter your full name: ");
        String fullName=input;
        input =JOptionPane.showInputDialog(null, "Enter a number: ");
        int firstNumber=Integer.parseInt(input);
        input =JOptionPane.showInputDialog(null, "Enter another number: ");
        int secondNumber=Integer.parseInt(input);
        input=JOptionPane.showInputDialog(null, "Enter another number: ");
        int thirdNumber=Integer.parseInt(input);
        double result=(double)firstNumber/secondNumber*thirdNumber;
        System.out.println("Name: "+fullName);
        System.out.println("Enter a number: "+firstNumber);
        System.out.println("Enter another number: "+secondNumber);
        System.out.println("Enter another number: "+thirdNumber);
        System.out.println(firstNumber+"/"+secondNumber+" * "+thirdNumber+" = "+result);
    }
    
}
