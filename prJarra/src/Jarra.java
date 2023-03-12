
public class Jarra {
	private int Cantidad, Capacidad;
	Jarra(int capacidadInicial){
		Capacidad=capacidadInicial;
		
	}
	public int Capacidad(){
		return Capacidad;
		
	}
	public int Cantidad(){
		return Cantidad;
	}
	public void llena(){
		Cantidad=Capacidad;
	}
	public void vacia(){
		Cantidad=0;
	}
	public void llenaDesde(Jarra j){
		if(j.Cantidad<(Capacidad-Cantidad)){
		Cantidad=Cantidad+j.Cantidad;
		j.Cantidad=0;
		}else{
			j.Cantidad=j.Cantidad-(Capacidad-Cantidad);
			llena();
			
		}
	}
	
	public String toString(){
		return "Capacidad: "+Capacidad+" Cantidad:"+Cantidad;
		
	}
}
