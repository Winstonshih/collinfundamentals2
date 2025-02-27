/*
 * Winston Shih 5/8/2023
 * JDK Version 17.0.1
 * Simple Calculator class that allows user to add, subtract, multiply, and divide 2 numbers, 
 * find a factorial or fibonacci number of a specific number.
 */
import java.util.*;
public class SimpleCalculator{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double n1, n2, n;
        int nF;
        double number1=0, number2=0;
        char operator;
        do
        {
            System.out.println("What math operation do you want to do (+,-,/,*,!,fibonacci[f])? Press q to quit");
            operator=input.next().charAt(0);
            switch(operator){
                case '+':
                    try{
                        System.out.println("Type number 1: ");
                        n1=input.nextDouble();
                        number1=n1;
                    }
                    catch (InputMismatchException e)
                    {
                        System.out.println("Number 1 must be a number.");
                        break;
                    }
                    try{
                        System.out.println("Type number 2: ");
                        n2=input.nextDouble();
                        number2=n2;
                    }
                    catch (InputMismatchException e)
                    {
                        System.out.println("Number 2 must be a number.");
                        break;
                    }
                    add(number1,number2);
                    break;
                case '-': 
                    try{
                        System.out.println("Type number 1: ");
                        n1=input.nextDouble();
                        number1=n1;
                    }
                    catch (InputMismatchException e)
                    {
                        System.out.println("Number 1 must be a number.");
                        break;
                    }
                    try{
                        System.out.println("Type number 2: ");
                        n2=input.nextDouble();
                        number2=n2;
                    }
                    catch (InputMismatchException e)
                    {
                        System.out.println("Number 2 must be a number.");
                        break;
                    }
                    minus(number1,number2);
                    break;
                case '*': 
                    try{
                        System.out.println("Type number 1: ");
                        n1=input.nextDouble();
                        number1=n1;
                    }
                    catch (InputMismatchException e)
                    {
                        System.out.println("Number 1 must be a number.");
                        break;
                    }
                    try{
                        System.out.println("Type number 2: ");
                        n2=input.nextDouble();
                        number2=n2;
                    }
                    catch (InputMismatchException e)
                    {
                        System.out.println("Number 2 must be a number.");
                        break;
                    }
                    times(number1,number2);
                    break;
                case '/': 
                    try{
                        System.out.println("Type number 1: ");
                        n1=input.nextDouble();
                        number1=n1;
                    }
                    catch (InputMismatchException e)
                    {
                        System.out.println("Number 1 must be a number.");
                        break;
                    }
                    try{
                        System.out.println("Type number 2: ");
                        n2=input.nextDouble();
                        number2=n2;
                    }
                    catch (InputMismatchException e)
                    {
                        System.out.println("Number 2 must be a number.");
                        break;
                    }
                    try{
                        divide(number1, number2);
                    }
                    catch (ZeroDivisionException e)
                    {
                        System.out.println("Error: Can't divide by error!");
                        break;
                    }
                    break;
                case '!': 
                    try{
                        System.out.println("Type number: ");
                        n=input.nextDouble();
                        factorial(n);
                    }
                    catch (InputMismatchException e)
                    {
                        System.out.println("Input for factorial must be a number: ");
                        break;
                    }
                    break;
                case 'f':
                    try{
                        System.out.println("Type number: ");
                        nF=input.nextInt();
                        fibonacci(nF);
                    }
                    catch (InputMismatchException e)
                    {
                        System.out.println("Input for fibonnaci's number must be a number: ");
                        break;
                    }
                    break;
                case 'q':
                    break;
                default:
                    System.out.println("Invalid command.");
            }
            
        }while(!(operator=='q'));
    }
    public static void add(double num1, double num2)
    {
        double sum=num1+num2;
        System.out.println(num1+"+"+num2+"="+sum);
    }
    public static void minus(double num1, double num2)
    {
        double difference=num1-num2;
        System.out.println(num1+"-"+num2+"="+difference);
    }
    public static void times(double num1, double num2)
    {
        double product =num1*num2;
        System.out.println(num1+"*"+num2+"="+product);
    }
    public static void divide(double num1, double num2) throws ZeroDivisionException
    {
        if(num2==0.0)
        {
            throw new ZeroDivisionException("Error: Can't divide by zero!");
        }
        else
        {
            double quotient=num1/num2;
            System.out.println(num1+"/"+num2+"="+quotient);
        }
    }
     public static void factorial(double num)
    {
        double product=1;
        for(int i=1; i<=num;i++)
        {
            product*=i;
        }
        System.out.println(num+"! ="+product);
    }
    public static void fibonacci(int number)
    {
        int count=0;
        int n=0;
        int n2=1;
        int n3;
        System.out.print(n+" "+n2);
        while(count<number)
        {
            n3=n+n2;
            n=n2;
            n2=n3;
            System.out.print(" "+n3);
            count++;
        }
        System.out.println("");
    }
}
