/* Random number generation class that has methods like add, subtract
   , division, and multiplication
   Winston Shih 2/7/2023
   JDK Version 17.0.1*/
public class Calculations {
    public static int generateRandomNum(int a, int b) {
        double range=(Math.abs(a-b)+1);
        if(a<=b){
            return (int) (Math.random() * range + a);
        }else{
            return (int) (Math.random()*range+b);
        }
    }
    public static double add(double n1, double n2)
    {
        return n1+n2;
    }
    public static double subtract(double n1, double n2)
    {
        return n1-n2;
    }
    public static double multiply(double n1, double n2)
    {
        return n1*n2;
    }
    public static double divide(double n1, double n2)
    {
        return n1/n2;
    }
}
