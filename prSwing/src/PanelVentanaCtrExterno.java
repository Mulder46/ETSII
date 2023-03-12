/*********************************************************
 * LTO
 *********************************************************/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public interface PanelVentanaCtrExterno {
	public static String SI = "SI";
	public static String NO = "NO";
	
	public void controlador(ActionListener ctr);
	public void cambiaTexto(String s);
}
