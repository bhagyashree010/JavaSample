package personal.development.src.data.structures;

import java.util.Scanner;

public class TreeDemo 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter root node data: ");
		int i = scanner.nextInt();
		
		Node rootNode = new Node(i);
		boolean continueAdding = Boolean.TRUE;
		while(continueAdding)
		{
			System.out.println("enter next node value: ");
			int nodeVal = scanner.nextInt();
			
			Node newNode = new Node(nodeVal);
			Node temp = rootNode;
			boolean keepSearching = true;
			while(keepSearching)
			{
				
				/**
				 * Adding to left
				 */
				if(newNode.data < temp.data)
				{
					if(temp.left == null)
					{
						temp.left = newNode;
						keepSearching = false;
					}
					else
					{
						temp = temp.left;
					}
				}
				
				/**
				 * Adding elment to right
				 */
				else
				{
					if(temp.right == null)
					{
						temp.right = newNode;
						keepSearching = false;
					}
					else
					{
						temp = temp.right;
					}
				}
			}
				System.out.println("Do you want to add next node?");
				continueAdding = scanner.nextBoolean();
			
		}
		
		//inOrder(rootNode);
		//preOrder(rootNode);
		
		postOrder(rootNode);
	}

	static void inOrder(Node root) {
	    if(root == null) {
	        return;
	    }
	    inOrder(root.left);
	    System.out.println(root.data);
	    inOrder(root.right);
	}
	
	static void postOrder(Node root) {
	    if(root == null) {
	        return;
	    }
	    postOrder(root.left);
	    postOrder(root.right);
	    System.out.println(root.data);
	}
	
	static void preOrder(Node root) {
	    if(root == null) {
	        return;
	    }
	    System.out.println(root.data);
	    preOrder(root.left);
	    preOrder(root.right);
	}
}

class Node
{
	int data;
	Node left;
	Node right;
	
	Node(int data)
	{
		this.data= data;
	}
	 
}
