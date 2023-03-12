/*********************************************************
 * LTO
 *********************************************************/
import javax.swing.JFrame;

public class PanelBotonesDemo {
	public static void main(String [] args) {
        JFrame ventana = new JFrame("Ejemplo de Botones");
    	ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		ventana.setContentPane(new PanelBotones());
        ventana.pack();
        ventana.setVisible(true);
    }
}
