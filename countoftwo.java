import java.util.Scanner;

public class countoftwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			int a=i;
			while(a!=0)
			{
			int temp=a%10;
			if(temp==2)
				count++;
			a=a/10;
			}
			
		}
		System.out.println(count);
	}

}
