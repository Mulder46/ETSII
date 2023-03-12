
public class Cuentas+{
	public String titular;
	double saldo;
	int cuenta;
	
	Cuentas(String tut, int num, double sald){
		titular=tut;
		cuenta=num;
		saldo=sald;
	}
	Cuentas(String tut,int num){
		titular=tut;
		cuenta=num;
	}
	public void ingreso(double dinero){
		saldo=saldo+dinero;
	}
	
	public void debito(double dinero){
		saldo=saldo-dinero;
		
	}
	public String titular(){
		return titular;
	}
	public double saldo(){
		return saldo;
	}
	public int cuenta(){
		return cuenta;
	}
	public String toString(){
		return "La cuenta pertenece a "+titular+"su número es: "+cuenta+" y tiene un saldo de "+saldo+"€.";
	}
}


