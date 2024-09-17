import java.util.*;

class Even extends Thread 
{
    private int number;

    public void setNumber(int number) 
	{
        this.number = number;
    }

    public void run() 
	{
        while (true) 
		{
            if (number % 2 == 0 && number != 0) 
			{
                int square = number * number;
                System.out.println("Square of " + number + ": " + square);
                number = 0; // Reset number
            }
            try 
			{
                Thread.sleep(100);
            } 
			catch (InterruptedException e) 
			{
                e.printStackTrace();
            }
        }
    }
}

class Odd extends Thread 
{
    private int number;

    public void setNumber(int number) 
	{
        this.number = number;
    }

    public void run() 
	{
        while (true) 
		{
            if (number % 2 != 0 && number != 0) 
			{
                int cube = number * number * number;
                System.out.println("Cube of " + number + ": " + cube);
                number = 0; // Reset number
            }
            try 
			{
                Thread.sleep(100);
            } 
			catch (InterruptedException e) 
			{
                e.printStackTrace();
            }
        }
    }
}

public class prc34 
{
    public static void main(String[] args) 
	{
        Even e2 = new Even();
        Odd o3 = new Odd();
        e2.start();
        o3.start();

        for (int i = 1; i <= 10; i++) 
		{
            //System.out.println("number is: " + i);
            if (i % 2 == 0) 
			{
                e2.setNumber(i);
            }
			else 
			{
                o3.setNumber(i);
            }
            try 
			{
                Thread.sleep(1000);
            } 
			catch(InterruptedException e) 
			{
                e.printStackTrace();
            }
        }
    }
}
