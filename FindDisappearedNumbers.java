package leetcode;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;

public class FindDisappearedNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1};
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list = new FindDisappearedNumbers().findDisappearedNumbers(arr);
		System.out.println();
	}
	
	public ArrayList<Integer> findDisappearedNumbers(int[] arr)
	{
		HashMap<Integer, Integer> num = new HashMap<>();
		ArrayList<Integer> missing = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			num.put(arr[i], 1);
		}
		for(int i=1;i<=arr.length;i++)
		{
			if(!num.containsKey(i))
			{
				missing.add(i);
				System.out.println(i);
			}
		}
		return missing;
	}

}
