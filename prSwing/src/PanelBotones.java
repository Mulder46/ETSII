import java.awt.*;
import javax.swing.*;
public class PanelBotones extends JPanel {
	public PanelBotones() {
        JButton   bNorte = new JButton("Norte");
        JLabel    lSur   = new JLabel("Este es el Sur",JLabel.CENTER);
        JCheckBox cEste  = new JCheckBox("Este",true);
        JButton   bCentro= new JButton("Centro");
        JRadioButton cp1 = new JRadioButton("RB1");
        JRadioButton cp2 = new JRadioButton("RB2",true);
        
		ButtonGroup gcb = new ButtonGroup();
        gcb.add(cp1);
        gcb.add(cp2);
        
		JPanel prb = new JPanel();
        prb.setLayout(new GridLayout(2,1));
        prb.add(cp1);
        prb.add(cp2);
        
        setLayout(new BorderLayout());
        add(bNorte,BorderLayout.NORTH);
        add(lSur,BorderLayout.SOUTH);
        add(cEste,BorderLayout.EAST); 
        add(prb,BorderLayout.WEST); 
        add(bCentro,BorderLayout.CENTER); 
		
	}
}
