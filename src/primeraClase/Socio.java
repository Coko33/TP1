package primeraClase;

public class Socio {
	private static int cantidadDeSocios = 1;
	private int nro_de_socio;
	private String nombre_completo;
	private String direccion;
	private String telefono;
	private Fecha fecha_alta;
	private TipoSocio tipo_socio;
	
	public Socio(String nombre_completo, String direccion, String telefono, TipoSocio tipo_socio, Fecha fecha) {
		cantidadDeSocios++;
		this.nro_de_socio = cantidadDeSocios;
		this.nombre_completo = nombre_completo;
		this.direccion = direccion;
		this.telefono = telefono;
		this.fecha_alta = fecha;
	}
	
	public void mostrarSocio() {
		System.out.println("Nombre: " + this.nombre_completo + ". Direccion: " + this.direccion + ". Telefono: " + this.telefono);
	}
	
	public TipoSocio getTipoSocio() {
		return this.tipo_socio;
	}
	
	public boolean esVitalicio() {
		return this.tipo_socio == TipoSocio.VITALICIO;
	}
}
