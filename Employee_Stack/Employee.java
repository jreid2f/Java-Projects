
/**
 * Lab Assignment 4
 * Inheritance, Stacks, and Generic
 * @author Joey Reidell
 * 2/17/16
 */
public class Employee {
    private String name;
    private Date hireDate;
    private int departmentCode;
    private static int numberOfEmployees;
    
    public Employee()
    {
        name = "No name";
        hireDate = new Date("Jan", 1, 2016);
        departmentCode = 0000;
        numberOfEmployees++;
        
    }
    public Employee(String theName, Date theDate, int theDeptCode)
    {
        if(theName == null || theDate == null)
        {
            System.out.println("Fatal error creating employee");
        }
        name = theName;
        hireDate = new Date(theDate);
        departmentCode = theDeptCode;
        numberOfEmployees++;
    }
    public Employee(Employee originalObject)
    {
        name = originalObject.name;
        hireDate = new Date(originalObject.hireDate);
        departmentCode = originalObject.departmentCode;
        numberOfEmployees++;
    }
    public String getName()
    {
        return name;
    }
    public Date getHireDate()
    {
        return new Date(hireDate);
    }
    public int getDepartmentCode()
    {
        return departmentCode;
    }
    public static int getNumberOfHired()
    {
        return numberOfEmployees;
    }
    public void setName(String newName)
    {
       if (newName == null) {
            System.out.println("Fatal error setting employee name.");
            System.exit(0);
        } else {
            name = newName;
        } 
    }
    public void setHireDate(Date newDate)
    {
        if (newDate == null) {
            System.out.println("Fatal error setting employee hire date.");
            System.exit(0);
        } else {
            hireDate = new Date(newDate);
        }
    }
    public void setDepartmentCode(int newCode)
    {
       if(newCode == 0){
           System.out.println("Fatal error setting department code.");
       } 
       else{
           departmentCode = newCode;
       }
    }
    @Override
    public String toString()
    {
        return  "Name: " + name +
                "\nHired Date: " + hireDate + 
                "\nDepartment Code: " + departmentCode;
    }
    @Override
    public boolean equals(Object otherObject)
    {
        if (otherObject == null) {
            return false;
        } else if (!(otherObject instanceof Employee)) {
            return false;
        } else {
            Employee otherEmployee
                    = (Employee) otherObject;
            return (name.equals(otherEmployee.name)
                    && hireDate.equals(otherEmployee.hireDate) 
                    && departmentCode == otherEmployee.departmentCode);
        }
    }
}
