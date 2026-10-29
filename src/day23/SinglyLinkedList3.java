package day23;

import java.util.Scanner;

public class SinglyLinkedList3 {
public static void main(String[] args) {
	Node head=null;
	int arr[]= {7,9,2,3,5};
	head=createList(head,arr);
	System.out.println("Display After Creation");
	display(head);
	sort(head);
	System.out.println("\nDisplay After Sorting");
	display(head);
}

private static void sort(Node head) {
	for(Node i=head;i!=null;i=i.next)
	{
		for(Node j=i.next;j!=null;j=j.next)
		{
			if(i.data>j.data)
			{
				int temp=i.data;
				i.data=j.data;
				j.data=temp;
			}
		}
	}
	
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

private static Node createList(Node head,int arr[]) {
	Node temp=null;
	Node nn;
	
	for(int i=0;i<arr.length;i++)
	{
		
		nn=new Node(arr[i]);
		
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
