/*
 * Winston Shih 4/24/2023
 * JDK Version 17.0.1
 * Exception class is for scenarios in which divisor is zero since 
 * numerator can not be divided by a divisor that is zero.
 */

/**
 *
 * @author winst
 */
public class DivisionException extends Exception{
    public DivisionException(String message)
    {
        super(message);
    }
    
}
