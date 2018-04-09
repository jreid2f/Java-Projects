
import java.text.NumberFormat;


/**
 * Lab Assignment 4
 * Inheritance, Stacks, and Generic
 * @author Joey Reidell
 * 3/2/16
 */
public class SalariedEmployee extends Employee {
    
    private double salary;
    
    public SalariedEmployee()
    {
        super();
        salary = 0.0;
    }
    
    public SalariedEmployee(String theName, Date theDate, int theDeptCode,
            double theSalary)
    {
        super(theName, theDate, theDeptCode);
        if(theSalary >= 0)
        {
            salary = theSalary;
        }
        else
        {
             System.out.println("Fatal error creating SalariedEmployee.");
        }
       
    }
    
    public SalariedEmployee(SalariedEmployee originalObject)
    {
        super(originalObject);
        salary = originalObject.salary;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    public double getPay()
    {
        return salary / 12;
    }
    
    public void setSalary(double newSalary)
    {
        if(salary <= 0)
            System.out.println("Fatal error setting the salary");
        else
            salary = newSalary;
    }
    
    @Override
    public String toString()
    {
        NumberFormat money = NumberFormat.getCurrencyInstance();
        return super.toString() + 
               "\n" + money.format(salary) + " per year";
    }
    
    @Override
    public boolean equals(Object otherObject)
    {
         if (otherObject == null) {
            return false;
        } else if (!(otherObject instanceof SalariedEmployee)) {
            return false;
        } else {
            SalariedEmployee otherEmployee
                    = (SalariedEmployee) otherObject;
            return (super.equals(otherObject) && 
                    salary == (otherEmployee.salary));
        }
    }
}
