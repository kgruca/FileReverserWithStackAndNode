
public class Node<E> {

	protected Node<E> next;
	private E data;
	
	public Node() {
		next = null;
	}
	
	public Node(E data) {
		setData(data);
	}
	
	public boolean setData(E data) {
		if(data == null)
			return false;
		this.data = data;
		return true;
	}
	
	public E getData() {
		return data;
	}
	
	public String toString() {
		return data.toString();
	}
}
