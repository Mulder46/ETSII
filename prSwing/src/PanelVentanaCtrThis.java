/*********************************************************
 * LTO
 *********************************************************/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PanelVentanaCtrThis extends JPanel implements ActionListener {
    private JButton bSi,bNo;
    private JLabel l;

    PanelVentanaCtrThis() {
        setLayout(new FlowLayout());
        bSi = new JButton("SI");
        bNo = new JButton("NO");
        l = new JLabel("Pulsaciones");
        bSi.addActionListener(this);
        bSi.setActionCommand("SI");
        bNo.addActionListener(this);
        bNo.setActionCommand("NO");
        add(l);
        add(bSi);
        add(bNo); 
    }

    public void actionPerformed(ActionEvent e) {
    	String comando = e.getActionCommand();
        if (comando.equals("SI"))
           l.setText("Si pulsado");
        else if (comando.equals("NO"))
           l.setText("No pulsado");
    }
}
