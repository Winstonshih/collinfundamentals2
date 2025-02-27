/*
 * Creates a class that encapsulates concept of a Person.
 * Winston Shih 4/17/2023
 * JDK Version 17.0.1
 */
public class Person {
    private String name;
    private String phoneNumber;
    private String emailAddress;
    public Person()
    {
        this.name="";
        this.phoneNumber="";
        this.emailAddress="";
    }
    public Person(String name, String phoneNumber, String emailAddress)
    {
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.emailAddress=emailAddress;
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }
    public String getEmailAddress()
    {
        return this.emailAddress;
    }
    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress=emailAddress;
    }
    @Override
    public String toString()
    {
        return "Name: "+getName()+"\nPhone: "+getPhoneNumber()+"\nEmail: "+getEmailAddress();
    }
}
