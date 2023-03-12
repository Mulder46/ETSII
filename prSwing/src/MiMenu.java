
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MiMenu extends JMenuBar {
	
	
	public MiMenu() {

        JMenu e1 = new JMenu("Archivo");
        JMenu e2 = new JMenu("ver");
        JMenu ea = new JMenu("Ayuda");

        JMenuItem e11 = new JMenuItem("SubEntrada 1 1");
        JMenuItem e12 = new JMenuItem("SubEntrada 1 2",KeyEvent.VK_E);
        JMenu     e13 = new JMenu("SubEntrada 1 3");


        JMenuItem e131 = new JMenuItem("SubEntrada 1 3 1");
        JCheckBoxMenuItem e132 = new JCheckBoxMenuItem("SubEntrada 1 3 2");


        e13.add(e131);
        e13.add(e132);

        e1.add(e11);
        e1.addSeparator();
        e1.add(e12);
        e1.add(e13);
        ea.add(e13);

        add(e1);
        add(e2);
        add(ea);
      	// this.setHelpMenu(ea); // no implementado
	}

}
