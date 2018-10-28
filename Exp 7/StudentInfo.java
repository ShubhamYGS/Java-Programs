import java.io.*;
import java.util.*;
class StudentInfo
{

	public static void main(String[] arg)throws IOException
	{
		String name,city,age,height;
		FileOutputStream out=new FileOutputStream("Newfile.txt");
	
		char []ch=new char[100];
		int i,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter Name : ");
		name=sc.nextLine();
		ch=name.toCharArray();
		out.write('\n');
		for(i=0;i<name.length();i++)
		{
			
			out.write(ch[i]);
		}
		System.out.print("\nEnter Age : ");
		age=sc.next();
		ch=age.toCharArray();
		out.write('\n');
		for(i=0;i<age.length();i++)
		{
			out.write(ch[i]);
		}
		
		System.out.print("\nEnter Height : ");
		height=sc.next();
		ch=height.toCharArray();
		out.write('\n');
		for(i=0;i<height.length();i++)
		{
			out.write(ch[i]);
		}
		
		System.out.print("\nEnter City : ");
		city=sc.next();
		ch=city.toCharArray();
		out.write('\n');
		for(i=0;i<city.length();i++)
		{
			out.write(ch[i]);
		}
		out.close();
		FileInputStream in=new FileInputStream("Newfile.txt");
		while((c=in.read())!=-1)
		{
			System.out.print((char)c);
		}
		in.close();
		
	}
}
