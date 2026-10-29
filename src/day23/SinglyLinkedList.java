package day23;

import java.util.Scanner;

public class SinglyLinkedList {
	static Scanner sc=new Scanner(System.in);
	
public static void main(String[] args) {
	Node head=null;
	head=createList(head);
	System.out.println("\n Display List After Creation");
	display(head);
	head=addFirst(head);
	System.out.println("\n Display List After Adding at first position");
	display(head);
	
	addLast(head);
	System.out.println("\n Display List After Adding at Last position");
	display(head);
	
	addMid(head,3);
	System.out.println("\n Display List After Adding at Middle position");
	display(head);
}

private static void addMid(Node head, int position) {
	Node temp=head;
	int i=1;
	while(i<position-1)
	{
		temp=temp.next;
		i++;
	}
	
	System.out.println("\nEnter data for new node ");
	int data=sc.nextInt();
	Node nn=new Node(data);
	
	nn.next=temp.next;
	temp.next=nn;
}

private static void addLast(Node head) {
	Node temp=head;
	
	System.out.println("\nEnter data for new node ");
	int data=sc.nextInt();
	Node nn=new Node(data);
	
	while(temp.next!=null)
		temp=temp.next;
	
	temp.next=nn;
	
}

private static Node addFirst(Node head) {
	Node temp=head;
	System.out.println("\nEnter data for new node ");
	int data=sc.nextInt();
	Node nn=new Node(data);
	nn.next=head;
	head=nn;
	return head;
	
}

private static void display(Node head) {
	Node temp=head;
	while(temp!=null)
	{
		System.out.print(temp.data+"->");
		temp=temp.next;
	}
	System.out.print("NULL");
}

private static Node createList(Node head) {
	Node temp=null;
	Node nn;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of Linked List");
	int size=sc.nextInt();
	
	for(int i=1;i<=size;i++)
	{
		System.out.println("Enter data for node "+i+ " : ");
		int data=sc.nextInt();
		nn=new Node(data);
		
		if(head==null)
		{
			head=temp=nn;
		}
		else
		{
			temp.next=nn;
			temp=temp.next;
		}
	}
	return head;
}
}
