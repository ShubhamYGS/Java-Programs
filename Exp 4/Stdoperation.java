  package operation;
import math.*;
import java.util.*;

public class Stdoperation
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int ch;
		Mathoperation m=new Mathoperation();
		do
		{
		System.out.println("Enter your choice:\n1.mean\n2.median\n3.average\n4.exit");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
					m.mean();
					break;
			case 2:
					m.median();
					break;
			case 3:
					m.avg();
					break;
			case 4:
					System.exit(0);
					
			
		}
		}while(ch<4);
		
	}
}
