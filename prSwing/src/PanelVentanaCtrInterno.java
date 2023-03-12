/*********************************************************
 * LTO
 *********************************************************/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PanelVentanaCtrInterno extends JPanel {
	private JButton bSi, bNo;
	private JLabel l;

	PanelVentanaCtrInterno() {
		setLayout(new FlowLayout());
		bSi = new JButton("SI");
		bNo = new JButton("NO");
		BotonControl bc = new BotonControl();
		l = new JLabel("Pulsaciones");
		bSi.addActionListener(bc);
		bSi.setActionCommand("SI");
		bNo.addActionListener(bc);
		bNo.setActionCommand("NO");
		add(l);
		add(bSi);
		add(bNo);
	}

	class BotonControl implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String comando = e.getActionCommand();
			if (comando.equals("SI"))
				l.setText("Si pulsado");
			else if (comando.equals("NO"))
				l.setText("No pulsado");
		}
	}
}
