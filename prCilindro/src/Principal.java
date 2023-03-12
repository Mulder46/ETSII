
public class Principal {

	public static void main(String[] args) {
		//inicialización
		Punto centroBase = new Punto(3.0, 5.0);
		Circulo base = new Circulo(centroBase, 4.0);
		Cilindro miCilindro = new Cilindro(base, 10.0);
		//inicio
		System.out.println(miCilindro);
		//trasladando
		miCilindro.trasladar(2.0, 2.0);
		System.out.println(miCilindro);
		System.out.println(new Cilindro(new Circulo(new Punto(3.0, 5.0), 4.0),10.0));
	}
}