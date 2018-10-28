package math.convert;
import java.util.*;
public class BinToDec
{
	Scanner sc = new Scanner( System.in );
	String num="";
	public void binToDec()
	{
		System.out.print("Enter a Binary number : ");
		num =sc.nextLine();
		int dec_value = 0;
        int base = 1;
        int len = num.length();
        for (int i = len - 1; i >= 0; i--)
        {
            if (num.charAt(i) == '1')
                dec_value += base;
            base = base * 2;
        }
        System.out.println("Binary to Decimal :"+dec_value);
    }
}
