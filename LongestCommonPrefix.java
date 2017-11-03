/**
 * 
 */
package leetcode;

/**
 * @author Student
 *
 */
public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[] 
				{"Great","Gregarious","Greg"}));
	}
	
public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) {
        	return "";
        }
	int x = strs[0].length();
	for(int i=0; i < strs.length;i++)
	{
		if(strs[i].length() < x)
		{
			x = strs[i].length();
		}
	}
	int count = 0, min_count;
	min_count = x;
	for(int i=0;i<strs.length;i++)
	{
		count = 0;
		for(int j=0;j<x;j++) 
		{
			if(strs[0].charAt(j) == strs[i].charAt(j))
			{
					count++;
			}
			else
			{
				break;
			}
	
		}
		if(min_count > count)
		{
			min_count = count;
		}
		
	}
	if(count == 0)
	{
		return "";
	}
	return strs[0].substring(0, min_count);
        
    }

}
