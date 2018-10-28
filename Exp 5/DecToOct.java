package math.convert;
import java.util.*;
public class DecToOct
{
	Scanner sc = new Scanner( System.in );
	int num=0,rem=0;
	String str=""; 
	public void decToOct()
	{
		System.out.print("Enter a decimal number : ");
		num =sc.nextInt();
		while (num!= 0) 
        {
            rem=num % 8;
			str=rem+str;
            num = num / 8;
        }
		System.out.println("Decimal to Octal:"+str);
	}

}
