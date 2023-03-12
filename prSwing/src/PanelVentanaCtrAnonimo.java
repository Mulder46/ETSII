/*********************************************************
 * LTO
 *********************************************************/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PanelVentanaCtrAnonimo extends JPanel {
    private JButton bSí, bNo;
    private JLabel l;

    public PanelVentanaCtrAnonimo() {
        setLayout(new FlowLayout());
        bSí = new JButton("S�");
        bNo = new JButton("NO");
        l = new JLabel("Pulsaciones");
        bSí.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setText("S� pulsado");
            }
        });
        bNo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setText("No pulsado");
            }
        });
        add(l);
        add(bSí);
        add(bNo); 
    }
}
