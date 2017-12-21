import java.util.Scanner;

public class BASIC3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String zm = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String out;
		for(int h=1;h<=n;++h)
		{
			out = zm.substring(0,m-h);
			if(h!=1)
			System.out.println(out);
		}
	}
}
