import java.util.Scanner;

public class BEGIN3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int r=sc.nextInt();
		double sum=r*r*Math.PI;
		System.out.printf("%.7f",sum);
	}
}
