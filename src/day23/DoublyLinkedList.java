package day23;

import java.util.Scanner;

public class DoublyLinkedList {
	static Scanner sc=new Scanner(System.in);
	
public static void main(String[] args) {
	DNode head=null;
	head=createList(head);
	System.out.println("\n Display List After Creation");
	display(head);
//	head=addFirst(head);
//	System.out.println("\n Display List After Adding at first position");
//	display(head);
//	
//	addLast(head);
//	System.out.println("\n Display List After Adding at Last position");
//	display(head);
//	
//	addMid(head,3);
//	System.out.println("\n Display List After Adding at Middle position");
//	display(head);
}

private static void addMid(DNode head, int position) {
	DNode temp=head;
	int i=1;
	while(i<position-1)
	{
		temp=temp.next;
		i++;
	}
	
	System.out.println("\nEnter data for new DNode ");
	int data=sc.nextInt();
	DNode nn=new DNode(data);
	
	nn.next=temp.next;
	temp.next=nn;
}

private static void addLast(DNode head) {
	DNode temp=head;
	
	System.out.println("\nEnter data for new DNode ");
	int data=sc.nextInt();
	DNode nn=new DNode(data);
	
	while(temp.next!=null)
		temp=temp.next;
	
	temp.next=nn;
	
}

private static DNode addFirst(DNode head) {
	DNode temp=head;
	System.out.println("\nEnter data for new DNode ");
	int data=sc.nextInt();
	DNode nn=new DNode(data);
	nn.next=head;
	head=nn;
	return head;
	
}

private static void display(DNode head) {
	DNode temp=head;
	while(temp!=null)
	{
		System.out.print(temp.data+"->");
		temp=temp.next;
	}
	System.out.print("NULL");
}

private static DNode createList(DNode head) {
	DNode temp=null;
	DNode nn;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of Linked List");
	int size=sc.nextInt();
	
	for(int i=1;i<=size;i++)
	{
		System.out.println("Enter data for DNode "+i+ " : ");
		int data=sc.nextInt();
		nn=new DNode(data);
		
		if(head==null)
		{
			head=temp=nn;
		}
		else
		{
			temp.next=nn;
			nn.prev=temp;
			temp=temp.next;
		}
	}
	return head;
}
}
