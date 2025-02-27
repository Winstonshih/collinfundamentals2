/*
 * Winston Shih 4/24/2023
 * JDK Version 17.0.1
 * Class that tests the DivisionException exception class by utilizing a basic
 * division program method 
 */
import java.util.*;
public class ExceptionHandling {
    public static void divide(double n, double d) throws DivisionException 
    {
        if(d==0)
        {
            throw new DivisionException("Error: you cannot divide by zero");
        }
        else
        {
            double result=n/d;
            System.out.println(n+"/"+d+"="+result);
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input the numerator: ");
        double numerator=input.nextDouble();
        System.out.print("Input the divisor: ");
        double divisor=input.nextDouble();
        try
        {
            divide(numerator, divisor);
        }
        catch(DivisionException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
