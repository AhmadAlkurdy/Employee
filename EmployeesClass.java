/*
a class for the employees that has constructor, and getters and setters
and it calculate the 10% raise
 */
package assignment2a;

/**
 *
 * @author ahmad
 */
public class EmployeesClass
{
    //private variables
    private String firstName;
    private String lastName;
    private Double salary;
    
    public EmployeesClass(String InFirst, String InLast, Double InSalary)
    {
        firstName = InFirst;
        lastName = InLast;
        salary = InSalary;
        
    }
    public void setFirstName (String inputFirst)
    {
        firstName = inputFirst;
    }
    public void setLastName (String inputLast)
    {
        lastName = inputLast;
    }
    public void setSalary(Double inputSalary)
    {
        salary = inputSalary;
    }
    public String getFirst()
    {
        return firstName;
    }
    public String getLast()
    {
        return lastName;
    }
    public Double getSalary()
    {
        
        return salary*12;
    }
    public double increasedSalary()
    {
        double increasedSalary;
        increasedSalary = (getSalary()*(0.1))+getSalary();
        return increasedSalary;
    }
}
