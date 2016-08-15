
public class CircularList<E> extends Abstract implements I_Lista<E> {
	
	private Node<E> tail;
	private Node<E> temporal=tail.getNext();
	
	public CircularList() 
	{
	    tail = null;
		cont = 0;
	}

	public void addFirst(E ele){
		
	}
	
	public E getFirst() 
	{
		return (E) tail.getNext().getVal();
		
	}
	
	public E removeFirst(){
		if (!isEmpty()){
			if(tail==tail.getNext())
			{
				tail = null;
			}
			else
			{
				tail.setNext();
				temporal.setNext();
			}
			cont--;
		}
		return temporal.getVal();
	}
	
}
