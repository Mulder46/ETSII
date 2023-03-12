import java.util.*;


public class Anagrama {
	
	private Map <Palabra, Set <Palabra>> anagramas;
	//construyo el árbol
	public Anagrama(){
		
		anagramas=new TreeMap <Palabra, Set<Palabra>> () ;
	}
	
	public Anagrama(Comparator<Palabra> cs){
		anagramas=new TreeMap <Palabra, Set<Palabra>> (cs);
	}
	
	
	
	public void anagrama(){
		anagramas=new TreeMap <Palabra, Set <Palabra>>();
	}
	//la nueva palabra miro si existe, si no, voy añadiendo los anagrámase xistentes y me crece el árbol
	public void nuevaPalabra(String pal){
		
		Palabra sPal=new Palabra(pal);
		if(!anagramas.containsKey(sPal)){
			Set <Palabra> conjunto=new TreeSet<Palabra>();
			anagramas.put(sPal, conjunto);
			for(Palabra p:anagramas.keySet()){
				if(sPal.esAnagrama(p)&&(!sPal.equals(p))){
					Set <Palabra> con=anagramas.get(p);
					con.add(sPal);
					Set <Palabra> condos=anagramas.get(sPal);
					condos.add(p);
				}
			}
		}
	}
	
	public void mostrarEnConsola(){
	//Define el método void mostrarEnConsola() que muestra la información contenida en el
	//	anagrama en la salida estándar. El listado que hay más abajo muestra cómo hacerlo.
	}

}
