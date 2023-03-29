package ejercicios2y3;

public class Atleta {
	private String nombre;
	private double tiempo;
	
	public Atleta(String nombre, double tiempo) {
		this.nombre = nombre;
		this.tiempo = tiempo;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getTiempo() {
		return this.tiempo;
	}
	
	public String toString() {
		return "Nombre: " + this.nombre + " - Tiempo: " + this.tiempo;
	}
}
