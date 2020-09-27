package model;

public class Convert {
	private int startTemp;
	private String type;
	private String other;
	private int converted;
	
	public Convert(String type, String amt) {
		
		startTemp = Integer.parseInt(amt);

		if(type.equals("farenheit")) {
			this.converted = farenheit(amt);
			this.type = "farenheit";
			other = "celsius";
		}
		else {
			this.converted = celsius(amt);
			this.type = "celsius";
			other = "farenheit";
		}
	}
	
	//convert celsius to farenheit
    private int celsius(String c) {
    	int cel = Integer.parseInt(c);
    	
    	//1.8 is convert rate
    	int round = (int) Math.round((cel * 1.8) + 32);
    	return round;
    }
    
    private int farenheit(String f) {
    	int far = Integer.parseInt(f);
    	int x = far - 32;
    	
    	//.55 is convert rate
    	int round = (int) Math.rint(x * .55);
    	return round;
    }
    
    @Override
    public String toString() {
    	return (startTemp + " " + type + " converts to " + converted + " " + other + ".");
    }
    
	public int getStartTemp() {
		return startTemp;
	}
	public void setStartTemp(int startTemp) {
		this.startTemp = startTemp;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getConverted() {
		return converted;
	}
	public void setConverted(int converted) {
		this.converted = converted;
	}

	
	
}
