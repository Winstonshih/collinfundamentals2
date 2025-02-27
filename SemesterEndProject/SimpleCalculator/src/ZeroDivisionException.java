/*
 * Winston Shih 5/8/2023
 * JDK Version 17.0.1
 * Defines zero division exception that is used by division method in 
 * SimpleCalculator class.
 */
public class ZeroDivisionException extends Exception{
    public ZeroDivisionException(String message)
    {
        super(message);
    }
}
