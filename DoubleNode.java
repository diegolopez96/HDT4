
public class DoubleNode<E> extends Node<E> {

private DoubleNode<E> prev;

	public DoubleNode(E value) 
	{
	super(value);	
	prev = null;	

	}
	
	public DoubleNode(E value, DoubleNode<E> next, DoubleNode<E> previous) 
	
	{
		super(value, next);
		this.prev = previous;
	}

	public void setPrevious(DoubleNode<E> prev)
	{
		this.prev = prev;
	}
	
	public DoubleNode <E> getPrevious()
	{
	  return prev;
	}
}
