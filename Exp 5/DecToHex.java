package math.convert;
import java.util.*;
public class DecToHex
{
	Scanner sc = new Scanner( System.in );
	int num=0,rem=0;
	String str=""; 
	public void decToHex()
    {
		System.out.print("Enter a decimal number : ");
		num =sc.nextInt();
        int i = 0;
        while(num!=0)
        {   
            int temp  = 0;
            temp = num % 16;
            if(temp < 10)
            {
                str=(char)(temp + 48)+" "+str;
            }
            else
            {
                str=(char)(temp + 55)+" "+str;
            }
            num = num/16;
        }
        System.out.println("Decimal to Hexadecimal:"+str);
	}
}
