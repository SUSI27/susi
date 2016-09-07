import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int temp;
		int a=n;
		int m=1;
		while(n!=0)
		{
			temp=n%10;
			if(temp==0)
			{
				System.out.println("Cannot find seed value as it contains zero");
				break;
			}
			m=m*temp;
			n=n/10;
		}
		a=a*m;
		System.out.println(a);
		
	}
}
