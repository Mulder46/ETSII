
public class circulo extends punto{
	double radio;
	punto centro;
	public circulo(){
		centro= new punto();
		radio=0;
	}
	public circulo(punto p, double r){
		centro= p;
		radio=r;
	}
	public punto centro(){
		return centro;
	}
	public double radio(){
		return radio;
	}
	public void transladar(double a, double b){
		centro.transladar(a, b);
		
	}
	public String toString(){
		return centro.toString()+" con radio: "+radio;
	}
}
