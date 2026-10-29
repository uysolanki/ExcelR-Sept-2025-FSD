package day23;

import java.util.Scanner;

public class SinglyLinkedList {
public static void main(String[] args) {
	
	
	Node head=null;
	head=createList(head);
	display(head);
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
