/*
 * Creates a subclass of Person class that encapsulates the concept of an 
 * Employee and extends Person classString[].
 * Winston Shih 4/17/2023
 * JDK Version 17.0.1
 */
public class Employee extends Person{

    private String employeeNumber;
    public Employee()
    {
        super();
        this.employeeNumber="";
    }
    public Employee(String name, String phoneNumber, String emailAddress, String employeeNumber)
    {
        super(name, phoneNumber, emailAddress);
        this.employeeNumber=employeeNumber;
    }
    public String getEmployeeNumber()
    {
        return this.employeeNumber;
    }
    public void setEmployeeNumber(String employeeNumber)
    {
        this.employeeNumber=employeeNumber;
    }
    @Override
    public String toString()
    {
        return super.toString()+"\nEmployee Number: "+getEmployeeNumber();
    }
    public static void main(String[] args) {
        final int ARRAYSIZE=4;
        Person people[]=new Person[ARRAYSIZE];
        people[0]=new Person("Gustavo Fring", "202-555-0155", "gusfring@lospolloshermanos.com");
        people[1]=new Person("Mike Ehrmantraut", "202-555-0152", "mikeehrmantraut@hotmail.com");
        people[2]=new Employee("Lydia Rodarte-Quayle", "202-555-0141", "lydiarodartequayle@madrigal.com", "9999-1789");
        people[3]=new Employee("Peter Schuler", "202-555-0128", "peterschuler@madrigal.com", "1980-1290");
        for(int i=0; i<ARRAYSIZE; i++)
        {
            System.out.println(people[i].toString());
        }
    }
    
}
