import java.util.*;

class Degree
{
	void getDegree()
	{
		System.out.println("I got a degree.");
	}
}

class Undergraduate extends Degree
{
	void getDegree()
	{
		System.out.println("I am an undergraduate.");
	}
}

class Postgraduate extends Degree
{
	void getDegree()
	{
		System.out.println("I am a postgraduate.");
	}
}

public class prc21
{
	public static void main(String args[])
	{
		Degree d=new Degree();
		Undergraduate u=new Undergraduate();
		Postgraduate p=new Postgraduate();
		d.getDegree();
		u.getDegree();
		p.getDegree();
	}
}
