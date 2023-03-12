
public class Banco {
	static int  NCTAS=10,NUMCTALIBRE=1001;
	Cuentas cuenta[];
	String Nombre;
	int ppl=0,unca=NUMCTALIBRE;
	
	Banco(String nombre){
		Nombre=nombre;
		
	}
	Banco (String nombre, int cuent){
		Nombre=nombre;
		
	}
	public int abrirCuenta(String titular, double saldo){
		cuenta[ppl]=new Cuentas(titular,unca,saldo);
		unca++;
		ppl++;
		return cuenta[ppl-1].cuenta;
	}
	public int abrirCuenta(String titular){
		cuenta[ppl]=new Cuentas(titular,unca,0);
		unca++;
		ppl++;
		return cuenta[ppl-1].cuenta;
	}
	public void cerrarCuenta(int cuent){
		//cerrarla y bucle para  colocar
	}
	public int posicionCuenta(int pos){
		return cuenta[pos].cuenta;
		
	}
	public void ingreso(int cuent, double cantidad){
		cuenta[cuent].saldo+=cantidad;
		
	}
	public double debito(int cuent, double cantidad){
		cuenta[cuent].saldo-=cantidad;
		return cuenta[cuent].saldo;
	}
	public double saldo(int cuent){
		return cuenta[cuent].saldo;
	}
	public double transferencia(int cuent1,int cuent2, double cantidad){
		cuenta[cuent2].saldo+=cantidad;
		cuenta[cuent1].saldo-=cantidad;
		return cuenta[cuent1].saldo;
	}
	public String toString(){
		return "El banco se llama: "+Nombre;
	}
}
