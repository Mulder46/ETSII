import java.awt.*;

import javax.swing.*;

public class principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		class Circulos extends Canvas{
			public void paint(Graphics g){
				g.drawOval(0, 0, getSize().width-1, getSize().height-1);
				g.setColor(Color.blue);
			}
		//Crear el contenedor
		JFrame f=new JFrame("Primera aplicación");
		//crear elementes, checkbox, botones...
		Checkbox cbh=new Checkbox("Hombre");
		Checkbox cbm=new Checkbox("Mujer");
		Button b=new Button("cosas");
		//tamaños de cada elemento
		f.setSize(300,100);
		b.setPreferredSize(new Dimension(80, 80));
		
		//añadir los elementos al contenedor
		f.add("South",b);
		f.add("West",cbh);
		f.add("East",cbm);
		f.add(Circulos());
		

		}
		//visionar?
		f.show();

	}

}
