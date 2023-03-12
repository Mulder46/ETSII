/*********************************************************
 * LTO
 *********************************************************/
import java.awt.*;
import javax.swing.*;
public class PanelBorder extends JPanel {
	public PanelBorder() {
        setLayout(new BorderLayout());
        JButton bNorte = new JButton("Norte");
        JButton bSur   = new JButton("Sur");
        JButton bEste  = new JButton("Este");
        JButton bOeste = new JButton("Oeste");
        JButton bCentro= new JButton("Centro");
        add(bNorte,BorderLayout.NORTH);
        add(bSur,BorderLayout.SOUTH);
        add(bEste,BorderLayout.EAST); 
        add(bOeste,BorderLayout.WEST); 
        add(bCentro,BorderLayout.CENTER); 		
	}
}
