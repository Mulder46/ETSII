/*********************************************************
 * LTO
 *********************************************************/
import javax.swing.JFrame;

public class PanelTabDemo {
  	public  static void main(String [] args)    {
    	JFrame ventana = new JFrame("Un ejemplo");
    	ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    	ventana.setContentPane(new PanelTab());
    	ventana.setSize(500,400);
    	ventana.setVisible(true);
  	}
}