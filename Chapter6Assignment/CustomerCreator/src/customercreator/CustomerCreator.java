/*
 * Winston Shih
 * 2/21/2023
 * JDK Version 17.0.1
 * Tests all methods in Customer class.
 */
package customercreator;

public class CustomerCreator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer customer1=new Customer("Winston Shih", 690);
        System.out.println("Name: "+customer1.getName());
        System.out.println("Credit Score: "+customer1.getCreditScore());
        System.out.println("Credit Rating: "+customer1.getCreditRating());
    }
    
}
