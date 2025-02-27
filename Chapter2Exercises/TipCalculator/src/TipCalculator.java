/**
 * Computing tip number
 * Written by Winston Shih on 1/21/2023
 * JDK Version 17.0.1
 */
import java.text.NumberFormat;
import javax.swing.JOptionPane;
public class TipCalculator {
    
    public static void main(String[] args) {
        String input=JOptionPane.showInputDialog(null, "Enter the total bill");
        double bill=Double.parseDouble(input);
        input=JOptionPane.showInputDialog(null, "Enter the tip percentage as a decimal "+" (Example: 10% would be 0.1)");
        double percentage=Double.parseDouble(input);
        double tipAmount=bill*percentage;
        NumberFormat dollars=NumberFormat.getCurrencyInstance();
        JOptionPane.showMessageDialog(null, "Bill amount: "+dollars.format(bill)+"\nTip Percentage: "+percentage+
                "\nTip: "+dollars.format(tipAmount));
    }
    
}
