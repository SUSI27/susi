import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sa=new Scanner(System.in);
		System.out.println("Enter the vertices 1:");
		int x1=sa.nextInt();
		int y1=sa.nextInt();
		System.out.println("Enter the vertices 2:");
		int x2=sa.nextInt();
		int y2=sa.nextInt();
		System.out.println("Enter the vertices 1 for second rectangle:");
		int a1=sa.nextInt();
		int b1=sa.nextInt();
		System.out.println("Enter the vertices 2 for second rectangle:");
		int a2=sa.nextInt();
		int b2=sa.nextInt();
		if((x1>=a1)&&(y1>=b1)||(a2<=x2)&&(b2<=y2))
			System.out.println("true");
		else if((x1<=a1)&&(y1<=b1)||(a2>=x2)&&(b2>=y2))
			System.out.println("true");
		else 
			System.out.println("false");
	}
}
