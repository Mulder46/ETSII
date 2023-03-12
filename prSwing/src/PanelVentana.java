/*********************************************************
 * LTO
 *********************************************************/
import java.awt.*;
import javax.swing.*;

public class PanelVentana extends JPanel {
  private JButton bSí;
  private JButton bNo;

  public PanelVentana () {
        setLayout(new FlowLayout());
        bSí = new JButton("S�");
        bNo = new JButton("NO");
        JLabel l = new JLabel("�Verdad?");
        add(l);
        add(bSí);
        add(bNo);
  }
}

