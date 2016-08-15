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
								break;
								
							//El usuario desea utilizar Double Liked List
							case 2:
								break;
								
							//El usuario desea utilizar Circular Linked List
							case 3:
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
					while (Lista !=3){
						System.out.println("1. Utilizar Single Linked List ");
						System.out.println("2. Utilizar Double Linked List");
						System.out.println("3. Utilizar Circular Linked List");
					
					try{
						Lista = List.nextInt();
						switch(Lista){
						//El usuario desea utilizar Single Linked List
						case 1:
							break;
							
							
						//El usuario desea utilizar Double Liked List
						case 2:
							break;
							
						//El usuario desea utilizar Circular Linked List
						case 3:
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
					while (Lista !=3){
						System.out.println("1. Utilizar Single Linked List ");
						System.out.println("2. Utilizar Double Linked List");
						System.out.println("3. Utilizar Circular Linked List");
					
					try{
						Lista = List.nextInt();
						switch(Lista){
						//El usuario desea utilizar Single Linked List
						case 1:
							break;
						
						
						//El usuario desea utilizar Double Liked List
						case 2:
							break;
						
						//El usuario desea utilizar Circular Linked List
						case 3:
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
					break;
					
				
					
				}
				
			}
			 catch (Exception e) {
					Usuario.nextLine();
		}
		
	}
}
}
