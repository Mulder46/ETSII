
public class Cuenta {
	String titular;
	double saldo;
	int cuenta;
	Cuenta(String nombre,int cuent, double dinero){
		titular=nombre;
		cuenta=cuent;
		saldo=dinero;
		
	}
	
	Cuenta(String nombre, int cuent){
		titular=nombre;
		cuenta=cuent;
		saldo=0;
		
	}
	
	public void Ingreso(double cant){
		saldo=saldo+cant;
		
	}
	
	public void Debito(double cant){
		saldo=saldo-cant;
	}
	//MOSTRADOS
	
	public String Titular(){
		return titular;
	}
	public double Saldo(){
		return saldo;
	}
	
	public int cuenta(){
		return cuenta;
	}
	
	public String toString(){
		return "Titular: "+titular+" Saldo: "+saldo+" Cuenta: "+cuenta;
	}

}
