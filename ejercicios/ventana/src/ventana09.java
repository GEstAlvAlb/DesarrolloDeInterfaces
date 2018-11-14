import java.awt.Color;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/* *
 * 
 * Ejercicio9. Crear la siguiente ventana con los check box que se os muestran
 * Cada Checkbox y etiqueta van en un Jpanel 
 * 
* */

public class ventana09 extends JFrame {

	public ventana09() {} //Constructor vacío o por defecto, (que puede ser omitido)
	
	public static void main(String [] main){
		
		//Creamos 3 contenedores de tipo JPanel como variables locales
		JPanel inglesPanel = new JPanel();
		JPanel francesPanel = new JPanel();
		JPanel alemanPanel = new JPanel();

		//variables locales
		JCheckBox inglesBox = new JCheckBox();
		JCheckBox francesBox = new JCheckBox();
		JCheckBox alemanBox = new JCheckBox();
		
		JLabel inglesLabel = new JLabel("Inglés");
		JLabel francesLabel = new JLabel("Francés");
		JLabel alemanLabel = new JLabel("Alemán");
		
		//Creamos un objeto de tipo App
		ventana09 app = new ventana09(); //Constructor vacío es el constructor por defecto en Java por eso no hay porque implementarlo
        
		app.setTitle("Inglés - Alemán");
		
		app.setLayout(null); 	//Layout con posiciones absolutas
	    app.setSize(1000, 250); //ventana principal

	    inglesPanel.setLayout(null); //JPanel también pueden distribuir los componentes
	    					// x  y  ancho alto
	    inglesPanel.setBounds(250,10, 100, 30 );
	    inglesPanel.setBackground(Color.CYAN);
	    
	    francesPanel.setLayout(null);
	    francesPanel.setBounds(630,50,100,30);
	    francesPanel.setBackground(Color.RED);
	    
	    alemanPanel.setLayout(null);
	    alemanPanel.setBounds(300,90, 100,30);
	    alemanPanel.setBackground(Color.YELLOW);
	    
	    //Establecemos posiciones y dimensiones
	    inglesBox.setBounds(10,10, 20, 20 );
	    inglesLabel.setBounds(30,10, 60,20);
	    
	    francesBox.setBounds(10,10, 20, 20);
	    francesLabel.setBounds(30,10, 60,20);
	    
	    alemanBox.setBounds(10,10, 20, 20);
	    alemanLabel.setBounds(30,10,60,20);
	    
	    //Añadimos al panel el checkbox y el label.
	    //De tal forma que ahora las posiciones y dimensiones de ambos componentes
	    //son relativas al panel.
	    inglesPanel.add(inglesBox);
	    inglesPanel.add(inglesLabel);
	    
	    francesPanel.add(francesBox);
	    francesPanel.add(francesLabel);
	    
	    alemanPanel.add(alemanBox);
	    alemanPanel.add(alemanLabel);
	    
	    //Añadimos a la ventana principal cada panel
	    app.add(inglesPanel);
	    app.add(francesPanel);
	    app.add(alemanPanel);
	    
	    app.setResizable(false);
	    app.setVisible(true);
	    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

	}
}