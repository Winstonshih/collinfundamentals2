/*
 * This program generate a random numberfrom 1-10 and then
 * have the user try to guess that number
 * Winston Shih 1/31/2023
 * JDK Version 17.0.1
 */
import javax.swing.JOptionPane;
public class GuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int computerNumber = (int)  (Math.random( )  * 10 + 1 ); 
        System.out.println("The correct guess would be "+computerNumber);
        int userAnswer=0;
        int count=0;
        while(computerNumber!=userAnswer)
        {
            count++;
            String response=JOptionPane.showInputDialog(null,
                    "Enter a guess between 1 and 10");
            userAnswer=Integer.parseInt(response);
            String result=null;
            if(userAnswer==computerNumber)
            {
                result="Correct";
            }else{
               if(userAnswer<=0||userAnswer>10)
               {
                   result="Invalid guess";
               }
               else if(userAnswer>computerNumber)
               {
                   result="Too High";
               }
               else
               {
                   result="Too Low";
               }
            }
            JOptionPane.showMessageDialog(null, result
                    +"\nTry number "+count);
        }
        if(count==1){
            JOptionPane.showMessageDialog(null, "You must be psychic!");
        }else if(count<3){
            JOptionPane.showMessageDialog(null, "Amazing!");
        }else if(count<5){
            JOptionPane.showMessageDialog(null, "Great job!");
        }else{
            JOptionPane.showMessageDialog(null, "You need some practice");
        }
    }
    
}
