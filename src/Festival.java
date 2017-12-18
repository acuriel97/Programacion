import java.util.*;

public class Festival {
	String nombre;
	String patrocinador;
	ArrayList<Actuacion> actuaciones = new ArrayList<Actuacion>();
	
	
	public void addActuacion(Actuacion a) {
		this.actuaciones.add(a);
	}
	
	public void addActuacion(String nombre, int duracion){
		Actuacion a = new Actuacion();
		a.setNombreGrupo(nombre);
		a.setDuracion(duracion);
		
		this.actuaciones.add(a);
	}
	
/*
 * Muestra la informacion del Festival
 * @param
 */
	public void mostrarInfo() {
		System.out.println(getNombre());
		System.out.println("Patrocinado por " + getPatrocinador());
		System.out.println("-------------");
		
		Iterator<Actuacion> i = this.actuaciones.iterator();
		
		while(i.hasNext()) {
			String infoActuacion = i.next().getInfo();
			System.out.println(infoActuacion);
		}
		
	}
	
	
/*
 * Elimina una actuacion del Festival
 * @param
 */
	public void eliminarActuacion(String grupo) {
		Iterator<Actuacion> i = actuaciones.iterator();
		while(i.hasNext()) {
			Actuacion actu = i.next();
// Si el nombre del grupo coincide, eliminar el grupo
			if(actu.getNombreGrupo().equals(grupo)) {
				i.remove();
				
				System.out.println("El grupo " + actu.getNombreGrupo() + " ha sido eliminado correctamente");
			}
		}
		
	}
	
	
	
/*
 * GETTERS Y SETTERS
 */
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPatrocinador() {
		return patrocinador;
	}
	public void setPatrocinador(String patrocinador) {
		this.patrocinador = patrocinador;
	}
	public ArrayList<Actuacion> getActuaciones() {
		return actuaciones;
	}
	public void setActuaciones(ArrayList<Actuacion> actuaciones) {
		actuaciones = actuaciones;
	}
	
}
