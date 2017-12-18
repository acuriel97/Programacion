import java.io.*;
import java.util.*;

public class MainActuacion {

	public static void main(String[] args) throws FileNotFoundException {

		// Crear actuacion por programacion
		
		Actuacion a1 = new Actuacion();
		a1.setNombreGrupo("AC / DC");
		a1.setDuracion(90);

		
		// Crear una actuacion con imputs del teclado
		
		Scanner scan = new Scanner(System.in);
		Actuacion a2 = new Actuacion();
		
		System.out.println("Inserte el nombre del grupo que actue:");
		a2.setNombreGrupo(scan.nextLine());
		System.out.println("Inserte la duracion del evento(en minutos):");
		a2.setDuracion(Integer.parseInt(scan.nextLine()));

		
		// Crear una actuacion leyendo desde fichero
		
		File fichero = new File("D:/Actuacion.txt");
		Scanner lectorFichero = new Scanner(fichero);
		
		String linea = lectorFichero.nextLine();
		String[] partes = linea.split(",");
		
		Actuacion a3 = new Actuacion();
		a3.setNombreGrupo(partes[0]);
		a3.setDuracion(Integer.parseInt(partes[1]));

		
		// Crear un festival por programacion con 3 actuaciones
		Festival festival = new Festival();
		Scanner lectorFestival = new Scanner(System.in);
		System.out.println("Introduzca el nombre del festival:");
		festival.setNombre(lectorFestival.nextLine());
		System.out.println("Introduzca el nombre del patrocinador del festival:");
		festival.setPatrocinador(lectorFestival.nextLine());
		
		festival.addActuacion(a1);
		festival.addActuacion(a2);
		festival.addActuacion(a3);
		
		festival.mostrarInfo();
		
		
/*
 * 	Crear una eliminacion de actuacion		
 */
		System.out.println("Introduce un grupo para eliminar del festival");
		String grupo = scan.nextLine();
		
		festival.eliminarActuacion(grupo);
	}

}
