
public class CircularList<E> extends Abstract implements I_Lista<E> {
	
	private Node<E> tail=null;
	private Node<E> temporal=tail.getNext();
	public CircularList() {
		cont = 0;
	}

	public void addFirst(E ele){}
	
	public E getFirst(){
		return tail.getNext().value();
		
	}
	
	public E removeFirst(){
		if (!isEmpty()){
			if(tail==tail.getNext())
			{
				tail = null;
			}
			else
			{
				tail.setNext(temporal.getNext())
				temporal.setNext(null);
			}
			cont--;
		}
		return temporal.Value();
	}
	
}
