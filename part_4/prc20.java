import java.util.*;

class shape
{
	void print()
	{
		System.out.println("This is a shape.");
	}
}

class rectangle extends shape
{
	void print1()
	{
		System.out.println("This is rectangular shape.");
	}
}

class circle extends shape
{
	void print2()
	{
		System.out.println("This is circular shape.");
	}
}

class square extends rectangle
{
	void print3()
	{
		System.out.println("Square is a rectangle.");
	}
}

public class prc20
{
	public static void main(String args[])
	{
		square s=new square();
		s.print();
		s.print1();
	}
}
