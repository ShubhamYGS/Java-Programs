import java.util.Scanner;

class Employee
{
	String fname,lname;
	int monsal;
	double annualsal,risesal;
	
	Scanner input=new Scanner(System.in);
	
	Employee()
	{
		fname="";
		lname="";
		monsal=0;
	}
	public void setData()
	{
		System.out.println("Enter First Name: ");
		fname=input.nextLine();
		
		System.out.println("Enter Last Name: ");
		lname=input.nextLine();
		
		System.out.println("Enter Monthly Salary: ");
		monsal=input.nextInt();
		
		if(monsal<0)
		{
			monsal=0;
		}
	}
	
	public void getData()
	{
		System.out.println("First Name is "+fname+"\nLast Name is "+lname+"\nMonth Salary is "+monsal);
	}
	
	public void annual()
	{
		annualsal=monsal*12;
		System.out.println("Annaul Salary is "+annualsal);
	}
	
	public void rise()
	{
		risesal=annualsal+(annualsal/10);
		System.out.println("After 10% rise in Salary is "+risesal);
	}
}

public class EmployeeTest
{
	public static void main(String[] args)
	{
		Employee e1=new Employee();
		Employee e2=new Employee();
		
		System.out.println("INFORMATION OF FIRST EMPLOYEE\n");
		e1.setData();
		e1.getData();
		e1.annual();
		e1.rise();
		
		System.out.println("\nINFORMATION OF SECOND EMPLOYEE\n");
		e2.setData();
		e2.getData();
		e2.annual();
		e2.rise();
	}
}
