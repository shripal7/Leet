package leetcode;

import java.math.BigInteger;

public class HammingDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println(new HammingDistance().hammingDistance(1,4));
	}

	public int hammingDistance(int x, int y)
	{
		if(x == y)
			return 0;
		String _x = Integer.toBinaryString(x);
		String _y = Integer.toBinaryString(y);
		int x_size = _x.length();
		int y_size = _y.length();
		int count = 0;
		int k = (x_size>y_size ? x_size : y_size );
		if(x_size > y_size)
		{
			for(int i=y_size;i<x_size;i++)
			{
				_y = "0" + _y;
			}
		}
		else
		{
			for(int i=x_size;i<y_size;i++)
			{
				_x = "0" + _x;
			}
		}
		for(int i = k-1; i>=0;i--)
		{			
			if(_x.charAt(i) != _y.charAt(i))
				count++;
		}
		
		
		return count;
		
	}
	
	
}
