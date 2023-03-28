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
				iIntegrante = i + 1;
			};
			i++;
		}
		return iIntegrante;
	}
	
	
	public String obtenerIntegrante(int posicion) {
		String integrante = null;
		for (i = 0 ; i < )
	}
}

