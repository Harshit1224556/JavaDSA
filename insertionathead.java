
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
class linkedlist{
    Node head = null;
    Node tail = null;
 
    void insertathead(int value){
        Node temp =  new Node(value);

        if(head==null){
            head = temp;
            tail = temp;
        }
        else{
            temp.next = head;
            head = temp;

        }
    }

    void insertatend(int value){
       
        Node temp = new Node(value);
        if(head==null){
            head = temp;
            tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
    }
 
    void insertatpos(int value,int pos){
        Node temp = new Node(value);
        Node s = head;
        if(pos==size()-1){
            insertatend(value);
            return;
        }
        else if(pos==0){
            insertathead(value);
            return;
        }
        else if(pos<0) System.out.println("Invalid position");
        else{
        for(int i=1;i<pos;i++){
            s = s.next;

        }
       temp.next = s.next;
       s.next = temp;
    }

    }

     int size(){
        Node  c = head;
        int count = 0;
        while(c!=null){
         c=c.next;
         count++;
        }
        return count;
     }

     void delete(int pos){
        Node temp = head;
        for(int i=1;i<pos;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
     }

    void display(){
        Node temps = head;
        while(temps!=null){
            System.out.println(temps.data);
            temps = temps.next;
        }
    }
    
}
public class insertionathead {
    public static void main(String[] args) {
        
linkedlist ll = new linkedlist();
// ll.insertathead(10);
// ll.insertathead(20);
// ll.insertathead(30);
// ll.insertathead(40);
// ll.insertathead(50);
// this dispaly the list like that 50->40->30->20->10

// ll.insertathead(10);
ll.insertatend(10);
ll.insertatend(20);
ll.insertatend(30);
ll.insertatend(40);
ll.insertatend(50);
ll.insertatpos(80,2);
ll.delete(2);
//here the insertion takes place at the end of the linkedlist
ll.display(); 

    }
}

