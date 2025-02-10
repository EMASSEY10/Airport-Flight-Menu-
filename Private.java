public class Private extends Cargo
{
	//instance variables - extends cargo, passport, diplomat 
	private boolean isPassport;
    private boolean isDiplomat;
	//constructor
	public Private() 
	{ 
		super();
		isPassport = false;
		isDiplomat = false;
	}
	//full constructor
	public Private(String name, String destination, int hour, int minute, int minutes, int payload, boolean isPassport, boolean isDiplomat) 
	{ 
		super(name, destination, hour, minute, minutes, payload); // Adjusted arguments to match existing constructor
		this.isPassport = isPassport;
		this.isDiplomat = isDiplomat;
	}
	//getters and setters
	public boolean isPassport() {
		return isPassport;
	}
	public void setPassport(boolean isPassport) {
		this.isPassport = isPassport;
	}
	public boolean isDiplomat() {
		return isDiplomat;
	}
	public void setDiplomat(boolean isDiplomat) {
		this.isDiplomat = isDiplomat;
	}
	
	//toString 
	@Override
	public String toString() 
	{ 
		String str = super.toString() + "" + "Passport?: " + isPassport + ""+ "Diplomat?" + isDiplomat;	
		return str;
	}

	
}