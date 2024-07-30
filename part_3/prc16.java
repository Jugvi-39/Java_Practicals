import java.util.Scanner;

class complex
{
	Scanner s=new Scanner(System.in);
	int r,i;
	
	void readdata()
	{
		System.out.println("Enter r: ");
		r=s.nextInt();
		System.out.println("Enter i: ");
		i=s.nextInt();
	}
	void sum(complex c)
	{
		int sumr=r+c.r;
		int sumi=i+c.i;
		System.out.println("The sum is: "+sumr+"+"+sumi+"i");
	}
	void sub(complex c)
	{
		int subr=r-c.r;
		int subi=i-c.i;
		System.out.println("The difference is: "+subr+"+"+subi+"i");
	}
	void mul(complex c)
	{
		int mulr=r*c.r;
		int muli=i*c.i;
		System.out.println("The product is: "+mulr+"+"+muli+"i");
	}
	
}

class prc16
{
	public static void main(String a[])
	{
		complex c1=new complex();
		complex c2=new complex();
		c1.readdata();
		c2.readdata();
		c1.sum(c2);
		c1.sub(c2);
		c1.mul(c2);
	}
}
