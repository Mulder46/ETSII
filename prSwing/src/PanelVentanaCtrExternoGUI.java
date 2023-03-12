/*********************************************************
 * LTO
 *********************************************************/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PanelVentanaCtrExternoGUI extends JPanel implements PanelVentanaCtrExterno {
	private JButton bSi, bNo;
	private JLabel l;

	public PanelVentanaCtrExternoGUI() {
		setLayout(new FlowLayout());
		bSi = new JButton("SÍ");
		bNo = new JButton("NO");
		l = new JLabel("¿Verdad?");
		add(l);
		add(bSi);
		add(bNo);
	}

	public void controlador(ActionListener ctr) {
		bSi.addActionListener(ctr);
		bSi.setActionCommand(SI);
		bNo.addActionListener(ctr);
		bNo.setActionCommand(NO);
	}

	public void cambiaTexto(String s) {
		l.setText(s);
	}
}
