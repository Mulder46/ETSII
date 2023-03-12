/*********************************************************
 * LTO
 *********************************************************/
import javax.swing.JFrame;

public class PanelComplejoDemo {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Componentes Swing");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setContentPane(new PanelComplejo());
		ventana.setSize(400, 200);
		ventana.setVisible(true);
	}
}