import java.util.Scanner;

class date
{
	Scanner s=new Scanner(System.in);
	int d,m,y;
	date()
	{}
	date(int date,int month,int year)
	{
		d=date;
		m=month;
		y=year;
	}
	
	void setd()
	{
		System.out.println("Enter date: ");
		d=s.nextInt();
	}
	
	void setm()
	{
		System.out.println("Enter month: ");
		m=s.nextInt();
	}
	
	void sety()
	{
		System.out.println("Enter year: ");
		y=s.nextInt();
	}
	
	int getd()
	{
		return d;
	}
	
	int getm()
	{
		return m;
	}
	
	int gety()
	{
		return y;
	}
	
	void displayDate()
	{
		System.out.println(d+"/"+m+"/"+y);
	}
}

class prc14
{
	public static void main(String a[])
	{
		date d1=new date();
		d1.setd();
		d1.setm();
		d1.sety();
		d1.displayDate();
		date d2=new date(03,04,05);
		d2.displayDate();
	}
}
