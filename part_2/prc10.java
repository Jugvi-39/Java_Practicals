import java.util.*;

class prc10
{
	public static String sortString(String s) 
	{
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

	public static void main(String a[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s1=s.nextLine();
		
		int len=s1.length();
		System.out.println("The length of the given string is: "+len);
		
		String up=s1.toUpperCase();
		String low=s1.toLowerCase();
		System.out.println("The string in upper case is: "+up);
		System.out.println("The string in lower case is: "+low);
		
		int i;
		System.out.println("The reversed string is: ");
		for(i=len-1;i>=0;i--)
		{
			System.out.print(s1.charAt(i));
		}
		
		System.out.println("The sorted string is: "+sortString(s1));
		
		
		
	}
}
