
//ArrayLst
import java.util.*;
import java.util.ArrayList;

public class ALista<E> extends Abstract implements I_Stack {

	private ArrayList<E> pila;
	
	public ALista() {
		// TODO Auto-generated constructor stub
		pila = new ArrayList<E>();
		cont = 0;
	}

	@Override
	public E Pop() {
		// TODO Auto-generated method stub
		if (!isEmpty()) 
		{
			cont--;
			return pila.remove(0);
		}
		return null;
	}

	@Override
	public Object get() {
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

	@Override
	public void Push(E element) {
		// TODO Auto-generated method stub
		cont++;
		pila.add(0, element);
	}


}
