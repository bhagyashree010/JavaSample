package personal.development.src.data.structures.lists;

public class DoublyLinkedListOperations {

	Node root = null;
	public static void main(String[] args) {
		
		DoublyLinkedListOperations obj = new DoublyLinkedListOperations();
		
		Node newNode = new Node(1);
		Node newNode2 = new Node(2);
		Node newNode3= new Node(3);
		Node newNode4= new Node(4);

		Node newNode5= new Node(5);

		obj.addNode(newNode, 1);
		obj.addNode(newNode2, 2);
		obj.addNode(newNode3, 3);
		obj.addNode(newNode4, 4);
		obj.addNode(newNode5, 5);
		
		obj.printList();
	}
	
	public void addNode(Node newNode, int pos)
	{
		if(pos == 1 
				&& root == null)
		{
			newNode.prev = null;
			newNode.next = null;
			root = newNode;
		}
		
		else
		{
			Node temp = root;
			for(int k = 1 ; k < pos-1 ; k++)
			{
				temp = temp.next;
			}
			
			/*if(temp.next != null)
			{
				temp.next.prev = newNode;
			}*/
			newNode.prev = temp;
			newNode.next = temp.next;
			temp.next = newNode;
			
		}
	}
	
	public void printList()
	{
		Node temp = root ;
		while(temp != null)
		{
			System.out.println(temp.value+"->");
			if(temp.next != null)
			{
				System.out.println("Next-> "+temp.next.value);
			}
			else
			{
				System.out.println("next -> null");
			}
			if(temp.prev != null)
			{
				System.out.println("Prev -> "+ temp.prev.value);
			}
			else
			{
				System.out.println("prev -> null");
			}
			temp = temp.next;
		}
	}
}

class Node
{
	int value;
	Node next;
	Node  prev;
	
	public Node(int val)
	{
		value = val;
//		this.next = next;
//		this.prev = prev;
	}
}