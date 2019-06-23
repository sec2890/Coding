package Phone;

public abstract class Phone {
	
	//The Attributes
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    
    //The Constructor
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    
    //The Getters
	public String getVersionNumber() {
		return versionNumber;
	}
	public int getBatteryPercentage() {
		return batteryPercentage;
	}
	public String getCarrier() {
		return carrier;
	}
	public String getRingTone() {
		return ringTone;
	}
	
	//The Setters
	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}
	public void setBatteryPercentage(int batteryPercentage) {
		this.batteryPercentage = batteryPercentage;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public void setRingTone(String ringTone) {
		this.ringTone = ringTone;
	}
	
	//The Abstract Method
    public abstract void displayInfo();
}