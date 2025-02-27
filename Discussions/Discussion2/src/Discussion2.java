/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author winst
 */
import javax.swing.JOptionPane;
public class Discussion2 {

    public static double payPerHour(int hour , double pay){
        double perHourPay = hour * pay;
        return perHourPay;
    }
    public static void main(String[] args) {
        String response=JOptionPane.showInputDialog(null, 
                "Enter the number of hours you worked: ");
        int hours=Integer.parseInt(response);
        response=JOptionPane.showInputDialog(null,
                "Enter the pay you receive per hour: ");
        double hourlyPay=Double.parseDouble(response);
        double totalPay=payPerHour(hours, hourlyPay);
        JOptionPane.showMessageDialog(null,"Total hours worked: "+hours+
                " hours\nHourly pay rate: $"+hourlyPay+"\nYour total pay: $"+totalPay);
    }
    
}
