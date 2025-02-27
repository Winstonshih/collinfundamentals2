/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter3and4quiz;

/**
 *
 * @author winst
 */
public class Chapter3and4Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //int a = 10;
    //while (a >= 7)
    //System.out.println(a + " ");
    //a--;
    //int x = 2;
    //    while (x<= 4) {
    //        x++;
    //        System.out.println(x);
    //    }
    //for (int x1 = 3; x1<=5; x1++) { 
    //    System.out.println(x1);
    //}
//for (int i = 0; i <= 10; i++)
       //if(i%2==0)
            //a-=2;
//System.out.println(a);
for (int i = 1; i < 3; i++) {
            for (int x = 1; x <= 3; x += 2) {
                System.out.println("Hello");
            }
}
for(int number = 5; number <= 15; number += 3)
    System.out.print(number + ", ");
double discountRate;
char custType = 'B';
switch(custType) {
    case 'A':
        discountRate = 0.08;
        break;
    case 'B':
        discountRate = 0.06;
    case 'C':
        discountRate = 0.04;
    default:
        discountRate = 0.0;
    System.out.println(discountRate);
    }
    }
}
