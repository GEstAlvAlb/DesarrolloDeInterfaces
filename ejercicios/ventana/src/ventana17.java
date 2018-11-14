import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 *	El box layout pone a todos los componentes en una sola columna o fila
 *	En este ejemplo distribuiremos 5 JLabels en una fila mediante la constante BoxLayout.X_AXIS
 */

public class ventana17 extends JFrame{
 
	//Los cinco JLabels
	JLabel jl1 = new JLabel("Abrir");
	JLabel jl2 = new JLabel("Guardar");
	JLabel jl3 = new JLabel("Compilar");
	JLabel jl4 = new JLabel("Ejecutar");
	JLabel jl5 = new JLabel("Salir");
	
	public ventana17() {
		super("Box | Fila");
		
		this.setSize(550,150);
		
		//BoxLayout no puede ser creado directamente sobre el JFRAME!
		JPanel panel = new JPanel();
		//Creamos un layout en el panel, con distribución horizontal(X_AXIS)
		BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.X_AXIS);
		
		//Establecemos boxLayout como layout del panel
		panel.setLayout(boxLayout);
		
		//Añadimos los componentes al panel
		//Añadimos además un area transparente alrededor de los componentes para que no se solapen
		 
		panel.add(Box.createRigidArea(new Dimension(50,30)));//ancho, alto del area transparente
		panel.add(jl1);
		panel.add(Box.createRigidArea(new Dimension(50,30)));
		panel.add(jl2);
		panel.add(Box.createRigidArea(new Dimension(50,30)));
		panel.add(jl3);
		panel.add(Box.createRigidArea(new Dimension(50,30)));
		panel.add(jl4);
		panel.add(Box.createRigidArea(new Dimension(50,30)));
		panel.add(jl5);
		panel.add(Box.createRigidArea(new Dimension(50,30)));

		
		//Añadimos el panel al frame
		this.add(panel);
		
		this.setVisible(true);
		this.pack();//Esto nos ajusta la venta al contenido, si no se pone entonces hay que establecer un setSize();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ventana17();
	}

}
