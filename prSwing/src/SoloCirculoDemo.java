/*********************************************************
 * LTO
 *********************************************************/
import javax.swing.JFrame;

public class SoloCirculoDemo {
    public static void main(String [] args) {
        JFrame ventana = new JFrame("Un c�rculo");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setContentPane(new SoloCirculo());
        ventana.pack();
        ventana.setVisible(true);
    }
}