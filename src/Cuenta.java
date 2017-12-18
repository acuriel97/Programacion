
public class Cuenta {

	String Cuenta;
	String IBAN;
	String nombre;
	String apellido;
	int Dinero;
	
	
	
	public String getCuenta() {
		return Cuenta;
	}
	public void setCuenta(String cuenta) {
		Cuenta = cuenta;
	}
	public String getIBAN() {
		return IBAN;
	}
	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getDinero() {
		return Dinero;
	}
	public void setDinero(int dinero) {
		Dinero = dinero;
	}
	
	
}
