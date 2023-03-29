package ejercicios2y3;

import java.util.ArrayList;

public class Posicion {
	private ArrayList<Atleta> integrantes;
	private int posicion;
	private double tiempo;
	
	public Posicion(int posicion) {
		this.integrantes = new ArrayList<Atleta>();
		this.posicion = posicion;
		this.tiempo = 0;
	}
	
	public ArrayList<Atleta> getInstegrantes() {
		return this.integrantes;
	}
	
	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}
	
	public double getTiempo() {
		return this.tiempo;
	}
	
	public boolean agregarIntegrantes (Atleta atleta) {
		return this.integrantes.add(atleta);
	}
	
	public void mostrarPosicion() {
		System.out.println("Posicion " + this.posicion);
		for (Atleta atleta : this.integrantes) {
			System.out.println(atleta.toString() + "\n");
		}
	}
	
}
