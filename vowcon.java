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
		char a=sc.next().charAt(0);
		if(Character.isLetter(a))
		{
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
		System.out.println("The given character " +a+ " is vowel");
		else
		System.out.println("the given character " +a+ " is consonant");
		}
		else
		{
			System.out.println("the given value " +a+ " is not a character");
		}
	}
}
