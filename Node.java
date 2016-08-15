
public class Node <E>{
	
	protected Node <E> next;
	protected E val;
	
	public Node(E val) 
	{
		this(val, null);
	}
		
	public Node(E value, Node<E> next)
	{
		this.val = val;
		this.next = next;
	}
	
	public E getVal()
	{
		return val;
	}
	
	public void setVal()
	{
		this.val = val;
	}
	
	public Node getNext()
	{
		return next;
	}
	
	public void setNext()
	{
		this.next = next;
	}
	

	

}
