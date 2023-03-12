
public class Banco {
	static final int NUMCTALIBRE=1001;
	private int NCTAS=10;
	private int ppl,unca;
	private String nombre;
	Cuenta[] cuentas=null;
	
	Banco(String nam){
		nombre=nam;
		ppl=0;				//primer hueco libre
		unca=NUMCTALIBRE; 	//primera cuenta libre
		Cuenta= new Cuenta[NCTAS];
		
	}
	
	Banco(String nam,int num){
		nombre=nam;
		ppl=num;
		unca=NUMCTALIBRE;
		Cuenta=new Cuenta[num];
		
	}
	
	public int abrirCuenta(String nom, double cantidad){
		return unca;
		ppl++;
		
	}
	
	public int abrirCuenta(String Nombre){
		
	}
	
	public void cerrarCuenta(int num){
		
	}
	
	public int posicionCuenta(int num){
		
	}
	
	public int ingreso(int num,double cant){
		
	}
	
	public double debito(int num, double cant){
		
	}
	
	public double saldo(int num){
		
	}
	
	public double transferencia(int num1,int num2, double cant){
		
	}
	
	public String toString(){
		return "Cuenta: "+
	}

}
