import java.util.Scanner;

class rect
{
	int l,b;
	rect()
	{}
	rect(int len,int bred)
	{
		l=len;
		b=bred;
	}
	int area()
	{
		return l*b;
	}
}

class prc15
{
	public static void main(String a[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length and breadth: ");
		int l1=s.nextInt();
		int b1=s.nextInt();
		rect r1=new rect(l1,b1);
		System.out.println("The area is: "+r1.area());
	}
}
