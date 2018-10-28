import java.util.*;
import java.io.*;	
class FileInput
{
	static File F1;
	static int later;	
	static void disp()throws IOException
	{
		FileReader rd=new FileReader(F1);
		while((later=rd.read())!=-1)
		{
			System.out.print((char)later);
		}
		
		rd.close();
	}
	public static void main(String[] aaa)throws IOException,Exception
	{
		int l,f=0;
		Scanner sc=new Scanner(System.in);
		
		String name,city,ph,flname;
		char ad,ch;
		double age,height,wight,phno;
		System.out.print("\n\tEnter File name :");
		flname=sc.next();
		F1=new File(flname);
		if(F1.createNewFile())
		{
			System.out.println("\tFile Created...");			
		}
		else
		{
			System.out.println("\tExists.....");
			disp();						
		}
	/*	FileReader rd=new FileReader(F1);
		while((later=rd.read())!=-1)
		{
			System.out.print((char)later);
		}
		
		rd.close();
		
	*/	for(;;)
		{
		System.out.print("\n\tWant to add new data...? :");
		ad=sc.next().charAt(0);
		if(ad=='Y' || ad== 'y')
		{

			FileWriter wr=new FileWriter(F1,true);
		
			System.out.print("\n\tEnter Name : ");
			name=sc.next();
			System.out.print("\n\tEnter City : ");			
			city=sc.next();
			do{
				System.out.print("\n\tEnter Phone No. : ");			
				ph=sc.next();
				f=0;
				l=ph.length();
				if(l>11 || l<9)
				{
					System.out.println("\tInvalid no....?");
					f=1;
				}
			}while(f!=0);
			//phno=(double)ph;
			System.out.print("\n\tEnter Age : ");			
			age=sc.nextDouble();
			System.out.print("\n\tEnter Height : ");
			height=sc.nextDouble();
			System.out.print("\n\tEnter Wight : ");					
			wight=sc.nextDouble();
			
			wr.write("\n");
			wr.write("\n\tName :"+name);
			wr.write("\n\tCity :"+city);
			wr.write("\n\tPhone No. :"+ph);
			wr.write("\n\tAge :"+age);
			wr.write("\n\tHeight :"+height+"ft");
			wr.write("\n\tWeight :"+wight+"kg");
			wr.close();
			

		}
		else
		{
		
			System.out.print("\tYou want to Exit? :");
			ch=sc.next().charAt(0);
			if(ch=='Y'|| ch=='y')
				java.lang.System.exit(0);
				
			
		}
		}
	}

}




