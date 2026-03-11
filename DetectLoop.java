class Node { int val; Node next; Node(int x){val=x;} }

public class DetectLoop {
    public static void main(String[] args) {
        Node head=new Node(3); head.next=new Node(2); head.next.next=new Node(0); head.next.next.next=new Node(-4);
        head.next.next.next.next=head.next;
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next; fast=fast.next.next;
            if(slow==fast){ System.out.println(true); return; }
        }
        System.out.println(false);
    }
}