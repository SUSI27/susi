import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		StringBuilder s1=new StringBuilder();
		s1=s1.append(s);
		s1=s1.reverse();
		System.out.println(s1);
		for(int i=0;i<s1.length();i++)
		{
		if(s1.charAt(i)=='a')
		{
		int an=s1.indexOf("a");
		s1.delete(an,an+1);
		}
		else if(s1.charAt(i)=='e')
		{
		int en=s1.indexOf("e");
		s1.delete(en,en+1);
		}
		else if(s1.charAt(i)=='i')
		{
		int in=s1.indexOf("i");
		s1.delete(in,in+1);
		}
		else if(s1.charAt(i)=='o')
		{
		int on=s1.indexOf("o");
		s1.delete(on,on+1);
		}
		else if(s1.charAt(i)=='u')
		{
		int un=s1.indexOf("u");
		s1.delete(un,un+1);
		}
		}
		System.out.println(s1);
	}
}
