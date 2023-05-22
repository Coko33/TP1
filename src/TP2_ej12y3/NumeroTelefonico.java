package TP2_ej12y3;

public class NumeroTelefonico {
	private int caracteristica;
	private int numeroDelAbonado;
	private int codigoDelPais;
	private TipoDeLinea tipoDeLinea;
	
	public NumeroTelefonico(){
		this.caracteristica = (Integer) null;
		this.numeroDelAbonado = (Integer) null;
		this.codigoDelPais = (Integer) null;
		this.tipoDeLinea = null;
	}
	
	public NumeroTelefonico(int caracteristica, int numeroDelAbonado, int codigoDelPais, TipoDeLinea tipoDeLinea) {
		this.caracteristica = caracteristica;
		this.numeroDelAbonado = numeroDelAbonado;
		this.codigoDelPais = codigoDelPais;
		this.tipoDeLinea = tipoDeLinea;
	}
	
	public String getValor() {
		return "(+" + this.codigoDelPais + ") " + this.caracteristica + "-" + this.numeroDelAbonado;
	}
}
