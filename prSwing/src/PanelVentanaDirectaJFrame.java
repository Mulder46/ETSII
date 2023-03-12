/*********************************************************
 * LTO
 *********************************************************/
import java.awt.*;
import javax.swing.*;

public class PanelVentanaDirectaJFrame extends JFrame {
    JButton bSi;
    JButton bNo;
    JLabel l;

    PanelVentanaDirectaJFrame(String s) {
        super(s);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contP = getContentPane();
        contP.setLayout(new FlowLayout());
        bSi = new JButton("SI");
        bNo = new JButton("NO");
        l = new JLabel("Nombre");
        contP.add(l);
        contP.add(bSi);
        contP.add(bNo);
    }
}
