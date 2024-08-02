import java.util.*;

class rectangle
{
	double length,breadth;
	
	rectangle()
	{}
	
	rectangle(double l, double b)
	{
		length=l;
		breadth=b;
	}
	
	void area()
	{
		System.out.println("The area is: "+length*breadth);
	}
	
	void perimeter()
	{
		System.out.println("The perimeter is: "+2*(length+breadth));
	}
}

class square extends rectangle
{
	square()
	{}
	square(double s)
	{
		super(s,s);
	}
	void area()
	{
		System.out.println("The area is: "+length*breadth);
	}
	
	void perimeter()
	{
		System.out.println("The perimeter is: "+4*length);
	}
}

public class prc19
{
	public static void main(String args[])
	{
		/*rectangle r=new rectangle(2,6);
		System.out.println("For rectangle: ");
		r.area();
		r.perimeter();
		System.out.println();
		square s=new square(2);
		System.out.println("For square: ");
		s.area();
		s.perimeter();*/
		
		rectangle[] shapes=new rectangle[3];
		shapes[0] = new rectangle(2, 6);
		shapes[1] = new square(2);
		shapes[2] = new rectangle(4, 8);
		
		for(rectangle shape : shapes) 
		{
			if(shape instanceof square) 
			{
				System.out.println("For square: ");
			} 
			else 
			{
				System.out.println("For rectangle: ");
			}
			shape.area();
			shape.perimeter();
			System.out.println();
		}
	}
}
