import java.util.*;

interface AdvancedArithmetic
{
	int divisorSum(int n);
}

class MyCalculator implements AdvancedArithmetic
{
	public int divisorSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		return sum;
	}
}

public class prc22 
{
	public static void main(String args[])
	{
		MyCalculator m=new MyCalculator();
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number you want to find the sum of divisors for: ");
		int n=s.nextInt();
		System.out.println("The sum of its divisors is: "+m.divisorSum(n));
	}
}
