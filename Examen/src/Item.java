/*NOMBRE:	David Le�n Valle
 * TITULACI�N:	ingenier�a inform�tica
 * GRUPO: 	A
 * EQUIPO:	115
*/
public class Item {
	//variables
	int id,cantidad;
	double pvp,descuento;
	//construcores(1)
	Item(int code,int cuantos,double precio,double rebaja){
		if(code>0 && precio>0 && cuantos>0 && rebaja>0){ //supongo que las cantidades tampoco pueden ser 0
			id=code;
			pvp=precio;
			cantidad=cuantos;
			descuento=rebaja;
		}else{
			throw new RuntimeException();
			
		}
	}
	
	Item(int code,double precio,int cuantos){
		if(code>0 && precio>0 && cuantos>0){ 
			id=code;
			pvp=precio;
			cantidad=cuantos;
			descuento=0;
		}else{
			throw new RuntimeException();
		}
	}
	
	//M�TODOS (2)
	public int codigo(){
		return id;
	}
	public double precio(){
		return pvp;
	}
	public int cantidad(){
		return cantidad;
	}
	//(3)
	public void precio(int dinero){
		if(dinero>0){
			pvp=dinero;
		}else{
			throw new RuntimeException();
		}
	}
	public void descuento(double desc){
		if(descuento>0){
			descuento=desc;
		}else{
//			throw RuntimeException;
		}
	}
	public void cantidad(int cant){
		if(cant>0){
			cantidad=cant;
		}else{
//			throw RuntimeException;
		}
	}
	//(4)
	public String toString(){
		return "[Item"+id+": "+cantidad+" "+pvp+" "+descuento+"]";
	}
	//(5)
	public double precioTotal(){
		return pvp*cantidad; //el precio total ser� el coste unitario por la cantidad que compra
	}
	public double descuentoTotal(){
		return descuento*cantidad; //el descuento total ser� el descuento de uno por la cantidad
	}
	
	
	

}
