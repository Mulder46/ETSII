/*********************************************************
 * LTO
 *********************************************************/
import java.awt.*;
import javax.swing.*;

class PanelVentanaJFrameDemo {	
	public static void main(String [] args) {
        JFrame ventana = new JFrame("Un ejemplo");
	    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        JButton bSi = new JButton("SÍ");
        JButton bNo = new JButton("NO");
        JLabel l = new JLabel("¿Verdad?");
	    Container cpane = ventana.getContentPane();	
	    cpane.setLayout(new FlowLayout());
        cpane.add(l);
        cpane.add(bSi);
        cpane.add(bNo); 
	    ventana.pack();
        ventana.setVisible(true);
   }
}
