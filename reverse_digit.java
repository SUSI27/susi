import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner d=new Scanner(System.in);
		int a=d.nextInt();
		int r=0;
		while(a!=0)
		{
			r=r*10;
			r=r+a%10;
			a=a/10;
		}
		System.out.println("The reversed digit is " +r);
	}
}
