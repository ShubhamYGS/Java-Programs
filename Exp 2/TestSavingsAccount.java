class SavingsAccount
{
	static double annualInterestRate;
	double savingsBalance=0;
	
	SavingsAccount(double Balance)
	{
		savingsBalance=Balance;
		System.out.println("Primary Saving Balance is "+savingsBalance);
	}
	
	void calculateMonthlyInterest()
	{
		savingsBalance=((savingsBalance*annualInterestRate)/12)+savingsBalance;
		System.out.println("New Saving Balance is "+savingsBalance);
	}
	
	public static void modifyInterestRate(double rate)
	{
		annualInterestRate=rate;
	}
}

class TestSavingsAccount
{
	public static void main(String[] args)
	{
		
		System.out.println("\nSaver 1 :-\n");
		SavingsAccount s1=new SavingsAccount(2000);
		System.out.println("After 4% Rate: ");
		s1.modifyInterestRate(0.04);
		s1.calculateMonthlyInterest();
		System.out.println("After 5% Rate: ");
		s1.modifyInterestRate(0.05);
		s1.calculateMonthlyInterest();
		
		System.out.println("\n\nSaver 2 :-\n");
		SavingsAccount s2=new SavingsAccount(3000);
		System.out.println("After 4% Rate: ");
		s2.modifyInterestRate(0.04);
		s2.calculateMonthlyInterest();
		System.out.println("After 5% Rate: ");
		s2.modifyInterestRate(0.05);
		s2.calculateMonthlyInterest();
	}
}
