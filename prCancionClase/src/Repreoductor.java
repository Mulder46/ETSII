import java.util.Map;
import java.util.Scanner;


public class Map<K, V>reoductor {
	private Map<String,List<Cancion>> listaRep;
	
	public Repreoductor(){
		listaRep = new TreeMap<String, List<Cancion>>();
	}
	public void anyadrirLista(String nombreLista, String [] datos){
		List<Cancion>  ceLista=new ArrayList<Cancion>();
		listaRep.put(nombreLista,ceLista);
		for(String dCancion : datos){
			Scanner sc = new Scanner(dCancion);
			try{
			
			sc.useDelimiter("[,]");
			String titulo = sc.next();
			String interprete=sc.next();
			int minutos=sc.nextInt();
			int segundos=sc.nextInt();
			genero g=genero.valueOf(sc.next());
			Cancion c=new Cancion (titulo, interprete,minutos, segundos, g);
			ceLista.add(c);
			sc.close();
			}catch(InputMismatchException e){
				throw new RuntimeException("Minutos o segunos no numericos "+dCancion);
			}catch(NoSuchElementException e){
				thrown new RuntimeException("Faltaan datos: "+dCancion);
				
			}
			
		}
	}
}
