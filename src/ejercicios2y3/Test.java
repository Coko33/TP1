package ejercicios2y3;

public class Test {

	public static void main(String[] args) {		
		Carrera carrera1 = new Carrera();
		
		carrera1.agregarAtleta("Usain Bolt", 9.58);
		carrera1.agregarAtleta("Tyson Gay", 9.69);
		carrera1.agregarAtleta("Yohan Blake", 9.69);
		carrera1.agregarAtleta("Asafa Powell", 9.72);
		carrera1.agregarAtleta("Justin Gatlin", 9.758);
		carrera1.agregarAtleta("Christian Coleman", 9.76);
		carrera1.agregarAtleta("Trayvon Bromell", 9.71);
		
		carrera1.mostrarPrimerPuesto();
		
		carrera1.mostrarTerna();
	}
}
