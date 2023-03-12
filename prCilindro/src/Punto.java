

public class Punto {
	public double x,y;
	
	Punto(){
		x=0;
		y=0;
		
	}
	Punto(double a, double b){
		x=a;
		y=b;
		
	}
	
	public double x(){
		return x;
	}
	public double y(){
		return y;
	}
	
	public double Distancia(Punto p){
		
		return ((x-p.x)+(y-p.y));
	}
	public void x(double a){
		x=a;
	}
	public void y(double b){
		y=b;
	}
	public void Trasladar(double a, double b){
		x=a;
		y=b;
	}
	public String toString(){
		return "Coordenada x= "+x+" Coordenaday= "+y;
		
	}

}
