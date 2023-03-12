/*********************************************************
 * LTO
 *********************************************************/
import java.awt.*;
import javax.swing.*;
public class PanelBorderQ extends JPanel {
	public PanelBorderQ() {
        setLayout(new BorderLayout());
        JButton bNorte = new JButton("Norte");
        JButton bSur   = new JButton("Sur");
        JButton bEste  = new JButton("Este");
        JButton bCentro= new JButton("Centro");
        JButton bp1    = new JButton("Panel1");
        JButton bp2    = new JButton("Panel2");

        JPanel p = new JPanel();
        p.setLayout( new GridLayout(2,1));
        p.add(bp1);
        p.add(bp2);

        add(bNorte,BorderLayout.NORTH);
        add(bSur,BorderLayout.SOUTH);
        add(bEste,BorderLayout.EAST); 
        add(p,BorderLayout.WEST); 
        add(bCentro,BorderLayout.CENTER); 
		
	}
}
