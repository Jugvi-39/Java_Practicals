import java.lang.*;
import java.util.Scanner;

class prc7
{
	static int front_times(String s, int n)
	{
		String s1=s.substring(0,3);
		int i;
		for(i=0;i<n;i++)
		{
			System.out.print(s1);
		}
		return 0;
	}
	public static void main(String a[])
	{
		/*Scanner s=new Scanner(System.in);
		System.out.println("Enter your string: ");
		String str=s.nextLine();
		System.out.println("Enter the number of times you want to print the string: ");
		int num=s.nextInt();*/
		
		String str="Chocolate";
		front_times(str,2);
		System.out.println(" ");
		front_times(str,3);
		System.out.println(" ");
		front_times("Abc",3);
		System.out.println(" ");
	}
}
