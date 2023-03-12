/*********************************************************
 * LTO
 *********************************************************/
import javax.swing.JFrame;

public class PanelVentanaCtrAnonimoDemo {
	public static void main(String[] args) {
		PanelVentanaCtrAnonimo panel = new PanelVentanaCtrAnonimo();
		JFrame ventana = new JFrame("Con ActionListener");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setContentPane(panel);
		ventana.pack();
		ventana.setVisible(true);
	}
}
