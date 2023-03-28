package primeraClase;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socio socio1 = new Socio("Carlos Maslaton", "Maipu 333", "3899283892", TipoSocio.VITALICIO, new Fecha(12, 3, 2023));
		CasaClub casa1 = new CasaClub();
		casa1.agregarSocio(socio1);
		casa1.listarSocios();
		casa1.verSociosVitalicios();
	}

}
