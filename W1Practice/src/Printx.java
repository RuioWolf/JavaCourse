import java.io.*;

public class Printx
{
	public static void main(String[] args)
	{
		String kg, xh;
		int k = 0, h = 10;
		for ( int i = 1; i <= h; ++i )
		{
			kg = "";
			xh = "";
			k = h - i;
			while ( kg.length() < k )
			{
				kg += " ";
			}
			while ( xh.length() < 2 * i - 1 )
			{
				xh += "*";
			}
			System.out.println(kg + xh);
		}
	}
}
