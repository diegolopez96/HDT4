
public class DoublyLinkedList<E> extends Abstract implements I_Lista<E> {

	private int cont;
	private DoubleNode<E> head;
	private DoubleNode<E> tail;
	private DoubleNode<E> temporal;
	
	public DoublyLinkedList() 
	{
		// TODO Auto-generated constructor stub
		head = null;
		tail= null;
		cont = 0;
	}

	public int Size()
	{
		return cont;	
	}
	
	public boolean isEmpty()
	{
		return (cont==0);
	}
	
	@Override
	public void addFirst(E ele)
	{
		head = new DoubleNode<E> (ele, head, null);
		if (tail == null) 
		{
			tail = head;
		}
		cont++;
	}
	
	@Override
	public E getFirst()
	{
		return head.getVal();
		
	}
	@Override
	public E removeFirst()
	{
		if (!isEmpty()) 
		{
			temporal = head;
			head = (DoubleNode<E>) head.getNext();
			if (head == null) 
			{
				tail = null;
			} 
			else 
			{
				head.setPrevious(null);
			}
			temporal.setNext();
			cont--;
			return temporal.getVal();
		}
		return null;	
		
	}
	
}
