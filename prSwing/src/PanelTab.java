/*********************************************************
 * LTO
 *********************************************************/
import java.awt.*;
import javax.swing.*;
public class PanelTab extends JTabbedPane {
	public PanelTab() {
	    ImageIcon icon = new ImageIcon(getClass().getResource("..\\imagenes\\on.gif"));
	    ImageIcon i1 = new ImageIcon("imagenes/triang.gif");
	    ImageIcon i2 = new ImageIcon("imagenes/valor.JPG");
	    JLabel label1 = new JLabel(i1);
	    JLabel label2 = new JLabel(i2);
	    addTab("Uno", icon, new PanelSplit(label1,label2), "Primer panel");
	    JLabel label = new JLabel(i1);
	    JScrollPane scrollPane= new JScrollPane(label);
	    addTab("Dos", icon, scrollPane,"Segundo panel");   		
	}
}


