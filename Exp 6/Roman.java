import java.util.*;

class Roman
{
	static String romanNumeral;
	static int decimalNum;
	public static String IntegerToRoman()
	{
		String roman="";
		int repeat,n;
		int magnitude[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String symbol[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		Scanner sc=new Scanner(System.in);
		System.out.println(".............CONVERSION OF INTEGER TO ROMAN.................");
		System.out.println("Enter the integer value=");
		n=sc.nextInt();
		try
		{
			if(n<1||n>3999)
			{
				throw new NumberFormatException("Enter a valid value less than 3999 but greater than zero:");
			}
			else
			{
				repeat=n;
				for(int x=0;n>0;x++)
				{
					repeat=n/magnitude[x];
					for(int i=1;i<=repeat;i++)
					{
						roman=roman+symbol[x];
					}
					n=n%magnitude[x];
				}
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("Exception="+e);
		}
		return roman;
	}
	public void convertToDecimal()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println(".............CONVERSION OF ROMAN TO INTEGER.................");
		System.out.println("Enter the Roman Number");
		romanNumeral=scan.nextLine();
		romanNumeral=romanNumeral.toUpperCase();
		int l=romanNumeral.length();
		int num=0;
		int previousnum=0;
		for(int i=l-1;i>=0;i--)
		{
			char x=romanNumeral.charAt(i);
			x=Character.toUpperCase(x);
			switch(x)
			{
				case 'I':
							previousnum=num;
							num=1;
							break;
				case 'V':
							previousnum=num;
							num=5;
							break;
				case 'X':
							previousnum=num;
							num=10;
							break;
				case 'L':
							previousnum=num;
							num=50;
							break;
				case 'C':
							previousnum=num;
							num=100;
							break;
				case 'D':
							previousnum=num;
							num=500;
							break;
				case 'M':
							previousnum=num;
							num=1000;
							break;
			}
			if(num<previousnum)
			{
				decimalNum=previousnum-num;
			}
			else
			{
				decimalNum=previousnum+num;
			}
			printDecimal();
		}
	}
	public static void printDecimal()
	{
		System.out.println("Decimal Number stored is:"+decimalNum);
	}
	void test()
	{
		int n,ch;
		do
		{
			System.out.println("Enter your choice:");
			Roman rmtoD=new Roman();
			System.out.println("\n1.Convert Integer to Roman \n2.Convert Roman to Integer\n3.Exit");
			Scanner sc = new Scanner(System.in);
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
						System.out.println(rmtoD.IntegerToRoman());
						break;
				case 2:
						rmtoD.convertToDecimal();
						break;
				case 3:
						break;
			}
		}while(ch!=3);
	}
	public static void main(String[]args)
	{
		Roman rmt=new Roman();
		rmt.test();
	}
}		
