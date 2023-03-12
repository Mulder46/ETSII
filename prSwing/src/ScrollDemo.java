
import java.awt.*;
	import javax.swing.*;
class ScrollDemo  {
  public static void main(String [] args)    {
    JFrame ventana = new JFrame("Un ejemplo");
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ImageIcon ii = new ImageIcon("imagenes/triang.gif");
    JLabel label = new JLabel(ii);
    ventana.setContentPane(new JScrollPane(label));
    ventana.setSize(670,620);
    ventana.setVisible(true);
  }
}
