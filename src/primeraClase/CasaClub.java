package primeraClase;

import java.util.ArrayList;

public class CasaClub {
	private int cantidad_socios;
	private ArrayList<Socio> socios;
	
	public CasaClub() {
		this.cantidad_socios = 0;
		this.socios = new ArrayList<Socio>();
	}
	public boolean agregarSocio(Socio socioNuevo) {
		boolean agregadoOk = false;
		agregadoOk = socios.add(socioNuevo);
		return agregadoOk;
	}
	public void listarSocios() {
		System.out.println("Lista de socios:");
		for(Socio s : this.socios) {
			s.mostrarSocio();
		}
	}
	public void verSociosVitalicios() {
		System.out.println("Lista de socios VITALICIOS:");
		for(Socio s : this.socios) {
			if (s.esVitalicio()) {
				s.mostrarSocio();
			}
		}
	}
	public int getCantidadSocios() {
		return this.cantidad_socios;
	}

}
