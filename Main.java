import static java.lang.System.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		//Se crean los escaners
		int opciones = 0;
		int Lista = 0;
		Scanner Usuario = new Scanner(System.in);
		Scanner List = new Scanner(System.in);
		
		
		
		//Se le pregunta al Usuario que desea utilizar
		while (opciones != 4){
			System.out.println("1. Utilizar un ArrayList ");
			System.out.println("2. Utilizar una Lista");
			System.out.println("3. Utilizar un Vector");
			System.out.println("4. Salir");
			
			//Se crea un switch para los 4 diferentes casos
			try {
				opciones = Usuario.nextInt();
				switch (opciones){
				//Caso1: El usuario desea utilizar ArrayList
				case 1:
						Stack stack = new Stack();
						//Se le pregunta al Usuario que desea utilizar
						while (Lista !=3){
							System.out.println("1. Utilizar Single Linked List ");
							System.out.println("2. Utilizar Double Linked List");
							System.out.println("3. Utilizar Circular Linked List");
							//Se crea otro switch para los 3 diferentes casos
						try{
							Lista = List.nextInt();
							switch(Lista){
							//El usuario desea utilizar Single Linked List
							case 1:
								
								SinglyLinkedList list = new SinglyLinkedList();
								Calculadora calc = new Calculadora();
								out.println("Resultado: " + calc.Calcular(calc.LeerArchivo("datos.txt")));
								out.println(calc.ToString());
								
								break;
								
							//El usuario desea utilizar Double Liked List
							case 2:
								DoublyLinkedList list1 = new DoublyLinkedList();
								Calculadora calc2 = new Calculadora();
								out.println("Resultado: " + calc2.Calcular(calc2.LeerArchivo("datos.txt")));
								out.println(calc2.ToString());
								break;
								
							//El usuario desea utilizar Circular Linked List
							case 3:
								CircularList list2 = new CircularList();
								Calculadora calc3 = new Calculadora();
								out.println("Resultado: " + calc3.Calcular(calc3.LeerArchivo("datos.txt")));
								out.println(calc3.ToString());
								break;
							}	
						}
						catch (Exception e) {
							List.nextLine();
							
						}
					}
					break;
				// EL usuario desea utilizar una Lista
				case 2:
					
					Lista lista1 = new Lista(opciones);
					while (Lista !=3){
						System.out.println("1. Utilizar Single Linked List ");
						System.out.println("2. Utilizar Double Linked List");
						System.out.println("3. Utilizar Circular Linked List");
					
					try{
						Lista = List.nextInt();
						switch(Lista){
						//El usuario desea utilizar Single Linked List
						case 1:
							SinglyLinkedList list3 = new SinglyLinkedList();
							Calculadora calc4 = new Calculadora();
							out.println("Resultado: " + calc4.Calcular(calc4.LeerArchivo("datos.txt")));
							out.println(calc4.ToString());
							break;
							
							
						//El usuario desea utilizar Double Liked List
						case 2:
							
							DoublyLinkedList list4 = new DoublyLinkedList();
							Calculadora calc5 = new Calculadora();
							out.println("Resultado: " + calc5.Calcular(calc5.LeerArchivo("datos.txt")));
							out.println(calc5.ToString());
							break;
							
						//El usuario desea utilizar Circular Linked List
						case 3:
							
							CircularList list5 = new CircularList();
							Calculadora calc6 = new Calculadora();
							out.println("Resultado: " + calc6.Calcular(calc6.LeerArchivo("datos.txt")));
							out.println(calc6.ToString());
							break;
						}	
					}
					catch (Exception e) {
						List.nextLine();
						
					}
				}
					break;
				//El usuario desea utilizar Vector
				case 3:
					StackV vector = new StackV();
					while (Lista !=3){
						System.out.println("1. Utilizar Single Linked List ");
						System.out.println("2. Utilizar Double Linked List");
						System.out.println("3. Utilizar Circular Linked List");
					
					try{
						Lista = List.nextInt();
						switch(Lista){
						//El usuario desea utilizar Single Linked List
						case 1:
							
							SinglyLinkedList list6 = new SinglyLinkedList();
							Calculadora calc7 = new Calculadora();
							out.println("Resultado: " + calc7.Calcular(calc7.LeerArchivo("datos.txt")));
							out.println(calc7.ToString());
							break;
						
						
						//El usuario desea utilizar Double Liked List
						case 2:
							
							DoublyLinkedList list7 = new DoublyLinkedList();
							Calculadora calc8 = new Calculadora();
							out.println("Resultado: " + calc8.Calcular(calc8.LeerArchivo("datos.txt")));
							out.println(calc8.ToString());
							break;
						
						//El usuario desea utilizar Circular Linked List
						case 3:
							
							CircularList list8 = new CircularList();
							Calculadora calc9 = new Calculadora();
							out.println("Resultado: " + calc9.Calcular(calc9.LeerArchivo("datos.txt")));
							out.println(calc9.ToString());
							break;
						}	
					}
					catch (Exception e) {
						List.nextLine();
						
					}
				}
					break;
				
				//Finalmente el usuario desea salir 
				case 4:
					Usuario.close();
					break;
					
				
					
				}
				
			}
			 catch (Exception e) {
					Usuario.nextLine();
		}
		
	}
}
}
