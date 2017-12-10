import java.util.Scanner;

public class BEGIN4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if ( n == 1 || n == 2 )
		{
			System.out.println(1);
		} else
		{
			int[] f = new int[n + 1];
			f[1] = f[2] = 1;
			for ( int i = 3; i <= n; ++i )
			{
				f[i] = (f[i - 1] + f[i - 2]) % 10007;
			}
			System.out.println(f[n]);
		}
	}
}
