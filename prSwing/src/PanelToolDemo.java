/*********************************************************
 * LTO
 *********************************************************/
import java.awt.*;
import javax.swing.*;
public class PanelToolDemo {
  public static void main(String [] args)    {
    JFrame frame = new JFrame("Un ejemplo");
    JToolBar toolBar = new JToolBar();
    JButton button = new JButton(new ImageIcon("imagenes/on.gif"));
    toolBar.add(button);
    button = new JButton(new ImageIcon("imagenes/nuevo.gif"));
    toolBar.add(button);
    frame.getContentPane().add(toolBar,BorderLayout.NORTH);
    frame.getContentPane().add(new JTextArea("hola",5,20),BorderLayout.CENTER);
    frame.pack();
    frame.setVisible(true);
  }
}