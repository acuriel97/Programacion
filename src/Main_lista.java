import java.io.FileNotFoundException;
import java.util.*;

public class Main_lista {

	public static void main(String[] args) throws FileNotFoundException{
		ArrayList<Persona> personas = new ArrayList();
		
		final int CREAR = 1;
		final int LISTAR = 2;
		final int SALIR = 0;
		
		Scanner scan = new Scanner(System.in);
		int valor;
		do {
			System.out.println("\\===\\ MENU //===//");
			System.out.println();
			System.out.println(CREAR + ".- Crear persona");
			System.out.println(LISTAR + ".- Listar personas");
			System.out.println(SALIR + ".- Salir");
			
			valor = Integer.parseInt(scan.nextLine());
			
			switch (valor) {
			case CREAR:
				// Pedir datos de persona
				System.out.println("Nombre:");
				String nombre = scan.nextLine();
				
				System.out.println("Apellido:");
				String apellido = scan.nextLine();
				
				System.out.println("DNI:");
				String dni = scan.nextLine();
				
				System.out.println("Telefono:");
				String telefono = scan.nextLine();
				
				// Crear persona
				Persona persona = new Persona();
				persona.setNombre(nombre);
				persona.setApellido(apellido);
				persona.setDNI(dni);
				persona.setTelefono(telefono);
				
				// Añadir a la lista
				personas.add(persona);
				
				break;
				
			case LISTAR:
				// Listar personas
				if(personas.isEmpty()) {
					System.out.println("La lista esta vacia");
				}else {
					Iterator<Persona> i = personas.iterator();
					while(i.hasNext()) {
						Persona p = i.next();
						System.out.println(p.nomApe());
					}
				}
				
				break;
				
			case SALIR:
				// Salir del menu
				
				break;

			default:
				System.out.println("Valor incorrecto, revise su eleccion");
	
				break;
			}
			
		}while(valor != SALIR);
		
	}

}
