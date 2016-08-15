import static java.lang.System.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Calculadora: ");
		System.out.println();
		System.out.println();
		
		
		Calculadora calc = new Calculadora();
		out.println("Resultado: " + calc.Calcular(calc.LeerArchivo("datos.txt")));
		out.println(calc.ToString());
	}
}