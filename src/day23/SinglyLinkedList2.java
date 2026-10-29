package day23;

import java.util.Scanner;

public class SinglyLinkedList2 {
public static void main(String[] args) {
	Node2 head=null;
	head=createList(head);
	display(head);
}

private static void display(Node2 head) {
	Node2 temp=head;
	while(temp!=null)
	{
		System.out.print(temp.data+"->");
		temp=temp.next;
	}
	System.out.print("NULL");
}

private static Node2 createList(Node2 head) {
	Node2 temp=null;
	Node2 nn;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of Linked List");
	int size=sc.nextInt();
	
	for(int i=1;i<=size;i++)
	{
		System.out.println("Enter Roll number for node "+i+ " : ");
		int rno=sc.nextInt();
		
		System.out.println("Enter Name for node "+i+ " : ");
		String name=sc.next();
		
		System.out.println("Enter Percentage for node "+i+ " : ");
		double per=sc.nextDouble();
		
		nn=new Node2(new Student(rno,name,per));
		
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
