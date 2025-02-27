/*
 * Winston Shih 2/8/2023
 * JDK Version 17.0.1
 * This program keeps asking user to determine whether random facts about 
 * Solar System Planets are true or false and reveals whether user is correct 
 * or not until user types no.
 */
import java.util.Scanner;
public class MethodsGame {

    public static boolean switchPlanet(int choice)
    {
        boolean answer=false;
        switch(choice)
        {
            case 1:
                System.out.println("Is Venus the hottest planet in the universe?");
                answer=true;
                break;
            case 2:
                System.out.println("Is Neptune the coldest planet?");
                answer=false;
                break;
            case 3:
                System.out.println("Is Mercury the smallest planet?");
                answer=true;
                break;
            case 4: 
                System.out.println("Is Saturn the biggest planet?");
                answer=false;
                break;
            case 5:
                System.out.println("Is Jupiter the oldest planet?");
                answer=true;
                break;
            case 6: 
                System.out.println("Is Earth the youngest planet?");
                answer=false;
                break;
            case 7:
                System.out.println("Does Venus have no moons?");
                answer=true;
                break;
            case 8: 
                System.out.println("Is Pluto a planet?");
                answer=false;
                break;
            case 9:
                System.out.println("Is Mercury the closest planet to the Sun?");
                answer=true;
                break;
            case 10: 
                System.out.println("Is Uranus the farthest planet from the Sun?");
                answer=false;
                break;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean userAnswer;
        boolean realAnswer;
        boolean wantToPlayAgain=true;
        String yN;
        int random;
        while(wantToPlayAgain)
        { 
            random= (int)(Math.random()*9+1);
            realAnswer=switchPlanet(random);
            System.out.print("True or False? ");
            userAnswer=input.nextBoolean();
            compare(userAnswer, realAnswer);
            System.out.print("Play again (yes or no)? ");
            yN=input.next();
            if(yN.equals("no"))
            {
                wantToPlayAgain=false;
            }
        }
    }
    public static void compare(boolean answer1, boolean answer2)
    {
        if(answer1==answer2)
        {
            System.out.println("Correct");
        }
        else
        {
            System.out.println("Incorrect");
        }
    }    
}
