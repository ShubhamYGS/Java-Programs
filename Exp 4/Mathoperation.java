package math;
import java.util.*;
public class Mathoperation
{
	int num1,num2,num3,result,cnt,i,n;
	int num[];
	float mean,median;
	Scanner sc=new Scanner(System.in);
	public void mean()
	{
		System.out.println("\nEnter the count of the numbers:");
		cnt=sc.nextInt();
		mean=cnt/2;
		System.out.println("\nThe mean is :"+mean);
	}
	public void median()
	{
		
		System.out.println("\nEnter the count of the number:");
		n=sc.nextInt();
		num=new int[n];
		System.out.println("\nEnter the numbers:\n");
		for(i=0;i<n;i++)
		{
		num[i]=sc.nextInt();
		}
		if(n%2==0) 
		{
			int i;
			i=n/2;
			median=(num[i]+num[i-1]) / 2;
		}
		else
		{
			int i;
			i=n/2-1;
			median=num[i];
		}
		System.out.println("Median = "+median);
	}
    public void avg()
	{
		System.out.println("\nEnter 3 Numbers:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		result=num1+num2+num3;
		result=result/3;
		System.out.println("\nThe Average Is: "+result);
	}	
	
}
