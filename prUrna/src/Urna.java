import java.util.Random;
public class Urna {
	//las excepciones
/*
public class ExceptionNegativa extends Exception {
    public ExceptionNegativa(String msg) {
        super(msg);
    }
}*/

	//Colores en enumerado
	static enum ColorBola{Blanca,Negra};
	//resto de variables
	private int blancas, negras;
	static private Random alea=new Random();//aleatorio
	
	
	//contructor
	public  Urna (int bl, int ne){
		if(bl>=0 && ne>=0){ //puede ser mayor o igual a 0
			blancas=bl;
			negras=ne;
			
		}else{  //si alguna bola es menor de 0 salta una piedra	
//			throw new ExceptionNegativa("Bolas Negativas");
		}
	}
	
	public int totalBolas(){
		return blancas+negras;  //el número total de bolas es la suma de las dos
		
		
	}
	
	public ColorBola extraerBola(){
		 int total=totalBolas(); //para lanzar el aleatorio entre 1 y el máximo
		 int saca=alea.nextInt(total);				//obtenemos un número aleatorio
				
		if(saca<=blancas){				//si el número es igual o menor que blancas hemos sacado blanca
			
			
			return ColorBola.Blanca;
		}else{							//en otro caso negra
			return ColorBola.Negra;
		}
		
		
	}
	
	public void ponerBlanca(){
		blancas++;
		
	}
	public void ponerNegra(){
		negras++;

	}
	
	public String toString(){
		return "Encontramos "+blancas+" bolas blancas y "+negras+" bolas negras.";
		
	}
}
