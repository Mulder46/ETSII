/*********************************************************
 * LTO
 *********************************************************/
import javax.swing.JFrame;


public class RatonClickDemo {
    public static void main(String [] args) {
        RatonClick rd = new RatonClick();
        JFrame f = new JFrame("Control Mov. Ratón");
    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 	f.setContentPane(rd);
	 	f.pack();
        f.setVisible(true);
    }
}
