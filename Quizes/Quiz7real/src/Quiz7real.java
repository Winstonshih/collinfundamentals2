/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author winst
 */
public class Quiz7real {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x[][]={{0,1},{2,3}};
        System.out.println(x[1][1]);
        //double myArray[] = new double[10];
        //for (int i = 1; i <= 10; i++) 
        //    myArray[i] = 0;
        int[] x1 = {55,33,88,22,99,11,44,66,77};
        int a = 10;
        if(x1[2] > x1[5])
            a = 5;
        else
            a = 8;
        System.out.println(a);
        int[] numbers = {40,3,5,7,8,12,10};
    int value = numbers[0];
    for(int i=1; i<numbers.length; i++) {
        if(numbers[i]<value)
            value=numbers[i];
    }
    System.out.println(value);
    }
    
}
