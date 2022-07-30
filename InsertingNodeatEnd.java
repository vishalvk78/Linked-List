public class Main
{   
    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    public static void printList(Node head)
    {
         
	    //Print the element of Node
	    while(head!=null)
	   { 
	       System.out.print(head.data + " ");
	       head=head.next;
	   }
	   
    }
    
	public static void main(String[] args) {
	    
	    // the create the element of Node
	    Node head=new Node(10);
	    head.next=new Node(20);
	    head.next.next=new Node(30);
	    head.next.next.next=new Node(40);
	    Node new_node=new Node(5);
	    
	    Node temp=head;
	    while(temp.next!=null)
	       {
	          temp=temp.next;
	       }
	       temp.next=new_node;
	   
	    printList(head);
		
	}
}
