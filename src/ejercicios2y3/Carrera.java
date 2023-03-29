package ejercicios2y3;

import java.util.ArrayList;

public class Carrera {
	public static final int CANTIDAD_POSICIONES = 3;
	
	private ArrayList<Atleta> atletas;
	//private double mejorTiempo;
	private ArrayList<Posicion> posiciones;

	public Carrera() {
		this.atletas = new ArrayList<Atleta>();
		this.posiciones = new ArrayList<Posicion>();
		Posicion primerPuesto = new Posicion(1);
		Posicion segundoPuesto = new Posicion(2);
		Posicion tercerPuesto = new Posicion(3);
		this.posiciones.add(primerPuesto);
		this.posiciones.add(segundoPuesto);
		this.posiciones.add(tercerPuesto);
	}
	
	public boolean agregarAtleta(String nombre, double tiempo) {
		return this.atletas.add(new Atleta(nombre, tiempo));
	}
	
	public ArrayList<Atleta> generarPrimerPuesto() {
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
	
	public void mostrarPrimerPuesto() {
		for (Atleta atleta : generarPrimerPuesto()) {
			System.out.println(atleta.toString());
		}
	}
	
	//si hay un nuevo record itera "al reves" por las posiciones moviendo integrantes y tiempos
	//si el tiempo del atleta es igual al de alguna posicion lo agrega a esta
	public void generarTerna() {
		double mejorTiempo = 999;
		for (Atleta atleta : this.atletas) {
			if (atleta.getTiempo() < mejorTiempo) {
				for (int i = CANTIDAD_POSICIONES; i > 0; i--) {
					bajarTodosUnaPosicion(i);
				}
				setearNuevosTiempos(mejorTiempo);
				posiciones.get(1).agregarIntegrantes(atleta);
			} else {
				for (int i = 1; i < posiciones.size(); i++) {
					if (atleta.getTiempo() == posiciones.get(i).getTiempo()) {
						posiciones.get(i).agregarIntegrantes(atleta);
					}
				}
			}
		}
	}
	
	//coloca cada tiempo en la posicion inferior y setea el nuevo record
	private void setearNuevosTiempos(double nuevoMejorTiempo) {
		this.posiciones.get(3).setTiempo(this.posiciones.get(2).getTiempo());
		this.posiciones.get(2).setTiempo(this.posiciones.get(1).getTiempo());
		this.posiciones.get(1).setTiempo(nuevoMejorTiempo);
	}
	
	//remueve los integrantes de una posicion y los coloca en la posicion inferior
	private void bajarTodosUnaPosicion(int pos) {
		Posicion posActual = this.posiciones.get(pos);
		Posicion posNueva = this.posiciones.get(pos + 1);
		if(pos < CANTIDAD_POSICIONES) {
			for (int i = 0; i < posActual.getInstegrantes().size(); i++) {
				posNueva.agregarIntegrantes(posActual.getInstegrantes().remove(i));
			}
		} else {
			posActual.getInstegrantes().clear();
		}
		
	}
	
	public void mostrarTerna() {
		for (Posicion p : this.posiciones) {
			p.mostrarPosicion();
		}
	}


	
}

