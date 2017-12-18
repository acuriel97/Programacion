import java.util.Scanner;

public class Coche {
	
		//constantes precioGasoil, precioGasolina
		//atributos
/*
	conductor
	color
	matricula
	anioMatriculacion
	marca
	modelo
	numPlazas
	numPuertas
	tamanioMaletero
	caballaje
	litrosCombustible
	tipoCombustible
	capacidadCombustible
	marcha
	marchaMax
	velocidad
	kilometraje
	consumoMedio //por cien kilometros
	precioCompra
		
*/
	
	private String conductor;
	private String matricula;
	private String color;
	private int num_puertas;
	private int num_plazas;
	private int tamaño_Maletero;
	private int caballos;
	private String marca;
	private String modelo;
	private double precio_Gasoil = 1.12;
	private double precio_Gasolina = 1.39;
	private int año_Matriculacion;
	private double litros_Combustible;
	private boolean tipo_Combustible; // Gasoil será false y gasolina será true
	private double capacidad_Combustible;
	private int marcha;
	private int marcha_Max;
	private int velocidad;
	private double kilometraje;
	private double consumo_Medio; // a los 100km
	private int precio_Compra;
	
	
		//funciones
/*
	getters y setters
	double repostar(int euros)
	//el litro de gasoil esta a 1,12 y la gasolina 1,39
	acelerar(int kmHora)
	cambiarMarcha(boolean mas)
	circular(int kms)
	double valorar() 
	//se valora con el kilometraje por 20000km 100 euros
	* y anioMatriculacion  por 1 anio 500euros
	
*/
	public Coche(String conductor, String marca, String modelo, String matricula) {
		this.conductor = conductor;
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
	}
	
	
	public void repostar(int euros) {
		double max_litros;
		double repostado;
		double euros_sobra = 0;
		double litros_sobra = 0;
		
		
		if(tipo_Combustible) {
			max_litros = euros / precio_Gasolina ;
		} else {
			max_litros = euros / precio_Gasoil;
		}
		
		
		if (capacidad_Combustible >= max_litros + litros_Combustible) {
			litros_Combustible = litros_Combustible + max_litros;
			repostado = max_litros;
		} else {
			litros_sobra = litros_Combustible + max_litros - capacidad_Combustible;
			repostado = max_litros - litros_sobra;
			
			if(tipo_Combustible) {
				euros_sobra = precio_Gasolina * litros_sobra;
			} else {
				euros_sobra = precio_Gasoil * litros_sobra;
			}	
		}
	System.out.println("La cantidad repostada ha sido de " + repostado + "L y te han sobrado " + euros_sobra + "€");
	}
	
	
	
	
	public String getConductor() {
		return conductor;
	}
	
	public void setConductor(String conductor) {
		this.conductor = conductor;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getNum_puertas() {
		return num_puertas;
	}
	
	public void setNum_puertas(int num_puertas) {
		this.num_puertas = num_puertas;
	}
	
	public int getNum_plazas() {
		return num_plazas;
	}
	
	public void setNum_plazas(int num_plazas) {
		this.num_plazas = num_plazas;
	}
	
	public int getTamaño_Maletero() {
		return tamaño_Maletero;
	}
	
	public void setTamaño_Maletero(int tamaño_Maletero) {
		this.tamaño_Maletero = tamaño_Maletero;
	}
	
	public int getCaballos() {
		return caballos;
	}
	
	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getAño_Matriculacion() {
		return año_Matriculacion;
	}
	
	public void setAño_Matriculacion(int año_Matriculacion) {
		this.año_Matriculacion = año_Matriculacion;
	}
	
	public double getLitros_Combustible() {
		return litros_Combustible;
	}
	
	public void setLitros_Combustible(double litros_Combustible) {
		this.litros_Combustible = litros_Combustible;
	}
	
	/*
	 * Si devuelve true será gasolina, si devuelve false Gasoil
	 */
	public boolean isTipo_Combustible() {
		return tipo_Combustible;
	}
	
	public void setTipo_Combustible(boolean tipo_Combustible) {
		this.tipo_Combustible = tipo_Combustible;
	}
	
	public double getCapacidad_Combustible() {
		return capacidad_Combustible;
	}
	
	public void setCapacidad_Combustible(int capacidad_Combustible) {
		this.capacidad_Combustible = capacidad_Combustible;
	}
	
	public int getMarcha() {
		return marcha;
	}
	
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
	
	public int getMarcha_Max() {
		return marcha_Max;
	}
	
	public void setMarcha_Max(int marcha_Max) {
		this.marcha_Max = marcha_Max;
	}
	
	public int getVelocidad() {
		return velocidad;
	}
	
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	public double getKilometraje() {
		return kilometraje;
	}
	
	public void setKilometraje(double kilometraje) {
		this.kilometraje = kilometraje;
	}
	
	public double getConsumo_Medio() {
		return consumo_Medio;
	}
	
	public void setConsumo_Medio(double consumo_Medio) {
		this.consumo_Medio = consumo_Medio;
	}
	
	public int getPrecio_Compra() {
		return precio_Compra;
	}
	
	public void setPrecio_Compra(int precio_Compra) {
		this.precio_Compra = precio_Compra;
	}

	/*
	 * Gasolina es true y Gasoil es false
	 */

}