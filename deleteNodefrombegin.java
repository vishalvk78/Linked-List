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
	    Node temp=head;
	    while(temp!=null)
	   { 
	       System.out.print(temp.data + " ");
	       temp=temp.next;
	   }
	   
    }
    
	public static void main(String[] args) {
	    
	    // the create the element of Node
	    Node head=new Node(10);
	    head.next=new Node(20);
	    head.next.next=new Node(30);
	    head.next.next.next=new Node(40);
	    
	    //delete node at beginning
	    Node temp=head;
	    temp=temp.next;
	    head=temp;
	    
	    //print the data in node
	    printList(head);
		
	}
}
