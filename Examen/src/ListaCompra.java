/*NOMBRE:	David Le�n Valle
 * TITULACI�N:	ingenier�a inform�tica
 * GRUPO: 	A
 * EQUIPO:	115
*/
public class ListaCompra {
	
	//CONSTANTES
	public static int NITEMS=10;
	//VARIABLES
	public Item[] lista; //array de �tems
	public int ocupadas=0;
	
	//CONSTRUCTORES (1)
	ListaCompra(int tam){
		if(tam>0){
			//tama�o array tam
		}else{
	//		throw RuntimeException;
		}
	}
	ListaCompra(){
		//tama�o de array defecto
	}
	
	//M�TODOS
	
	// (2)
	public int buscaItem(int codigo){ //creo un m�todo para buscar un item, lo hago publico por si lo necesito fuera
		int i=0,code=-1;
		boolean existe=false; 
		while(i<ocupadas && !existe){  //busca mientras no encuentre y no haya terminado la lista 
			if(lista[i].id==codigo){
				code=i;
				existe=true;
			}else{
				i++;
			}
		}
		
		return code;
	}
	public void anadirItem(int codigo,double precio,int cantidad,double descuento){
		int posicion;
		posicion=buscaItem(codigo); //primero busco si existe
		if(posicion==-1){ //seg�n el m�todo, si ha dado -1 es que no existe por ello a�ado uno nuevo
			lista[ocupadas].id=codigo;
			lista[ocupadas].pvp=precio;
			lista[ocupadas].cantidad=cantidad;
			lista[ocupadas].descuento=descuento;
			ocupadas++; //aumento la cantidad de productos
		}else{ //si no es -1 es que existe y nos ha dicho d�nde est�
			lista[posicion].cantidad++; //as� que a�adimos una unidad m�s.
		}
	}
	//(3)
	public void eliminarItem(int codigo){
		int posicion;
		posicion=buscaItem(codigo); //primero busco si existe
		if(posicion==-1){ //seg�n el m�todo, si ha dado -1 es que no existe por lo que dar� exception
	//		throw RuntimeException;
		}else{
			for(int i=posicion;i<ocupadas-1;i++){//necesita un bucle de burbujeo para mover toda la lista y no quden huecos desde la posicion dada hasta el final de la lista menos 1 para no mover un campo basura
				lista[posicion]=lista[posicion+1];
			}
			posicion--; //al borrar un item, debemos indicar que hay un producto menos (fuera del bucle)
		}
	}
	//(4)
	public double precioTotal(){
		double total=0;
		for(int i=0;i<ocupadas;i++){
			total+=lista[i].precioTotal();
		}
		return total;
	}
	//(5)
	public double descuentoTotal(){
		double total=0;
		for(int i=0;i<ocupadas;i++){
			total+=lista[i].descuentoTotal();
		}
		return total;
	}
	//(6)
	public int numItems(){
		return ocupadas-1;
	}
	//(7)
	public String toString(){
		return "ListaCompra = "+lista.toString();
		
	}
	
	
}
