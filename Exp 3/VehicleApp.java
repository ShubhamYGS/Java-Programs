import java.util.Scanner;

interface Vehicle
{
	String name="Zest";
	int maxPassanger=5;
	int maxSpeed=150;
}

interface LandVehicle extends Vehicle
{
	int numWheels=4;
	void drive();
}

interface SeaVehicle extends Vehicle
{
	int displacement=10;
	void launch();
}

class Car implements LandVehicle
{
	public void drive()
	{
		System.out.println("\t\tCar Information:");
		System.out.println("Name: "+name+"\nMaximum Passanger: "+maxPassanger+"\nMaximum Speed: "+maxSpeed);
	}
}

class Ship implements SeaVehicle
{
	public void launch()
	{
			System.out.println("\t\tShip Information:");
			System.out.println("Name: "+name+"\nMaximum Passanger: "+maxPassanger+"\nMaximum Speed: "+maxSpeed);
	}
}
class HoverCraft implements LandVehicle,SeaVehicle
{
	Scanner input=new Scanner(System.in);
	
	String LandName, SeaName;
	
	public void drive()
	{
		System.out.println("Number of Wheels: "+numWheels+"\nLand Name: "+LandName);
	}
	
	public void launch()
	{
		System.out.println("Displacement: "+displacement+"\nSea Name: "+SeaName);
	}
	
	public void enterLand()
	{
		System.out.println("\nEnter Land Name: ");
		LandName=input.nextLine();
	}
	
	public void enterSea()
	{
		System.out.println("\n\nEnter Sea Name: ");
		SeaName=input.nextLine();
	}
}

public class VehicleApp
{
	public static void main(String[] args)
	{
		Car c=new Car();
		Ship s=new Ship();
		HoverCraft h=new HoverCraft();
		
		//Enter Car
		h.enterLand();
		c.drive();
		h.drive();
		
		//Enter Ship
		h.enterSea();
		s.launch();
		h.launch();
	}
}
