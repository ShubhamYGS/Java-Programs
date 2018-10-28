package math.convert;
import java.util.*;
public class DecToBin
{
	Scanner sc = new Scanner( System.in );
	int num=0,rem=0;
	String str=""; 
	public void decToBin()
	{
		System.out.print("Enter a decimal number : ");
		num =sc.nextInt();
		while(num>0)
		{
			rem=num%2; 
			str=rem+" "+str; 
			num=num/2;
		}
		System.out.println("Decimal to Binary:"+str);
	}
}
