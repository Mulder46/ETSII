/*NOMBRE:	David León Valle
 * TITULACIÓN:	ingeniería informática
 * GRUPO: 	A
 * EQUIPO:	115
*/
public class Prueba {
	static public void main(String[] args) {
		try {
			ListaCompra l = new ListaCompra(3);
			System.out.println("lista compra creada");
			l.anadirItem(345, 100.0, 4, 15.0);
			System.out.println("item1 añadido");
			l.anadirItem(444, 76.0, 6, 5.0);
			System.out.println("item2 añadido");
			l.anadirItem(788, 154.0, 21, 20.0);
			System.out.println("item3 añadido");
			System.out.println(l);
			// anade del mismo codigo;
			
			l.anadirItem(444, 76.0, 3, 5.0);
			System.out.println("444 añadidas 3 unidades más");
			System.out.println(l);

			l.anadirItem(899, 78.0, 12, 6.0);
			System.out.println("899 añadido");
			System.out.println(l);
			
			l.eliminarItem(345);
			System.out.println("Eliminado 345");
			System.out.println(l);
			l.eliminarItem(899);
			System.out.println("Eliminado 899");
			System.out.println(l);

			Cliente c = new Cliente("Juan Pisa", l);
			System.out.println(c);

			ClientePremium cp = new ClientePremium("Lola Carrera", l);
			System.out.println(cp);
			double por = cp.porcentajeAhorro();
			System.out.println("Porcentaje Ahorro: " + por + "%");
		} catch (RuntimeException e) {
			System.out.println("ERROR. " + e.getMessage());
		}
	}
}