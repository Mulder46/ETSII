
public class jarra {
	int capacidad,cantidad;
	public jarra(int cap){
		cantidad=0;
		capacidad=cap;
		
	}
	public int capacidad(){
		return capacidad;
		
	}
	
	public int cantidad(){
		return cantidad;
	}
	
	public void llena(){
		cantidad=capacidad;
	}
	public void vacia(){
		cantidad=0;
	}
	public void llenaDesde (jarra j){
		if(cantidad+j.cantidad<capacidad){
			cantidad=cantidad+j.cantidad;
			j.vacia();
		}else{
			j.cantidad=j.cantidad-(capacidad-cantidad);
			llena();

		}
	}
	public String toString(){
		return "capacidad: "+capacidad+" cantidad: "+cantidad;
		
	}
}
