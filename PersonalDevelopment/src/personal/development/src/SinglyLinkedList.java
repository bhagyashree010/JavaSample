package personal.development.src;

public class SinglyLinkedList<T> {

	private Node<T> head = null;
	
	public static void main(String[] args) {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		
		list.add(3);
		list.add(30);
		list.add(2);
		list.add(66);
		list.add(9);
		list.add(29);
		list.add(39);
		
		list.traverse();
		
//		list.reverse();
//		System.out.println("After reversing : ");
//		list.traverse();
		
		list.findCenterNode();
	}
	
	public void add (T element)
	{
		Node<T> node = new Node<T>();
		node.setValue(element);
		
		Node tmp = head;
		
		while(true)
		{
			if(tmp == null)
			{
				head = node;
				break;
			}
			else if(tmp.getNextRef() == null)
			{
				tmp.setNextRef(node);
				break;
			}
			else
			{
				tmp = tmp.nextRef;
			}
		}
	}
	
	public void traverse()
	{
		Node tmp = head;
		while(true)
		{
			if(tmp == null)
			{
				break;
			}
			System.out.println("element : "+tmp.getValue());
			tmp = tmp.getNextRef();
		}
	}
	
	public void reverse()
	{
		Node prev = null;
		Node current = head;
		Node next = null;
		
		while(current !=  null)
		{
			next = current.getNextRef();
			current.setNextRef(prev);
			prev = current;
			current = next;
		}
		head = prev;
	}
	
	public void findCenterNode()
	{
		int listSize = 0;
		int counterToCenter;
		Node tmp = head;
		while(tmp != null)
		{
			listSize++;
			tmp = tmp.getNextRef();
		}
		counterToCenter = Math.abs(listSize/2);
		System.out.println("dividend val "+counterToCenter);
		
		Node tmp1 = head;
		listSize = 0;
		while(tmp1 != null)
		{
			listSize ++;
			if(listSize == counterToCenter)
			{
				System.out.println("Middle node is : "+tmp1.getValue());
				break;
			}
			tmp1 = tmp1.getNextRef();
		}
	}
}

class Node<T> 
{
	T value;
	Node<T> nextRef;
	
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public Node<T> getNextRef() {
		return nextRef;
	}
	public void setNextRef(Node<T> nextRef) {
		this.nextRef = nextRef;
	}
/*	public int compareTo(Object arg) {
	
		if(arg == value)
		{
			return 0;
		}
		return 1;
	}*/

}
