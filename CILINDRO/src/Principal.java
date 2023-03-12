public class Principal {
	public static void main(String[] args) {
			punto centroBase = new punto(3.0, 5.0);
			circulo base = new circulo(centroBase, 4.0);
			cilindro miCilindro = new cilindro(base, 10.0);
			System.out.println(miCilindro);
			miCilindro.trasladar(2.0, 2.0);
			System.out.println(miCilindro);
			System.out.println(new cilindro(new circulo(new punto(3.0, 5.0), 4.0),10.0));
	}
}
