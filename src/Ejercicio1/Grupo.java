package Ejercicio1;

import java.util.ArrayList;

public class Grupo {
	
	private String nombre;
	ArrayList<String> listaIntegrantes;
	
	public Grupo (String nombre) {
		listaIntegrantes = new ArrayList<String>();
		setNombre(nombre);
	}
	public String getNombre() {
		return this.nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidadIntegrantes() {
		return listaIntegrantes.size();
	}
	public void agregarIntegrante(String nombreIntegrante) {
		boolean existe = false;
		for (int i = 0; !existe ; i++) {
			existe = this.listaIntegrantes.get(i).equals(nombreIntegrante);
		}
		if (!existe) {
			this.listaIntegrantes.add(nombreIntegrante);
		}
	}
	private int obtenerPosicionIntegrante(String nombreIntegrante) {
		int i = 0;
		int iIntegrante = -1;
		while (iIntegrante == -1 && i < this.listaIntegrantes.size()) {
			if (this.listaIntegrantes.get(i).equals(nombreIntegrante)) {
				iIntegrante = i;
			};
			i++;
		}
		return iIntegrante;
	}
	public String obtenerIntegrante(int posicion) {
		String integrante = null;
		if (posicion < this.getCantidadIntegrantes()) {
			integrante = this.listaIntegrantes.get(posicion - 1);
		}
		return integrante;
	}
	public String buscarIntegrante(String nombre) {
		String integranteBuscado = null;
		int i = 0;
		while (i < getCantidadIntegrantes() && integranteBuscado == null) {
			if(this.listaIntegrantes.get(i).equals(integranteBuscado)) {
				integranteBuscado = this.listaIntegrantes.get(i);
			};
			i++;
		}
		return integranteBuscado;
	}
	public String removerIntegrante(String nombreIntegrante) {
		boolean removidoOk = this.listaIntegrantes.remove(buscarIntegrante(nombreIntegrante));
		if (removidoOk) {
			return nombreIntegrante;
		} else {
			return null;
		}
	}
	private void mostrarIntegrantes() {
		System.out.println("Cantidad de integrantes: " + getCantidadIntegrantes());
		for (String integrante: this.listaIntegrantes) {
			System.out.println(integrante);
		}
	}
	public void mostrar() {
		System.out.println(getNombre());
		mostrarIntegrantes();
	}
	public void vaciar() {
		listaIntegrantes.clear();
	}
}

