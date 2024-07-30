import java.util.Scanner;

class prc5
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the choice of code from the following: ");
		System.out.println("1:Motor");
		System.out.println("2:Fan");
		System.out.println("3:Tube");
		System.out.println("4:Wires");
		System.out.println("5:Others");
		System.out.println("6:Exit");
		int ch=s.nextInt();
		double price=100;
		switch(ch)
		{
			case 1:
			price+=8;
			System.out.println("The total amount of motor is "+price);
			break;
			case 2:
			price+=12;
			System.out.println("The total amount of fan is "+price);
			break;
			case 3:
			price+=5;
			System.out.println("The total amount of tube is "+price);
			break;
			case 4:
			price+=7.5;
			System.out.println("The total amount of wires is "+price);
			break;
			case 5:
			price+=3;
			System.out.println("The total amount of others is "+price);
			break;
			default:
			break;
		}
	}
}
