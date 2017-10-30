import java.util.Stack;

/*
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
 * determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but 
"(]" and "([)]" are not.
 * 
 */
public class Valid_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new Valid_Parentheses().Solution("]"));

	}
	
	public boolean Solution(String bracketsString)
	{
		char[] brackets = bracketsString.toCharArray();
		Stack<Character> s = new Stack<>(); 
		for(int i=0;i<brackets.length;i++)
		{
			switch(brackets[i])
			{
			case '{':
				s.push(brackets[i]);
				break;
			case '(':
				s.push(brackets[i]);
				break;
			case '[':
				s.push(brackets[i]);
				break;
			case '}' :
				if(!s.isEmpty() && s.peek() == '{')
				{
					s.pop();
				}
				else
				{
					return false;
				}
				break;
			case ')' :
				if(!s.isEmpty() && s.peek() == '(')
				{
					s.pop();
				}
				else
				{
					return false;
				}
				break;
			case ']' :
				if(!s.isEmpty() && s.peek() == '[' )
				{
					s.pop();
				}
				else
				{
					return false;
				}
				break;

			}
		
		}
		if(s.size() == 0)
		{
			return true;
		}
			
		return false;
	}

}
