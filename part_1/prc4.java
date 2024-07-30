import java.util.Scanner;

class prc4
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of days you want to enter the amount for: ");
		int n=s.nextInt();
		float a[]=new float [n];
		int i,sum=0;
		System.out.println("enter the values: ");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextFloat();
			sum+=a[i];
		}
		System.out.println("Sum of the amount is "+sum);
		
	}
}
