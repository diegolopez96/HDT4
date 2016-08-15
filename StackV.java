import java.util.*;

public class StackV<E> extends AbstractS implements I_Stack<E> {

	private Vector<E> pila;
	
	public StackV() {
		// TODO Auto-generated constructor stub
		cont = 0;
		pila = new Vector<E>();
	}

	@Override
	public void Push(E element) {
		// TODO Auto-generated method stub
		cont++;
		pila.add(0, element);
	}

	@Override
	public E Pop() {
		// TODO Auto-generated method stub
		if (!isEmpty()) 
		{
			return pila.remove(0);
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
