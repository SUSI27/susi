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
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b&&a>c)
		System.out.println(a+ " is larger");
		else if(b>c&&b>a)
		System.out.println(b+ " is larger");
		else
		System.out.println(c+ " is larger");
	}
}
