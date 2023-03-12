/*********************************************************
 * LTO
 *********************************************************/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RatonMove extends JPanel {
    JPanel   blancaArea;
    JTextArea textoArea;

    public RatonMove() {
        setLayout(new GridLayout(2,1));
        blancaArea = new JPanel();
        blancaArea.setBackground(Color.green);
        blancaArea.setMinimumSize(new Dimension(300,200));
        add(blancaArea);
        textoArea = new JTextArea(5, 20);
        textoArea.setEditable(false);
        add(new JScrollPane(textoArea));
        OyenteRaton2 or2 = new OyenteRaton2();
        blancaArea.addMouseListener(or2);
        blancaArea.addMouseMotionListener(or2);
    }

	public class OyenteRaton2 implements MouseListener, MouseMotionListener {
	
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
	
	    public void mouseDragged(MouseEvent e) {
	        diAlgo("arrastrando"+e.getPoint());
	    }
	
	    public void mouseMoved(MouseEvent e) {
	        diAlgo("moviendo "+e.getPoint());
	    }
	
	    void diAlgo(String eventDesc) {
	        textoArea.append(eventDesc+"\n");
	    }
	}
}


