
public class Duracion {
	private int minutos;
	private int segundos;
	public Duracion(){
		this(0,0);
	}
	public Duracion(int m,int s){
		if(m<0 || s<0 ||s>59){
			throw new IllegalArgumentsException("Minutos o segundos no validos. "+m+" "+s);
			
		}
		minutos=m;
		segundos=s;
	}
	public void incrementa(Duracion d){
		segundos=segundos+d.segundos;
		minutos=d.minutos;
		if(segundos>=60){
			segundos=segundos-60;
			minutos++;
			
		}
	}
	public boolean equals(Object o){
		boolean res=o instanceof Duracion;
		Duracion d=res ? (Duracion)o : null;
		return res &&
				minutis==d.minutos &&
				segundos == d.segundos;
		
	}
	public int hashCode(){
		return minutos+segundos;
	}
	public int compareTo(Duracion d){
		return total1-total2;
	}
	public String toString(){
		return "[";
	}
}
