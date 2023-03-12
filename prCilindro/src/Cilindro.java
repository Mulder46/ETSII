
public class Cilindro {
	private Circulo base;
	private double altura;
	
	Cilindro(){
		base=new Circulo();
		altura=0;
	}
	Cilindro(Circulo b, double a){
		base=b;
		altura=a;	
	}
	public Circulo base(){
		return base;
	}
	public double altura(){
		return altura;
	}
	public void base(Circulo b){
		base=b;
	}
	public void altura(double a){
		altura=a;
	}
	public void trasladar(double a, double b){
		base.centro.x=base.centro.x+a;
		base.centro.y=base.centro.y+b;
	}
	public String toString(){
		return "El centro esta en: "+base.centro.x+base.centro.y+" y de radio: "+base.radio+" y una altura de: "+altura;
		
	}
}
