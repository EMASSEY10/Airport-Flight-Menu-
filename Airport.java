import java.util.ArrayList;
import java.util.Scanner;

public class Airport 
{
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		//import scanner
		//ArrayList from Cargo class
		Scanner keyboard = new Scanner(System.in);
		ArrayList <Cargo> planes = new ArrayList<>();
 		//add planes to list
		
		//menu system with switch statement
		int userChoice = menu(keyboard);
		
		while(userChoice != 5) 			//using same menu system from the lecture code
		{ 
			switch(userChoice) {
				case 1 -> addFlight(planes, keyboard);
				case 2 -> removeFlight(planes, keyboard);
				case 3 -> printFlights(planes);
				case 4 -> printSpecificFlight(planes, keyboard);
			}
			userChoice = menu(keyboard);
		}
	}
	
	public static int menu(Scanner keyboard) 
	{ 
		System.out.println("Airport Menu");
		System.out.println("1. Add a flight");
		System.out.println("2. Remove a flight");
		System.out.println("3. Print all flight");
		System.out.println("4. Print a specific flight");
		System.out.println("5. Exit");
		
		System.out.print("Menu Choice: ");
		int userChoice = keyboard.nextInt(); 
		
		return userChoice;
	}
	//menu function to add flight
	public static void addFlight(ArrayList<Cargo> planes, Scanner keyboard) 
	{
		//if statement for cargo, passenger, or private
		System.out.print("Enter the name of the flight: ");
		String name = keyboard.next();
		System.out.print("Enter the destination of the flights: ");
		String destination = keyboard.next();
		System.out.print("Enter the department time hour of the flight: ");
		int hour = keyboard.nextInt();
		System.out.print("Enter department time minute of the flight: ");
		int minute = keyboard.nextInt();
		System.out.println("Enter the amount of minutes for the flight: ");
		int minutes = keyboard.nextInt();
		System.out.print("Enter the payload of the flight: ");
		int payload = keyboard.nextInt();
		
		System.out.println("1. Cargo");
		System.out.println("2. Passenger");
		System.out.println("3. Private");
		System.out.println("Plane Types:");
		int choice = keyboard.nextInt();
		
		switch(choice) 
		{ 
			case 1 -> {
				Cargo newCargo = new Cargo(name, destination, hour, minute, minutes, payload);
				planes.add(newCargo);
			}
			case 2 -> {
				System.out.println("Enter true if the flight needs a meal:  ");
				boolean meal = keyboard.nextBoolean();
				System.out.println("How many people does your flight have?: ");
				int people = keyboard.nextInt();
				Passenger newPassenger = new Passenger(name, destination, hour, minute, minutes, payload, meal, people);
				planes.add(newPassenger);
			}
			case 3 -> {
				System.out.println("Does the flight require a passport?: ");
				boolean isPassport = keyboard.nextBoolean();
				System.out.println("Does your flight have a diplomat?: ");
				boolean isDiplomat = keyboard.nextBoolean();
				Private newPrivate = new Private(name, destination, hour, minute, minutes, payload, isPassport, isDiplomat);
				planes.add(newPrivate);
			}
		}
	}
	//function to remove flight from list
	public static void removeFlight(ArrayList<Cargo> planes, Scanner keyboard) 
	{
		//for loop - look at car dealership example 
		for(int i = 0; i < planes.size(); i++) 
		{ 
			Cargo currPlane = planes.get(i);
			System.out.println((i+1) + "" + currPlane.toString());  
		}
		System.out.print("Which plane is removed?: ");
		int PlaneNum = keyboard.nextInt();
		
		//Remove car from stock
		planes.remove(PlaneNum-1);
		
	}
	//function to print all flights
	public static void printFlights(ArrayList<Cargo> planes) 
	{
		//user input for departure time, length, destination, payload, company, plane name
		System.out.println("Current Flights: ");
		for(Cargo tempPlane: planes) 
		{ 
			System.out.println(tempPlane);
		}
	}
	//function to print a specific flight
	public static void printSpecificFlight(ArrayList<Cargo> planes, Scanner keyboard) 
	{
		//print pointer in the list
		for(int i = 0; i < planes.size(); i++) 
		{ 
			Cargo getPlane = planes.get(i);
			System.out.println(getPlane.toString());
		}
		
	}
}	