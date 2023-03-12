
public class cilindro extends circulo {
	circulo base;
	private double altura;
	cilindro(){
		base=new circulo();
		altura=0;
	}
	cilindro(circulo b, double a){
		base=b;
		altura=a;
	}
	public circulo base(){
		return base;
	}
	public double altura(){
		return altura;
	}
	
	public void base(circulo c){
		base=c;
	}
	
	public void altura(double a){
		altura=a;
	}
	public void trasladar(double a, double b){
		base.transladar(a, b);
		}
	public String toString(){
		return base.toString()+" con altura: "+altura;
	}	
}
