public class Distance {
    private double speed;
    private double time;
    public Distance(double s, double t)
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
}
