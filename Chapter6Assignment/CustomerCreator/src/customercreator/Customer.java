/*
 * Winston Shih
 * 2/21/2023
 * JDK Version 17.0.1
 * Class encapsulates concept of a customer by defining customer's attributes    
 * (name and credit score) and the methods that get or set their value.
 */
package customercreator;

public class Customer {
    private String name;
    private int creditScore;
    public Customer()
    {
        name=null;
        creditScore=300;
    }
    public Customer(String custName, int custCreditScore)
    {
        name=custName;
        creditScore=custCreditScore;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String custName)
    {
        name=custName;
    }
    public int getCreditScore()
    {
        return creditScore;
    }
    public void setCreditScore(int custCreditScore)
    {
        creditScore=custCreditScore;
    }
    public String getCreditRating()
    {
        String creditRating="";
        if((creditScore>=200)&&(creditScore<=629))
        {
            creditRating="Bad";
        }
        else if((creditScore>=630)&&(creditScore<=689))
        {
            creditRating="Fair";
        }
        else if((creditScore>=690)&&(creditScore<=719))
        {
            creditRating="Good";
        }
        else if((creditScore>=720)&&(creditScore<=850))
        {
            creditRating="Excellent";
        }
        return creditRating;
    }
}
