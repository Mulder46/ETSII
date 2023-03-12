/*********************************************************
 * LTO
 *********************************************************/
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class PanelventanaCtrExternoDemo {
	public static void main(String[] args) {
		PanelVentanaCtrExterno panel = new PanelVentanaCtrExternoGUI();
		ActionListener bt = new PanelVentanaCtrExternoCtr(panel);
		panel.controlador(bt);
		JFrame ventana = new JFrame("Un ejemplo con control");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setContentPane((PanelVentanaCtrExternoGUI) panel);
		ventana.pack();
		ventana.setVisible(true);
	}
}
