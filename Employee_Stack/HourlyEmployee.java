
import java.text.DecimalFormat;
import java.text.NumberFormat;


/**
 * Lab Assignment 4
 * Inheritance, Stacks, and Generic
 * @author Joey Reidell
 * 3/2/16
 */
public class HourlyEmployee extends Employee {
    private double wageRate;
    private double hours;
    
    public HourlyEmployee()
    {
        super();
        wageRate = 0.0;
        hours = 0;        
    }
    
    public HourlyEmployee(String theName, Date theDate, int departmentCode,
            double theWageRate, double theHours)
    {
        super(theName, theDate, departmentCode);
        if(theWageRate >= 0 && theHours >= 0)
        {
           wageRate = theWageRate;
           hours = theHours; 
        }
        else
        {
            System.out.println("Fatal error creating HourlyEmployee.");
            System.exit(0);
        }
        
    }
    
    public HourlyEmployee(HourlyEmployee originalObject)
    {
        super(originalObject);
        wageRate = originalObject.wageRate;
        hours = originalObject.hours;
    }
    
    public double getRate()
    {
       return wageRate; 
    }
    
    public double getHours()
    {
        return hours;
    }
    
    public double getPay()
    {
        return wageRate * hours;
    }
    
    public void setHours(double hoursWorked)
    {
        if(hoursWorked <= 0)
            System.out.println("Fatal error setting hours worked.");
        
        else
            hours = hoursWorked;
    }
    
    public void setRate(double newWageRate)
    {
        if(newWageRate == 0)
            System.out.println("Fatal error setting wage rates");
        else
            wageRate = newWageRate;
    }
    
    @Override
    public String toString()
    {
        NumberFormat money = NumberFormat.getCurrencyInstance();
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return super.toString() +
               "\n" + money.format(wageRate) + " per hour for " + 
                df.format(hours) + " hours";
    }
    
    @Override
    public boolean equals(Object otherObject)
    {
        if (otherObject == null) {
            return false;
        } else if (!(otherObject instanceof HourlyEmployee)) {
            return false;
        } else {
            HourlyEmployee otherEmployee
                    = (HourlyEmployee) otherObject;
            return (super.equals(otherObject) && 
                    wageRate == (otherEmployee.wageRate) &&
                    hours == (otherEmployee.hours));
        }
    }
    
}
