/*********************************************************
 * LTO
 *********************************************************/
import javax.swing.JFrame;


public class PanelVentanaCtrInternoDemo {
    public static void main(String [] args) {
        PanelVentanaCtrInterno p = new PanelVentanaCtrInterno();
        JFrame f = new JFrame("Con ActionListener");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setContentPane(p);
		f.pack();
        f.setVisible(true);
	  }

}
