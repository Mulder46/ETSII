
public class Main {

	  public static void main(String[] args){
		  
		  System.out.println("Orden natural");
		  Anagrama an1=new Anagrama();
		  
		  for(String arg:args){
			  an1.nuevaPalabra(arg);
		  }
		  an1.mostrarEnConsola();
		  System.out.println("Orden alternativo");
		  Anagrama an2=new Anagrama(new SatPalabra());
		  
		  for(String arg:args){
			  an2.nuevaPalabra(arg);
		  }
		  an2.mostrarEnConsola();
	  }
}
