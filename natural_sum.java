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
		int n=sc.nextInt();
		int sum=0;
		int i=0;
		if(n>0)
		{
		while(i<=n)
		{
			sum+=i;
			i++;
		}
		System.out.println("The sum of " +n+ " natural numbers is " +sum);
		}
		else
		{
			System.out.println("0");
		}
	}
}
