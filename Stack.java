
public class Stack<E> {

	private Node<E> top;
	
	public Stack() {
		top = null;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public void push(E data) {
		if(data == null)
			return;
		Node<E> newNode = new Node<E>(data);
		newNode.next = top;
		top = newNode;
	}
	
	public E pop() {
		Node<E> temp;
		
		temp = top;
		if(isEmpty())
			return null;
		
		top = top.next;
		return temp.getData();
	}
	
	public String toString() {
		Node p;
		
		String showAll = "";
		for(p = top; p != null; p = p.next)
			showAll += p.toString() + "\n";
		return showAll;
	}
}
