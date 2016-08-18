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
		int sum=0;
		if(a>0)
		{
		for(int i=1;i<=a;i++)
		sum+=i;
		System.out.println("the sum of all numbers less than " +a+ " is " +sum);
		}
		else
		 System.out.println("cannot find the sum");
	}
}
