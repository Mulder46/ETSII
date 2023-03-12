/*********************************************************
 * LTO
 *********************************************************/
import javax.swing.JFrame;

public class PanelBorderQDemo {
	public static void main(String [] args) {
        JFrame ventana = new JFrame("BorderLayout");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        ventana.setContentPane(new PanelBorderQ());
        ventana.pack();
        ventana.setVisible(true);
    }
}
