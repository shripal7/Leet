package leetcode;

public class JudgeRouteCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			boolean a = new JudgeRouteCircle().judgeCircle("URD");
			System.out.println(a);
	}
	
	public boolean judgeCircle(String moves)
	{
		int count = 0;
		for(int i=0;i<moves.length();i++)
		{
			
		switch(moves.charAt(i))
		{
		case 'U': 
			count++;
			break;
		case 'D':
			count--;
			break;
		case 'R':
			count++;
			break;
		case 'L':
			count--;
			break;
		default:
			break;
		}
		}
		if(count == 0)
		{
			return true;
		}
		return false;
	}
}
