
public class Carta {
	//ESTÁTICOS
	static private String[] nombreCarta={"AS","2","3","4","5","6","7","8","9","10","J","Q","K"};
	static enum Palo{Picas,Diamantes,Corazón,Trébol};
//VARIABLES
	private int valor;
	private Palo palo;
	//C
	public Carta(int val, Palo p){
		valor=val;
		palo=p;
		
	}
	public Palo palo(){
		return palo;
	}
	
	public int valor(){
		return valor;
	}
	
	public String toString(){
		return "Su carta es:"+nombreCarta[valor-1]+" de "+palo; //el array empieza en 0
	}
}
