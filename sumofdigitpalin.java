import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		int sum=0;
		int r=0;
		int temp;
		while(a!=0)
		{
		temp=a%10;
		sum+=temp;
		a=a/10;
		}
		int s=sum;
		while(sum!=0)
		{
			r=r*10;
			r=r+sum%10;
			sum=sum/10;
			
		}
		if(s==r)
		System.out.println("the sum of the number is a palindrome");
		else
		System.out.println("the sum of the number is not a palindrome");
	}
}
