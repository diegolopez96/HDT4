
public class Lista<E> extends AbstractS implements I_Stack<E> {

	private I_Lista<E> pila;
	
	public Lista(int num) {
		// TODO Auto-generated constructor stub
		
		if (num == 1)
		{
			pila = new SinglyLinkedList<E>();
		}
		if (num == 2)
		{
			pila = new DoublyLinkedList<E>();
		}	
		if (num == 3)
		{
			pila =new CircularList<E>();
		}
		else
		{
			pila = new SinglyLinkedList<E>();
		}
		
		
	}

	@Override
	public void Push(E element) 
	{
		// TODO Auto-generated method stub
		pila.addFirst(element);
		cont++;
	}

	@Override
	public E Pop() {
		// TODO Auto-generated method stub
		if (!isEmpty()) 
		{
			cont--;
			return pila.removeFirst();
		}
		return null;
	}

	@Override
	public E get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int Size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean IsEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

}
