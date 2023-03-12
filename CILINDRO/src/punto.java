
public class punto {
	private double x,y;
	public punto(){
		x=0;
		y=0;
		
	}
	public punto(double a,double b){
		x=a;
		y=b;
	}
	public double x(){
		return x;
		
	}
	public double y(){
		return y;
	}
	public double distancia (punto p){
		return (x+y)-(p.x-p.y);
	}
	public void x(double a){
		x=a;
	}
	public void y(double b){
		y=b;
	}
	public void transladar(double a,double b){
		x=x+a;
		y=y+b;
		
	}
	public String toString(){
		return "Coordenada X= "+x+" Coordenada Y= "+y;
		
	}
	
}
