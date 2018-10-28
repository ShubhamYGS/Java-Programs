package math.convert;
import math.convert.*;
import java.util.Scanner;

class ConvertorApp
{
	public static void main(String Args[])
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		DecToBin db=new DecToBin();
		DecToOct doo=new DecToOct();
		DecToHex dh=new DecToHex();
		OctToDec od=new OctToDec();
		HexToDec hd=new HexToDec();
		BinToDec bd=new BinToDec();
		do
		{
			System.out.print("\n1.Decimal to Octal\n2.Decimal to Hex\n3.Decimal to Binary\n4.Octal to Decimal\n5.Hex to Decimal\n6.Binary to Decimal\n7.Exit\n");
			System.out.print("\nEnter Your Choice:");
			ch = sc.nextInt();
			
			switch(ch)
			{
				case 1: 
						doo.decToOct();
						break;
						
				case 2: 
						dh.decToHex();
						break;
						
				case 3: 
						db.decToBin();
						break;
						
				case 4: 
						od.octToDec();
						break;
						
				case 5: 
						hd.hexToDec();
						break;
						
				case 6: 
						bd.binToDec();
						break;
						
				case 7: break;
						
				default:System.out.print("\nInvalid Choice\n");
				
			}
		}while(ch!=7);
	
	}
}
