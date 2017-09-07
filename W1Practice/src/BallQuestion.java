//一个球从100米的地方掉下来，每次反弹的高度是上一次的一般，问10次以后球总共经过多少米，第10次时候反弹的高度是多少

public class BallQuestion
{
	public static void main(String[] args)
	{
		double h = 100, s = 0;
		for ( int i = 1; i <= 10; ++i )
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
