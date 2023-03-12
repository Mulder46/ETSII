/*NOMBRE:	David Le�n Valle
 * TITULACI�N:	ingenier�a inform�tica
 * GRUPO: 	A
 * EQUIPO:	115
*/

public class ClientePremium extends Cliente{
	
	//(1)constructor
	ClientePremium(String nombre,ListaCompra lista){
		super (nombre,lista);

	}
	//2
	public double totalCompra(){
		return compra.precioTotal()-compra.descuentoTotal();
	}
	public double importeTotal(){
		return compra.precioTotal()-compra.descuentoTotal()+gastosDeEnvio();
	}
	//(3)
	public double porcentajeAhorro(){
		return (compra.precioTotal()-(compra.precioTotal()-compra.descuentoTotal()))*100;
	}
}
