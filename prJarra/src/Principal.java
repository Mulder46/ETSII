
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Jarra j5=new Jarra(5);
		Jarra j7=new Jarra(7);
		j7.llena();
		j5.llenaDesde(j7);
		System.out.print(j7.toString());

	}

}
