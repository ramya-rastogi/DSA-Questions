class ListNode { int val; ListNode next; ListNode(int x){val=x;} }

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head=new ListNode(1); head.next=new ListNode(2); head.next.next=new ListNode(3);
        ListNode prev=null,curr=head;
        while(curr!=null){ ListNode next=curr.next; curr.next=prev; prev=curr; curr=next; }
        while(prev!=null){ System.out.print(prev.val+" "); prev=prev.next; }
    }
}