import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String s=new String();
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		char []a=s.toCharArray();
		Set<Character> s1=new LinkedHashSet();
		for(int i=0;i<a.length;i++)
		{
		s1.add(a[i]);
		}
		System.out.println(s1);
		
	}
}
