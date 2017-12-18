import java.util.Date;

public class Persona {
	
// Atributos private
	
	private String nombre;
	private String apellido;
	private int edad;
	private String dni;
	private Date fecha_nacimiento;
	private String poblacion;
	private String telefono;
	private double peso;
	private double dinero;
	
	
	
	
// Metodos public
/* 
 * 		SE IMPRIME DIRECTAMENTE EN PANTALLA,
 * 		EN EL MAIN NO HACE FALTA LLAMAR AL "System.out.println();"
 * 
	public void mostrar_nom_ape(){
		System.out.println(this.getNombre() + " " + this.getApellido());
	}
*/
	/*
	 * SE DEVUELVE EL NOMBRE Y EL APELLIDO EN FORMA DE STRING,
	 * SE NECESITA LLAMAR A "System.out.println()" PARA UTILIZARLO.
	 */
	
	public String nomApe(){
		return(this.getNombre() + " " + this.getApellido());
	}
	
	/*
	 *  Metodo para cuando alguien come, se añade el peso que ha ganado y 
	 *  cuando termina de comer, imprime "He dormido" en la pantalla.
	 */
	public void comer(double pesoComido) {
		this.engordar(pesoComido);
		System.out.println("He comido");
	}
	
	/*
	 *  Metodo de cuando alguien duerme, cuando termina de dormir, imprime "He dormido" en la pantalla.
	 */
	public void dormir() {
		System.out.println("He dormido");
	}
	
	/*
	 *  Metodo de cuando alguien pasa por el baño, cuando termina de cagar, imprime "He cagado" en la pantalla.
	 */
	public void cagar() {
		System.out.println("He cagado");
	}
	
	/*
	 * @param PesoPerdido Cuanto peso hemos perdido una vez terminado de correr
	 */
	public void correr(int km) {
		double PesoPerdido = 0.05 * km;
		this.peso = this.peso - PesoPerdido;
		System.out.println("He corrido " + km + " Kms y he perdido " + PesoPerdido + " Kgs");
	}
	
	/*
	 * El metodo de compra, define que vamos a comprar
	 */
	public void comprar() {
		System.out.println("He comprado...");
	}
	
	/*
	 * @param peso En cuanto se va a cambiar  el peso
	 */
	public void engordar(double pesoComido) {
		peso = peso + pesoComido;
		
		// Para usar el mismo nombre de variable, podemos usar This.[variable]
		// diciendo que los que tengan "This." son de la persona
	}
	
	public void cambiarEdad(int edad) {
		this.edad = edad;
		
	}
	
/* 
 * GETTERS Y SETTERS
 */
	/*
	 * Getter para definir el nombre de la persona
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	
	/*
	 * setter para definir el nombre de la persona
	 * @param
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/*
	 * Getter para definir el apellido de la persona
	 * @return
	 */
	public String getApellido() {
		return apellido;
	}
	
	/*
	 * setter para definir el apellido de la persona
	 * @param
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	/*
	 * Getter para definir la edad de la persona
	 * @return
	 */
	public int getEdad() {
		return edad;
	}
	
	/*
	 * setter para definir la edad de la persona
	 * @param
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/*
	 * Getter del DNI de la persona
	 * @return
	 */
	public String getDNI() {
		return dni;
	}
	
	/*
	 * setter del DNI de la persona
	 * @param
	 */
	public void setDNI(String dni) {
		this.dni = dni;
	}
	
	/*
	 * Getter de la fecha de nacimiento de la persona
	 * @return
	 */
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	
	/*
	 * setter de la fecha de nacimiento de la persona
	 * @param
	 */
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	/*
	 * Getter de la poblacion en la que vive
	 */
	public String getPoblacion() {
		return poblacion;
	}
	
	/*
	 * setter de la poblacion en la que vive
	 * @param
	 */
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	
	/*
	 * Getter del numero de telefono que tendrá la persona
	 * @return
	 */
	public String getTelefono() {
		return telefono;
	}
	
	/*
	 * setter del numero de telefono que tendrá la persona
	 * @param
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	/*
	 * Getter del peso que se definirá a la persona
	 * @return
	 */
	public double getPeso() {
		return peso;
	}
	
	/*
	 * setter del peso que se definirá a la persona
	 * @param
	 */
	public void setPeso(int peso) {
		this.peso = peso;		
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}// Fin clase persona