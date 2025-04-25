
package linkedlist;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class intersection {
    
    
    public static int intersectionpoint(Node headA,Node headB){
        
         Node temp1 = headA;
         Node temp2 = headB;
         int c1=0;
         int c2=0;
         while(temp1!=null){
            c1++;
            temp1=temp1.next;
         }
         while(temp2!=null){
            c2++;
            temp2=temp2.next;
         }
        int c = (c1>c2)?c1-c2:c2-c1;
        for(int i=0;i<c;i++){
            headA=headA.next;
        }
        while(headA.data!=headB.data){
            headA=headA.next;
            headB=headB.next;
        }
        return headA.data;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next=c;
        c.next = d;
        d.next=e;
        Node a1 = new Node(0);
        Node a2= new Node(3);
        Node a3 = new Node(4);
        Node a4 = new Node(5);
      
      a1.next=a2;
      a2.next =a3;
      a3.next=a4;
       
      System.out.println(intersectionpoint(a, a1));
    
    }
}
