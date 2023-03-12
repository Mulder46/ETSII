import java.util.Arrays;

public class Palabra implements Comparable <Palabra>{
	
	private String cadena;
	private String signatura;
	//construir palabra con la cadena que nos pase (guarda la palabra y el anagrama)
	public Palabra(String p){
		
		cadena=p.toLowerCase(); //todo a miniscula para que pueda compararse bien
		char [] s=p.toCharArray(); // trasformar a array para poder ordenar
		Arrays.sort(s);
		signatura=new String(s);
	}
	
	//compara si son iguales
	public int compareTo(Palabra p){
		return cadena.compareToIgnoreCase(p.cadena);
	}
	//nos indica la palabra
	public String getPalabra(){
		return cadena;
	}
	//nos indica el anagrama
	public String getSignatura(){
		return signatura;
	}
	
	public int hashCode(){
		return cadena.hashCode();
	}

	public boolean equals(Object o){
		boolean ok;
		if(o instanceof Palabra && ((Palabra) o).cadena.equalsIgnoreCase(cadena)){
			ok=true;
		}else{
			ok=false;
		}
		
		return ok;
	}
	
	
	//comprueba si son anagrama, para ello coincide sus  anagramas
	public boolean esAnagrama(Palabra p) {
		boolean ok=false;
		if(signatura.equals(p.signatura)){ 
			ok=true;
		}
		
		return ok;
	}
	
	public String toString(){
		return cadena;
	}
	
}
