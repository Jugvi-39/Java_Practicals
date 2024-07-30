import java.lang.*;
import java.util.Scanner;

class prc8
{
	static void array_count9(int []a)
	{
		int i;
		int count=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==9)
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void main(String args[])
	{
		int []arr={1,2,9};
		int []arr1={1,9,9};
		int []arr2={1,9,9,3,9};
		System.out.println("The number of 9(s) in array {1,2,9} is: ");
		array_count9(arr);
		System.out.println("The number of 9(s) in array {1,9,9} is: ");
		array_count9(arr1);
		System.out.println("The number of 9(s) in array {1,9,9,3,9} is: ");
		array_count9(arr2);
	}
}
