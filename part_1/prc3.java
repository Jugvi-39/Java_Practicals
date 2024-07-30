import java.util.Scanner;

class prc3
{
	public static void main(String []args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the distance: ");
		float d=s.nextFloat();
		
		System.out.println("Enter time in hr,min,sec: ");
		float hr=s.nextFloat();
		float min=s.nextFloat();
		float sec=s.nextFloat();
		
		float t=(hr*60*60)+(min*60)+sec;
		float speed=d/t;
		System.out.println("Speed in m/s is "+speed);
		
		float sk=speed*(18/5);
		System.out.println("Speed in km/h is "+sk);
		
		System.out.println("Speed in mi/h is "+(sk/1.609));
		
	}
}
