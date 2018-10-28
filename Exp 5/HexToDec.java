package math.convert;
import java.util.*;
public class HexToDec
{
	Scanner sc = new Scanner( System.in );
	String num="";
	int dec_val = 0;
	public void hexToDec()
	{
		System.out.print("Enter a Hexadecimal number : ");
		num =sc.nextLine();
        int len = num.length();
        int base = 1;
        for (int i=len-1; i>=0; i--)
        {   
            if (num.charAt(i) >= '0' && num.charAt(i) <= '9')
            {
                dec_val += (num.charAt(i) - 48)*base;
                base = base * 16;
            }
            else if (num.charAt(i) >= 'A' && num.charAt(i) <= 'F')
            {
                dec_val += (num.charAt(i) - 55)*base;
                base = base*16;
            }
        }
        System.out.println("Hexadecmal to Decimal :"+dec_val);
	}
}
