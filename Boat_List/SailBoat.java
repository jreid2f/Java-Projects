
/**
 * Lab Assignment 5-Abstract and Interface
 * @author Joey Reidell
 * 3/16/16
 */
public class SailBoat extends Boat {
    private double keelDepth;
    private int noSails;
    private String motorType;
    
    public SailBoat(String aStateRegistrationNo, double aLength,
            String aManufacturer, int aYear, double aKeelDepth, int aNoSail, 
            String aMotorType){
        super(aStateRegistrationNo, aLength, aManufacturer, aYear);
        setKeelDepth(aKeelDepth);
        setNoSails(aNoSail);
        setMotorType(aMotorType);
        
    }
    
    @Override
    public String tellAboutSelf(){
        return "This is a sailboat " + getStateRegistrationNo() + "\n" +
                "Length: " + getLength() + "\n" + 
                "Manufacturer: " + getManufacturer() + "\n" +
                "Year Built: " + getYear() + "\n" + 
                "Keel Depth: " + getKeelDepth() + "\n" + 
                "Number of sails: " + getNoSails() + "\n" +
                "Motor Type: " + getMotorType() + "\n" +
                "***************";
    }
    
    public void setKeelDepth(double aKeelDepth){
        if(aKeelDepth > 0){
            keelDepth = aKeelDepth;
        }
        else{
            System.err.println("Fatal Error");
            System.exit(0);
        }
    }
    
    public void setNoSails(int aNoSails){
        if(aNoSails > 0){
            noSails = aNoSails;
        }
        else{
            System.err.println("Fatal Error");
            System.exit(0);
        }
    }
    
    public void setMotorType(String aMotorType){
        if(aMotorType == null){
            System.err.println("Fatal Error");
            System.exit(0);
        }
        else{
            motorType = aMotorType;
        }
    }
    
    
    public double getKeelDepth(){
        return keelDepth;
    }
    
    public int getNoSails(){
        return noSails;
    }
    
    public String getMotorType(){
        return motorType;
    }
            
    
    @Override
    public int compareTo(Boat t){
        if(getLength() > t.getLength()){
            return 1;
        }
        else if(getLength() < t.getLength()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
