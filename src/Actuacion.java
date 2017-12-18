
public class Actuacion {
	String nombreGrupo;
	int duracion;
	
	
	
	
	public String getInfo() {
		String info = this.getNombreGrupo() + " : " + this.getDuracion();
		
		return info;
	}
	
	/*
	 * GETTERS Y SETTERS
	 */
	
	public String getNombreGrupo() {
		return nombreGrupo;
	}
	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
}
