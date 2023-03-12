/*********************************************************
 * LTO
 *********************************************************/
import java.awt.*;
import javax.swing.*;

class PanelComplejo extends JPanel {
	enum ProvinciaAndaluza {
		Almeria, Cadiz, Cordoba, Granada, Huelva, Jaen, Malaga, Sevilla
	}

	public PanelComplejo() {

		// Panel sur
		JPanel panelSur = new JPanel();
		panelSur.setLayout(new FlowLayout());
		JTextField tfNombreFichero = new JTextField("datos.txt", 12);
		JButton bGuardar = new JButton("Guardar");
		JCheckBox chbAñadir = new JCheckBox("Añadir", false);
		String[] niveles = { "Alto", "Medio", "Bajo" };
		// Suponemos que hay tres niveles para elegir
		JComboBox jcob = new JComboBox(niveles);
		panelSur.add(tfNombreFichero);
		panelSur.add(bGuardar);
		panelSur.add(chbAñadir);
		panelSur.add(jcob);
		
		// Subpanel central izquierdo
		JPanel subpanelCentralIzqdo = new JPanel();
		subpanelCentralIzqdo.setLayout(new BorderLayout());
		JLabel lDesc = new JLabel("Descripci�n");
		JTextArea taDesc = new JTextArea(10, 20);
		taDesc.setText("Introducir descrici�n");
		subpanelCentralIzqdo.add(lDesc, BorderLayout.NORTH);
		subpanelCentralIzqdo.add(new JScrollPane(taDesc), BorderLayout.CENTER);
		
		// Subpanel central derecho
		JScrollPane subpanelCentralDcho = new JScrollPane();
		// Suponemos que las entradas de la lista son las
		// provincias andaluzas
		ProvinciaAndaluza[] provs = new ProvinciaAndaluza[8];
		for (ProvinciaAndaluza prov : ProvinciaAndaluza.values()) {
			provs[prov.ordinal()] = prov;
		}
		JList listaProvs = new JList(provs);
		subpanelCentralDcho.setViewportView(listaProvs);
		
		// Panel central
		JPanel panelCentral = new JPanel();
		panelCentral.setLayout(new GridLayout(1, 2));
		panelCentral.add(subpanelCentralIzqdo);
		panelCentral.add(subpanelCentralDcho);
		
		// Panel principal
		setLayout(new BorderLayout());
		add(panelCentral, BorderLayout.CENTER);
		add(panelSur, BorderLayout.SOUTH);
	}
}


