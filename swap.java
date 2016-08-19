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
		int t;
		System.out.println("Before Swapping " +a+ " " +b);
		t=a;
		a=b;
		b=t;
		System.out.println("After Swapping " +a+ " " +b);	
	}
	
}
