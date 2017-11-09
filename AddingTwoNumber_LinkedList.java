package leetcode;

public class AddingTwoNumber_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		new AddingTwoNumber_LinkedList().addTwoNumbers(l1, l2);
		new AddingTwoNumber_LinkedList().showList(l1);

	}

	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	    	int overhead = 0;
			while(l1!=null || l2!=null)
			{
				l1.val = l1.val + l2.val + overhead;
				overhead = 0;
				if(l1.val > 9)
				{
					overhead = 1;
					l1.val = l1.val%10;
				}
				l1 = l1.next;
				l2 = l2.next;
			}
			/*while(l2!=null)
			{
				
				
			}*/
			
	    	return l1;
	    		
	    }
	    
	    public void showList(ListNode l1)
	    {
	    	while(l1!=null)
	    	{
	    		System.out.println(l1.val);
	    		l1 = l1.next;
	    	}
	    }
}


  
   class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }


