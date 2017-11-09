package leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		List<String> str = new FizzBuzz().fizzbuzz(2);
	}

	public List<String> fizzbuzz(int n)
	{
		List<String> ans = new ArrayList<String>();
			
		for(int i=1;i<=n;i++)
		{
			switch(i%15)
			{
			case (0):
				ans.add("FizzBuzz");
				break;
			case 3:
			case 6:
			case 9:
			case 12: 
				ans.add("Fizz");
				break;
			case (5):case (10):
				ans.add("Buzz");
			break;
			default:
				ans.add(""+i);
				break;
			}
		}
		
		System.out.println(ans);
		return ans;
	}
}
