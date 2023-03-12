
public abstract class Mano {
	static final int TOPE=20;
	int numCartas;
	private Carta[] cartas;
	
	Mano(){
		numCartas=0;
	}
	
	Mano(int num){
		numCartas=num;
	}
	
	public void descartaTodas(){
		numCartas=0;
	}
	
	public void agnadeCarta(Carta c){
		
		numCartas++;
	}
	
	public int numeroCartas(){
		return numCartas=0;
	}
		

}
