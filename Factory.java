
public class Factory<E> {

	public Factory() {
		// TODO Auto-generated constructor stub
	}
	public I_Stack<E> crearObj(int num)
	{
		if (num == 1)
		{
			return new ALista();
		}
		if (num == 2)
		{
			return new StackV();
		}	
		if (num == 3)
		{
			return new Lista(num); 
		}
		else
		{
			return new ALista();
		}
	}
}
