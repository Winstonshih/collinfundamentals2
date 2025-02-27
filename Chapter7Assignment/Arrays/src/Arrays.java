/* Program that records the sales for different types of soda and determines 
 * the total sales and the names of the highest and lowest selling soda.
 * Written by Winston Shih
 * 2/28/2023
 * JDK Version 17.0.1
 */
import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        int sodaTypeAmt=-1;
        int sodaAmount=-1;
        Scanner input=new Scanner(System.in);
        while(sodaTypeAmt<0)
        {
            System.out.print("How many types of soda would you like to enter: ");
            sodaTypeAmt=input.nextInt();
        }
        input.nextLine();
        String[] sodaArray=new String[sodaTypeAmt];
        int [] amountOfSoda=new int[sodaTypeAmt];
        for(int i=0; i<sodaTypeAmt;i++)
        {
            System.out.print("Enter the name of soda type "+(i+1)+": ");
            sodaArray[i]=input.nextLine();
        }
        for(int i=0; i<sodaTypeAmt;i++)
        {
            while(sodaAmount<0)
            {
                System.out.print("Enter the number of "+sodaArray[i]+" bottles sold: ");
                sodaAmount=input.nextInt();
                amountOfSoda[i]=sodaAmount;
            }
            sodaAmount=-1;
        }
        System.out.println("------------------------------------------");
        int total=0;
        for(int i=0;i<sodaTypeAmt;i++)
        {
            total+=amountOfSoda[i];
        }
        System.out.println("Total Sold: "+total);
        int highestSoldIndex=0;
        int max=amountOfSoda[0];
        for(int i=1;i<sodaTypeAmt;i++)
        {
            if(max<amountOfSoda[i])
            {
                highestSoldIndex=i;
            }
        }
        System.out.println("Highest Sold: "+sodaArray[highestSoldIndex]);
        int minimum=amountOfSoda[0];
        int lowestSoldIndex=0;
        for(int i=1;i<sodaTypeAmt;i++)
        {
            if(minimum>amountOfSoda[i])
            {
                lowestSoldIndex=i;
            }
        }
        System.out.println("Lowest Sold: "+sodaArray[lowestSoldIndex]);
    }
    
}
