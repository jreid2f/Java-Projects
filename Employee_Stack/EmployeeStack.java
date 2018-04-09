
import java.util.ArrayList;


/**
 * Lab Assignment 4
 * Inheritance, Stacks, and Generic
 * @author Joey Reidell
 * 3/2/16
 */
public class EmployeeStack extends ArrayList<Employee>{
    
    @Override
    public boolean isEmpty()
    {
        return super.isEmpty();
    }
    
    public int getSize()
    {
        return size();
    }
    
    public Employee peek()
    {
        return(get(getSize() - 1)); 
    }
    
    public Employee pop()
    {
        Employee o = get(getSize() - 1);
        remove(getSize() - 1);
        return o;
         
    }
    
    public boolean push(Employee o)
    {
        return add(o);
    }
    
    public int search(Employee o)
    {
        return indexOf(o);
    }
    
    @Override
    public String toString()
    {
        String s = "---------------------\n";
        for(int i = getSize() - 1; i >= 0; i--)
        {
            s += get(i) + "\n---------------------\n";
        }
        return s;
    }
}
