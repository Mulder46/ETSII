/*********************************************************
 * LTO
 *********************************************************/
import java.awt.*;
import javax.swing.*;

public class PanelVentanaDemo {
  public static void main(String[] args) {
    JFrame ventana = new JFrame("Un ejemplo");  // Creamos el contenedor superior
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setContentPane(new PanelVentana());// Cambiamos el panel de contenidos
    ventana.pack();			                   // Empaquetamos	
    ventana.setVisible(true);		           // La hacemos visible
  }
}
