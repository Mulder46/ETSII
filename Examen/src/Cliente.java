/*NOMBRE:	David Le�n Valle
 * TITULACI�N:	ingenier�a inform�tica
 * GRUPO: 	A
 * EQUIPO:	115
*/
public class Cliente {
	//constantes
	static final double GENVIO=10.0,MIN=60.0;
	
	//variables
	String Nombre;
	ListaCompra compra;
	//constructores (1)
	Cliente(String nombre,ListaCompra lista){
		Nombre=nombre;
		compra=lista;
	}
	//(2)
	public double gastosDeEnvio(){
		double total,gasto;
		total=compra.precioTotal();
		if(total>MIN){
			gasto=0;
		}else{
			gasto=GENVIO;
		}
		return gasto;
	}
	//(3)
	public double totalCompra(){
		return compra.precioTotal();
	}
	public double importeTotal(){
		return compra.precioTotal()+gastosDeEnvio();
	}
	//(4)
	public String toString(){
		return "Cliente: "+Nombre+" - "+compra+" - Total: "+importeTotal();
	}
	
}
