
public class SinglyLinkedList<E> extends Abstract implements I_Lista<E> {

	private int cont;
	Node<E> head;
	Node<E> temporal;
	
	public SinglyLinkedList() {
		// TODO Auto-generated constructor stub
		head=null;
		super.cont = 0;
	}
	
	public int Size(){
		return cont;
		
	}

	@Override
	public void addFirst(E ele){
		head = new Node<E>(ele,head);
		cont++;
		
	}
	@Override
	public E getFirst(){
		return head.val;
		
	}
	@Override
	public E removeFirst(){
		if (!super.isEmpty())
		{
			temporal= head;
			head = head.next;
			cont--;
			return temporal.getVal();
		}
		else
		{
			return null;
		}
	
		
	}
	
}
