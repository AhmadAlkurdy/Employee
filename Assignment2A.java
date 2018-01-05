/*
Create a class called Employee that includes three instance variables --a first
name (type String), a last name (type string) and a monthly salary (double).  
Provide a constructor that initializes the three instance variables.  Provide a 
set and a get method for each instance variable.  If the monthly salary is not 
positive, do not set its value.  Write a test application named EmployeeTest that 
demonstrates class Employee's capabilities.  Create two Employee objects and 
display each object's yearly salary.  Then give each Employee a 10% raise and
display each Employee's yearly salary again. - Submit as a .java file 

Create a test class for Employee to demonstrate the functionality of the Employee 
class. - Submit as a .java file
Name:Ahmad Alkurdy
Test class to prompt the user
 */
package assignment2a;
import java.util.Scanner;
/**
 *
 * @author ahmad
 */
public class Assignment2A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //define the object in the emplyeesclass
        EmployeesClass employee1 = new EmployeesClass("first", "last", 0.0);
        EmployeesClass employee2 = new EmployeesClass("first", "last", 0.0);
        
        
        
         //declaring variables
        String firstName;
        String lastName;
        double monthlySalary;
        
        
        //prompting the user t
        System.out.println("Enter Information\n");
         
        System.out.print("Enter First Name: ");
       
        firstName = input.next();
    
       //set the information  that the user enter in the class
        employee1.setFirstName(firstName);
       //prompt the user for last name
        System.out.print("Enter Last Name: ");
        lastName = input.next();
        employee1.setLastName(lastName);
        
      //prompt the user for salary
        System.out.print("Enter Monthly Salary: ");
        monthlySalary = input.nextDouble();
        //if monthly salary is not positive do not set its value
        if (monthlySalary > 0) 
        {
            employee1.setSalary(monthlySalary);
        }
 
        System.out.println();
        System.out.println("Enter information\n");
 
        System.out.print("Enter First Name: ");
        firstName = input.next();
        employee2.setFirstName(firstName);
        
        System.out.print("Enter Last Name: ");
        lastName = input.next();
        employee2.setLastName(lastName);
        
        System.out.print("Enter Monthly Salary: ");
        monthlySalary = input.nextDouble();
        if (monthlySalary > 0)
        {
            employee2.setSalary(monthlySalary);
        }
            System.out.println();
            
            
        //displaying the information the user included and then with the 10% raise
        System.out.printf("Employee1: %s %s, Yearly Salary: $%.2f\n",employee1.getFirst()
        ,employee1.getLast(),employee1.getSalary());
        System.out.printf("Employee2: %s %s, Yearly Salary: $%.2f\n",employee2.getFirst()
        ,employee2.getLast(),employee2.getSalary());
        System.out.println("Increasing employee salaries by 10%");
        System.out.printf("Employee1: %s %s, Yearly Salary: $%.2f\n",employee1.getFirst()
        ,employee1.getLast(),employee1.increasedSalary());
        System.out.printf("Employee1: %s %s, Yearly Salary: $%.2f\n",employee2.getFirst()
        ,employee2.getLast(),employee2.increasedSalary());
        
        
 
        
 
    

 
    }
        
        
    
    
    
    
}
