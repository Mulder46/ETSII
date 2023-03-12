/*********************************************************
 * LTO
 *********************************************************/
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelVentanaCtrExternoCtr implements ActionListener {
	PanelVentanaCtrExterno ven;

	public PanelVentanaCtrExternoCtr(PanelVentanaCtrExterno v) {
		ven = v;
	}

	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if (comando == PanelVentanaCtrExterno.SI)
			ven.cambiaTexto("Sí pulsado");
		else if (comando == PanelVentanaCtrExterno.NO)
			ven.cambiaTexto("No pulsado");
	}
}
