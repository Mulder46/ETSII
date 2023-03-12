
public class Circulo {
	public Punto centro;
	public double radio;
	
	Circulo(){
		centro=new Punto();
		radio=0;
		
	}
	Circulo(Punto p, double r){
		centro=p;
		radio=r;
		
	}
	public Punto Centro(){
		return centro;
	}
	public double Radio(){
		return radio;
	}
	public void centro(Punto p){
		centro=p;
	}
	public void radio(double r){
		radio=r;
	}
	public void trasladar(double a, double b){
		centro.x=centro.x+a;
		centro.y=centro.y+b;
	}
	public String toString(){
		return "El centro esta en: "+centro.x+centro.y+" y de radio: "+radio;
	}

}
