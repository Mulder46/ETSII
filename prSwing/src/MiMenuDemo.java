/*********************************************************
 * LTO
 *********************************************************/
import javax.swing.JFrame;
import javax.swing.JMenuBar;


public class MiMenuDemo {
	public static void main(String [] args) {
        JFrame f = new JFrame("Ejemplo de menu");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar miMenu = new MiMenu();

        f.setJMenuBar(miMenu);
        
        f.setSize(400,200);
        f.setVisible(true);
	}

}
