/*********************************************************
 * LTO
 *********************************************************/
import javax.swing.*;

public class PanelSplit extends JSplitPane {
   public PanelSplit(JLabel l1, JLabel l2) {
      super(JSplitPane.HORIZONTAL_SPLIT,
	    new JScrollPane(l1),
	    new JScrollPane(l2));
      setOneTouchExpandable(true);
      setContinuousLayout(true);
      setDividerLocation(200);
   } 
}