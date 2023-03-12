/*********************************************************
 * LTO
 *********************************************************/
import javax.swing.JFrame;


public class RatonMoveDemo {
    public static void main(String [] args) {
        RatonMove rd2 = new RatonMove();
        JFrame f = new JFrame("Oyente Ratón 2");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setContentPane(rd2);
        f.pack();
        f.setVisible(true);
    }

}
