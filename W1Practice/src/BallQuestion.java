public class BallQuestion
{
	public static void main(String[] args)
	{
		double h = 100, s = 0;
		for ( int i = 1; i <= 2; ++i )
		{
			if ( i==1 )
			{
				s+=h;
				h=h/2;
			}else
			{
				s+=2*h;
				h=h/2;
			}
		}
		System.out.println("Fantan: "+ h);
		System.out.println("Total: "+ s);
	}
}
