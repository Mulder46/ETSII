import java.*;
public class Jugar {
	String nombre;
	int dado;
	int pos;
	public Jugar(String n){
		nombre=n;
		dado=0;
		pos=0;
	}
	public String nombre(){
		return nombre;
	}
	public int dado(){
		Random da= new Random(1,6);
		dado=da;
		return dado;
	}
}
