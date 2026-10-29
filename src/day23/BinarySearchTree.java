package day23;

import java.util.Scanner;

public class BinarySearchTree {

	public static void main(String[] args) {
		DNode root =null;
		
		root=createBST(root);
		System.out.println("\n PreOrder : ");
		preOrder(root);
		System.out.println("\n PostOrder : ");
		postOrder(root);
		System.out.println("\n InOrder : ");
		inOrder(root);
	}

	private static void inOrder(DNode root) {
		if(root!=null)
		{
			inOrder(root.prev);
			System.out.print(root.data+",");
			inOrder(root.next);
			
		}
		
	}

	private static void postOrder(DNode root) {
		if(root!=null)
		{
			postOrder(root.prev);
			postOrder(root.next);
			System.out.print(root.data+",");
		}
		
	}

	private static void preOrder(DNode root) {
		if(root!=null)
		{
			System.out.print(root.data+",");
			 preOrder(root.prev);
			 preOrder(root.next);
		}
		
	}

	private static DNode createBST(DNode root) {
		int choice=0;
		DNode nn=null;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Enter Data for the Vertex");
			int data=sc.nextInt();
			
			nn=new DNode(data);
			if(root==null)
			{
				root=nn;
			}
			else
			{
				insertNode(root,nn);		//1000,3000
			}
			
			System.out.println("Do you want to add more vertex [1-Yes , 0-NO]");
			choice=sc.nextInt();
		}while(choice==1);
		return root;
	}								//   100         200
									//   1000        3000
	private static void insertNode(DNode root, DNode nn) {
		
		if(nn.data > root.data)		//right sub tree    is 200>100
		{
			if(root.next==null)
			{
				root.next=nn;
			}
			else
			{
				insertNode(root.next,nn);
			}
		}
		else						//left sub tree
		{
			if(root.prev==null)
			{
				root.prev=nn;
			}
			else
			{
				insertNode(root.prev,nn);
			}
		}
		
	}

}
