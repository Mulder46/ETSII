/*********************************************************
 * LTO
 *********************************************************/
import java.awt.*;
import javax.swing.*;
public class SoloCirculo extends JPanel {
    public SoloCirculo() {
        setBackground(Color.GREEN);
        setForeground(Color.WHITE);
        setPreferredSize(new Dimension(200,200));
    }
    public void paintComponent(Graphics g) {
    	super.paintComponent(g);
        g.fillOval(75,75,50,50);
    }
}
