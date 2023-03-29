package ejercicios2y3;

import java.util.ArrayList;

public class Carrera {
	private ArrayList<Atleta> atletas;
	private double mejorTiempo;
	private ArrayList<Posicion> posiciones;

	public Carrera() {
		this.atletas = new ArrayList<Atleta>();
		this.mejorTiempo = (Double) null;
	}
	
	public boolean agregarAtleta(String nombre, double tiempo) {
		return this.atletas.add(new Atleta(nombre, tiempo));
	}
	
	public ArrayList<Atleta> obtenerGanadores() {
		ArrayList<Atleta> ganadores = new ArrayList<Atleta>();
		double mejorTiempo = this.atletas.get(0).getTiempo();
		
		for (Atleta atleta : this.atletas) {
			if (atleta.getTiempo() < mejorTiempo) {
				ganadores.clear();
				ganadores.add(atleta);
				mejorTiempo = atleta.getTiempo();
			} else {
				if (atleta.getTiempo() == mejorTiempo) {
					ganadores.add(atleta);
				}
			}
		}
		return ganadores;
	}
	
	public void mostrarGanadores() {
		for (Atleta atleta : obtenerGanadores()) {
			System.out.println(atleta.toString());
		}
	}
	
	public void generarPosiciones() {
		double mejorTiempo = this.atletas.get(0).getTiempo();
		Posicion primera = new Posicion(1);
		Posicion segunda = new Posicion(2);
		Posicion tercera = new Posicion(3);
		
		
		for (Atleta atleta : this.atletas) {
			if (atleta.getTiempo() < mejorTiempo) {
				//primera.integrantes.clear();
				primera.agregarIntegrantes(atleta);
				mejorTiempo = atleta.getTiempo();
			} else {
				if (atleta.getTiempo() == mejorTiempo) {
					ganadores.add(atleta);
				}
			}
		}
	}
	
	private void bajarTodosUnaPosicion(int pos) {
		for (Atleta atleta : posiciones(pos)) {
			
		}
	}


	
}

