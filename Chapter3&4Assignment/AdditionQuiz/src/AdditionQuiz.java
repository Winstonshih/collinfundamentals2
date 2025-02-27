/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author winst
 */
import java.util.Scanner;
import java.text.DecimalFormat; 
public class AdditionQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double average=0;
        int number1;
        int number2;
        int total;
        int answer;
        int tally;
        int totalQuestions;
        DecimalFormat percentage=new DecimalFormat("###.#");
        while(average<70)
        {
            tally=0;
            totalQuestions=-1;
            while(totalQuestions<0)
            {
                System.out.print("How many questions would you like to solve? ");
                totalQuestions=input.nextInt();
            }
            for(int i=0; i<totalQuestions;i++)
            {
                number1=(int)(Math.random()*50)+1;
                number2=(int)(Math.random()*50)+1;
                total=number1+number2;
                System.out.print(number1+"+"+number2+"=? ");
                answer=input.nextInt();
                if(total==answer)
                {
                    System.out.println("Correct");
                    tally++;
                }else{
                    System.out.println("Incorrect");
                }
            }
            average= (double)tally/totalQuestions*100;
            if(average<70)
            {
                System.out.println("You got "+tally+" out of "+totalQuestions+" correct which is "+percentage.format(average)+"%.");
                System.out.println("You did not pass this addition quiz. Please try again.");
                System.out.println("");
            }else if(average>=70){
                System.out.println("You got "+tally+" out of "+totalQuestions+" correct which is "+percentage.format(average)+"%.");
                System.out.println("You passed this addition quiz. Congratulations!");
            }
        }
    }
    
}
