/*
 * Class encapsulates the concept of a month
 * Winston Shih 3/28/2023
 * JDK Version 17.0.1
 */
package monthcreator;
public class Month {
    private int monthNumber;
    public Month(int m)
    {
        if(m>12&&m<1)
        {
            monthNumber=1;
        }
        else
        {
            monthNumber=m;
        }
    }
    public void setMonthNumber(int m)
    {
        monthNumber=m;
    }
    public int getMonthNumber()
    {
        return monthNumber;
    }
    public String getMonthName()
    {
        String monthName=" ";
        String[] monthList= {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        if(monthNumber==1)
        {
            monthName=monthList[0];
        }
        else if(monthNumber==2)
        {
            monthName=monthList[1];
        }
        else if(monthNumber==3)
        {
            monthName=monthList[2];
        }
        else if(monthNumber==4)
        {
            monthName=monthList[3];
        }
        else if(monthNumber==5)
        {
            monthName=monthList[4];
        }
        else if(monthNumber==6)
        {
            monthName=monthList[5];
        }
        else if(monthNumber==7)
        {
            monthName=monthList[6];
        }
        else if(monthNumber==8)
        {
            monthName=monthList[7];
        }
        else if(monthNumber==9)
        {
            monthName=monthList[8];
        }
        else if(monthNumber==10)
        {
            monthName=monthList[9];
        }
        else if(monthNumber==11)
        {
            monthName=monthList[10];
        }
        else if(monthNumber==12)
        {
            monthName=monthList[11];
        }
        return monthName;
    }
    public String getSeason()
    {
        String season=" ";
        if(monthNumber==1||monthNumber==2||monthNumber==12)
        {
            season="Winter";
        }
        else if(monthNumber==3||monthNumber==4||monthNumber==5)
        {
            season="Spring";
        }
        else if(monthNumber==6||monthNumber==7||monthNumber==8)
        {
            season="Summer";
        }
        else if(monthNumber==9||monthNumber==10||monthNumber==11)
        {
            season="Fall";
        }
        return season;
    }
    public String toString()
    {
        return "Month Number: "+getMonthNumber()+"\nMonth Name: "+getMonthName()+"\nSeason: "+getSeason();
    }
    public boolean equals(Month month2)
    {
        if(getMonthName()==month2.getMonthName())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
