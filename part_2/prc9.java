import java.util.Scanner;

class prc9
{
	static void double_char(String s)
	{
		int i;
		for(i=0;i<s.length();i++)
		{
			char s1=s.charAt(i);
			System.out.print(s1);
			System.out.print(s1);
		}
	}
	
	public static void main(String args[])
	{
		String str="The";
		double_char(str);
		System.out.println("");
		double_char("AAbb");
		System.out.println("");
		double_char("Hi-There");
	}
}
