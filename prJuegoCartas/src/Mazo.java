import java.util.Random;

public class Mazo {
	
	private int numCartas;
	static private Random alea=new Random();
	private Carta[] mazo;
	

	
	public Mazo(){
		mazo= new Carta[52];
		numCartas=0;
		
		for(int i=1;i<=13;i++){ //Recorro los 12 numeros de cada palo
			for(Carta.Palo p: Carta.Palo.values()){ //Pongo una de cada palo a cada número
				//los ":" despues de p, significar recorrer todo el rango del array
				mazo[numCartas]=new Carta(i,p);
				numCartas++; 
			}
		}
		baraja(); //se bajaran las cartas obtenidas
			
	}
	public void baraja(){
			for( int i=0;i<numCartas;i++){
				int aux=alea.nextInt(numCartas); //guardo en una auxiliar un valor como máxmo numCartas
				Carta cartAux=mazo[i]; //intercambio con una auxiliar
				mazo[i]=mazo[aux];
				mazo[aux]=cartAux;
				
			}
		}
	public int numeroCartas(){
		return numCartas;
	}
	
	public Carta daCarta(){
		int aux=alea.nextInt(numCartas); //saco un número aleatorio
		Carta cartaAux=mazo[aux]; //antes de borrarla la guardo en variable
		for(int i=aux;i<numCartas;i++){//qutiar esa carta del mazo burbujeo
			mazo[i]=mazo[i+1];
		}
		return cartaAux;  //doy la carta que esté en ese aleatorio	
		
		//RUNTIME EXCEPTION
		
		
	}

}
