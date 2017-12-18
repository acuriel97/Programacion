import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
/*	
 * 	
// Crear un objeto de clase persona --> juan
		Persona juan = new Persona();
		juan.comer();
		juan.peso = 80;
		juan.cambiarEdad(40);
		
		juan.setNombre("Juan");
		
		
// Asignar un apellido a juan, un apellido introducido por teclado
		System.out.println("Introduce un apellido para juan");
		Scanner scan = new Scanner(System.in);
		String apellido = scan.nextLine();
		juan.setApellido(apellido);
		
		System.out.println("Mi nombre es " + juan.getNombre() + " " + juan.getApellido() + " y peso " + juan.getPeso() + " Kgs");
// Ejecutar el metodo correr al objeto juan		
		juan.correr(20);
		
		
// Asignar un DNI al objeto juan, el DNI esta escrito en un fichero
		File f = new File("D:/ficherosjava/dni.txt");
		scan = new Scanner(f);
		String dni = scan.nextLine();
		juan.setDNI(dni);
		
		
		System.out.println("Mi nombre es " + juan.getNombre() + " " + juan.getApellido() + " y peso " + juan.getPeso() + " Kgs");

*/	
		
		File fichero = new File("D:/nombres.txt");
		Scanner scan = new Scanner(fichero);
		int lineas = 0;
		Persona[] personas = new Persona[5];
		Cuenta[] cuentas = new Cuenta[5];
		
		
		while (scan.hasNextLine()) {
			String linea = scan.nextLine();
			String[] array_completo = linea.split(",");
			
			Persona persona = new Persona();
			persona.setNombre(array_completo[0]);
			persona.setApellido(array_completo[1]);
			persona.setEdad(Integer.parseInt(array_completo[2]));
			
			Cuenta cuenta = new Cuenta();
			cuenta.setNombre(array_completo[0]);
			cuenta.setApellido(array_completo[1]);
			cuenta.setDinero(Integer.parseInt(array_completo[3]));
			
			
			
			personas[lineas] = persona;
			lineas ++;
		}
		
		for(int i = 0; i < personas.length; i++) {
			System.out.println(personas[i].nomApe() + " " + personas[i].getEdad());
		}
		
		System.out.println("\n\n");
		
//		String[] apellidos = new String[lineas];
//		
//		for (int i = 0; i < personas.length; i++) {
//			apellidos[i] = personas[i].getApellido();
//		}
//		
		
		
		/*
		Persona primero = personas[0];
		
		
		for (int i = 0; i < personas.length; i++) {
			if(personas[i].getApellido().compareTo(primero.getApellido()) < 0) {
				primero = personas[i];
			}
		}
		
		System.out.println(primero.nomApe());
		*/
		
		// Hacer la media de edad de las personas
		double sumaEdad = 0;
		
		for (int i = 0; i < personas.length; i++) {
			sumaEdad = sumaEdad + personas[i].getEdad();
			
		}
		System.out.println("La media de edad es: " + sumaEdad / personas.length);
		
		
		// Hacer la suma de dinero.
		double sumaDinero = 0;
		
		for (int i = 0; i < cuentas.length; i++) {
			sumaDinero = sumaDinero + cuentas[i].getDinero();
		}
		
		System.out.println("El dinero total de todos los alumnos es de " + sumaDinero + " €");
	}

}
