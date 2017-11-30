package LeetCode;

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}

public class S02_AddTwoNumbers {
	public static void main(String[] argus) {
		ListNode l1=new ListNode(2);
		l1.next=new ListNode(4);
		l1.next.next=new ListNode(3);		
		ListNode l2=new ListNode(5);
		l2.next=new ListNode(6);
		l2.next.next=new ListNode(4);			
		ListNode l=addTwoNumbers(l1,l2);		
		while(l!=null)
		{
			System.out.println(l.val);
			l=l.next;
		}
	}	
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l=new ListNode(0);
        ListNode temp=l;
        int carry=0;
        while(l1!=null||l2!=null||carry!=0)
        {
        	int sum=(l1==null?0:l1.val)+(l2==null?0:l2.val)+carry;
        	carry=sum/10;
        	l.next=new ListNode(sum%10);
        	l=l.next;
        	l1=l1.next;
        	l2=l2.next;
        }
    	return temp.next;
    }
}
