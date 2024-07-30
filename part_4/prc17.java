import java.util.*;

class parent
{
	void display()
	{
		System.out.println("This is parent class.");
	}
}

class child extends parent
{
	void display1()
	{
		System.out.println("This is child class.");
	}
}

public class prc17
{
	public static void main(String args[])
	{
		parent p=new parent();
		child c=new child();
		p.display();
	}
}
