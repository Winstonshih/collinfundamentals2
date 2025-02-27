/**
 * Winston Shih
 * 2/7/2023
 * JDK Version 17.0.1
 * This program will calculate BMI with a functional method.
 */
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class BodyMassIndexCalc {
    public static void main(String[] args) {
        String response=JOptionPane.showInputDialog(null,
                "Enter your height in inches");
        double height=Double.parseDouble(response);
        response=JOptionPane.showInputDialog(null,
                "ENter your weight in pounds");
        double weight=Double.parseDouble(response);
        double bmi=calculateBMI(height, weight);
        DecimalFormat pattern= new DecimalFormat("###.00");
        JOptionPane.showMessageDialog(null, "Height: "+height+
                "\nWeight: "+weight+
                "\nBMI: "+pattern.format(bmi));
    }
    public static double calculateBMI(double height, double weight)
    {
        return (weight*703)/(height*height);
    }
}
