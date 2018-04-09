
/**
 * Lab Assignment 5-Abstract and Interface
 * @author Joey Reidell
 * 3/16/16
 */
public class PowerBoat extends Boat {
    private int noEngines;
    private String fuelType;
    
    public PowerBoat(String aStateRegistrationNo, double aLength,
            String aManufacturer, int aYear, int aNoEngines, String aFuelType){
        super(aStateRegistrationNo, aLength, aManufacturer, aYear);
        setNoEngines(aNoEngines);
        setFuelType(aFuelType);
    }
    
    @Override
    public String tellAboutSelf(){
        return "This is a powerboat " + getStateRegistrationNo() + "\n" +
                "Length: " + getLength() + "\n" + 
                "Manufacturer: " + getManufacturer() + "\n" +
                "Year Built: " + getYear() + "\n" + 
                "Number of engines: " + getNoEngines() + "\n" + 
                "Fuel Type: " + getFuelType() + "\n" +
                "***************";
    } 
    
    public void setNoEngines(int aNoEngines){
        if(aNoEngines > 0){
            noEngines = aNoEngines;
        }
        else{
            System.err.println("Fatal Error");
            System.exit(0);
        }
    }
    
    public void setFuelType(String aFuelType){
        if(aFuelType == null){
            System.err.println("Fatal Error");
            System.exit(0);
        }
        else{
            fuelType = aFuelType;
        }
    }
    
    public int getNoEngines(){
        return noEngines;
    }
    
    public String getFuelType(){
        return fuelType;
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
