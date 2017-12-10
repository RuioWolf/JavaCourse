import java.util.Scanner;

public class BEGIN2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long sum=0;
		if ( n>=1&&n<=1000000000 )
		{
			for(int i=1;i<=n;++i)
			{
				sum+=i;
			}
			System.out.print(sum);
		}
	}
}
