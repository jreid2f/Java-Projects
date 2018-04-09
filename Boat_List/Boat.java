
/**
 * Lab Assignment 5-Abstract and Interface
 * @author Joey Reidell   
 * 3/16/16
 */
public abstract class Boat implements Comparable<Boat> {
    // attributes
    
    private String stateRegistrationNo;
    private double length;
    private String manufacturer;
    private int year;
    
    // constructor
    public Boat(String aStateRegistrationNo, double aLength,
            String aManufacturer, int aYear){
    setRegistrationNo(aStateRegistrationNo);
    setLength(aLength);
    setManufacturer(aManufacturer);
    setYear(aYear);
}
    // set accesor methods
    public final void setRegistrationNo(String aStateRegistrationNo)
    {
        if(aStateRegistrationNo == null){
            System.err.println("Fatal Error");
            System.exit(0);
        }
        else{
            stateRegistrationNo = aStateRegistrationNo;
        }
    }
    
    public final void setLength(double aLength)
    {
        if(aLength > 0){
            length = aLength;
        }
        else{
            System.err.println("Fatal Error");
            System.exit(0);
        }
    }
    
    public final void setManufacturer(String aManufacturer)
    {
        if(aManufacturer == null){
            System.err.println("Fatal Error");
            System.exit(0);
        }
        else{
            manufacturer = aManufacturer;
        }
    }
    
    public final void setYear(int aYear)
    {
        if(aYear >= 1900){
            year = aYear;
        }
        else{
            System.err.println("Fatal Error");
            System.exit(0);
        }
    }
    
    // get accessor methods
    public String getStateRegistrationNo(){
        return stateRegistrationNo;
    }
    
    public double getLength(){
        return length;
    }
    
    public String getManufacturer(){
        return manufacturer;
    }
    
    public int getYear(){
        return year;
    }
    
    // custom method 
    public abstract String tellAboutSelf();
}
