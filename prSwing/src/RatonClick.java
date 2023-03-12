/*********************************************************
 * LTO
 *********************************************************/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RatonClick extends JPanel {
    private JPanel   blancaArea;
    private JTextArea textoArea;

    public RatonClick() {
        setLayout(new GridLayout(2,1));
        blancaArea = new JPanel();
        blancaArea.setBackground(Color.green);
        blancaArea.setMinimumSize(new Dimension(300,200));
        blancaArea.addMouseListener(new OyenteRaton());
        add(blancaArea);
        textoArea = new JTextArea(5, 20);
        textoArea.setEditable(false);
        add(new JScrollPane(textoArea));
    }

	class OyenteRaton implements MouseListener {
	    public void mousePressed(MouseEvent e) {
	       diAlgo("Presionado; # de clicks: "
	            + e.getClickCount());
	    }
	
	    public void mouseReleased(MouseEvent e) {
	       diAlgo("Liberado; # de clicks: "
	            + e.getClickCount());
	    }
	
	    public void mouseEntered(MouseEvent e) {
	       diAlgo("Entrada en zona Control");
	    }
	
	    public void mouseExited(MouseEvent e) {
	       diAlgo("Salida de zona control");
	    }
	
	    public void mouseClicked(MouseEvent e) {
	       diAlgo("click (Posicion: "
	            + e.getPoint() + ")");
	    }
	
	    void diAlgo(String eventDesc) {
	        textoArea.append(eventDesc+"\n");
	    }
	}
}


