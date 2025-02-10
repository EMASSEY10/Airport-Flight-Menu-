public class Passenger extends Cargo
{
	//instance variables - same as cargo, people, meal
	private int people;
	private boolean meal;
	//track number of people on board and if a meal is scheduled for the flight
	//amount of hours depends on the meal or not^
	
	//constructor
	public Passenger() 
	{ 
		super();
		people = 0;
		meal = false;
		// Set minutes after the object is fully constructed
		// initializeMinutes(); // Moved to a separate method
		// Call the initialization method after the object is fully constructed
		initializeMinutes();
	}

	// Method to initialize minutes
	private void initializeMinutes() {
		setMinutes(calculateMinutes());
		// Assuming there's a setter or a way to set minutes in the superclass
		// setMinutes(calculateMinutes()); // Moved to a separate method
	}
	
	public Passenger(String name, String destination, int length, int payload, int people, int payload1, boolean meal, int people1) 
	{ 
		super(name, destination, length, payload, 0, payload);
		// Assuming there's a setter or a way to set minutes in the superclass
		// setMinutes(calculateMinutes()); // Moved to a separate method
		// Initialize minutes after the object is fully constructed
		initializeMinutes();
	}
	//getters and setters
	public int getPeople() {
		return people;
	}
	public void setPeople(int people) {
		this.people = people;
	}
	public boolean isMeal() {
		return meal;
	}
	public void setMeal(boolean meal) {
		this.meal = meal;
	}
	
	//toString function
	// Helper method to calculate minutes
	private int calculateMinutes() {
		// Logic to calculate minutes based on the meal or other factors
		return 0; // Replace with actual calculation
	}

	//toString function
	@Override
	public String toString() 
	{ 
		String str = super.toString() + "" + "People: " + people + " " + "Meal?: " + meal;
		return str;
	}

	
}