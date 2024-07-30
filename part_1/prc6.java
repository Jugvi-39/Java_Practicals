import java.lang.*;
import java.util.Scanner;

class prc6
{
	public static void main(String []args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numer of days you want to work out: ");
		int n=s.nextInt();
		int n1=0,n2=1,i,n3;
		System.out.print(n1+" "+n2);
		for(i=2;i<n;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
}
