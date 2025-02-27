/*
 * Tests all methods in Month class.
 * Winston Shih 3/28/2023
 * JDK Version 17.0.1
 */
package monthcreator;
public class MonthCreator {
    public static void main(String[] args) {
        Month m1=new Month(7);
        Month m2=new Month(8);
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        if(m1.equals(m2))
        {
            System.out.println(m1.getMonthName()+" is equal to "+m2.getMonthName());
        }
        else
        {
            System.out.println(m1.getMonthName()+" is not equal to "+m2.getMonthName());
        }
    }
}
