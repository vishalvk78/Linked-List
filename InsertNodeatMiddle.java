import java.util.*;
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
	    
	     System.out.println("Enter the position of enter ");
	     Scanner sc=new Scanner(System.in);
	     int pos=sc.nextInt();
	    Node temp1=head;
	    for(int i=0;i<pos-2;i++)
	       {
	         temp1=temp1.next;
	       }
	    new_node.next=temp1.next;
	    temp1.next=new_node;                       
	   
	    printList(head);
		
	}
}
