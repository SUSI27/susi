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
		int d=sc.nextInt();
		int sum=0;
		if(d>0)
		{
		sum=d%10;
		while(d>=10)
		{
			d=d/10;
		}
		sum+=d;
		System.out.println(sum);
		}
		else
		System.out.println("cannot find the sum");
	}
}
