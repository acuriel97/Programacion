import java.util.*;

public class Festival {
	String nombre;
	String patrocinador;
	ArrayList<Actuacion> Actuaciones = new ArrayList<Actuacion>();
	
	
	public void addActuacion(Actuacion a) {
		this.Actuaciones.add(a);
	}
	
	public void addActuacion(String nombre, int duracion){
		Actuacion a = new Actuacion();
		a.setNombreGrupo(nombre);
		a.setDuracion(duracion);
		
		this.Actuaciones.add(a);
	}
	
	public void mostrarInfo() {
		System.out.println(getNombre());
		System.out.println("Patrocinado por " + getPatrocinador());
		System.out.println("-------------");
		
		Iterator<Actuacion> i = this.Actuaciones.iterator();
		
		while(i.hasNext()) {
			String infoActuacion = i.next().getInfo();
			System.out.println(infoActuacion);
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
		return Actuaciones;
	}
	public void setActuaciones(ArrayList<Actuacion> actuaciones) {
		Actuaciones = actuaciones;
	}
	
}
