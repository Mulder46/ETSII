/*********************************************************
 * LTO
 *********************************************************/
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PanelSplitDemo {
   public static void main(String[] args) {
      JFrame frame = new JFrame("Un ejemplo");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      ImageIcon i1 = new ImageIcon("imagenes/triang.gif");
      ImageIcon i2 = new ImageIcon("imagenes/valor.jpg");
      JLabel label1 = new JLabel(i1);
      JLabel label2 = new JLabel(i2);
      frame.setContentPane(new PanelSplit(label1, label2));
      frame.setSize(550, 400);
      frame.setVisible(true);
   }
}