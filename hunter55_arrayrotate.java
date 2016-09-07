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
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("Enter the position to rotate");
		int s=sc.nextInt();
		for(int j=s;j<n;j++)
		{
			System.out.println(a[j]);
		}
		for(int k=0;k<s;k++)
		{
			System.out.println(a[k]);
		}
		
	}
}
