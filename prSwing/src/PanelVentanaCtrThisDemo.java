/*********************************************************
 * LTO
 *********************************************************/
import javax.swing.JFrame;


public class PanelVentanaCtrThisDemo {
    public static void main(String [] args) {
        PanelVentanaCtrThis p = new PanelVentanaCtrThis();
        JFrame f = new JFrame("Con ActionListener");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setContentPane(p);
		f.pack();
        f.setVisible(true);
	}
}
