/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author winst
 */
public class Discussion3 {

    private double speed;
    private double time;
    public Discussion3(double s, double t)
    {
        speed=s;
        time=t;
    }
    public void setspeed(double s)
    {
        speed=s;
    }
    public void settime(double t)
    {
        time=t;
    }
    public double getspeed()
    {
        return speed;
    }
    public double getTime()
    {
        return time;
    }
    public double getDistance()
    {
        return (speed*time);
    }
    public static void main(String[] args) {
        Discussion3 h=new Discussion3(2,3);
        System.out.println(h.getDistance());
    }
    
}
