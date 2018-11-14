import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ventana29 extends JFrame {

	// Con el gridBagLayout los componentes no se
	// inicializan aqui porque el GridBagContraints
	// los necesita uno a uno dentro del constructor
	// S� que puede estar declarados pero no inicilizados
	// fila 1
	JButton btn11;
	JButton btn22;
	JButton btn31;
	JButton btn32;
	JTextArea area;
	JTextField tex;

	public ventana29() {
		super("GridBagLayout");

		setSize(600, 400);

		this.getContentPane().setBackground(Color.ORANGE);

		// Inicializamos layout
		GridBagLayout layout = new GridBagLayout();
		this.setLayout(layout);

		// Para situar y dem�s propiedades
		// usamos un objeto de tipo GridBagConstraints
		// Esta clase est� asociada a GridBagLayout
		// Es una clase auxiliar que contiene m�todos
		// para personalizar el layout
		GridBagConstraints gbc = new GridBagConstraints();

		// Con este objeto es con el que situamos las celdas

		// Celda fila 1 col 1

		// inicializamos componente
		area = new JTextArea();
		gbc.gridy = 0; // fila 1
		gbc.gridx = 0; // columna 1
		gbc.weightx=1;
		gbc.weighty=1;
		gbc.gridwidth = 2;
		gbc.gridheight = 2;
		gbc.fill = GridBagConstraints.BOTH; 
		this.add(area, gbc);
		
		gbc.fill = GridBagConstraints.NONE;
		gbc.weightx=0;
		gbc.weighty=0;
		
		
		// Celda fila 1 col 2

		// inicializamos componente
		btn11 = new JButton("Boton1");
		gbc.gridy = 0; // fila 1
		gbc.gridx = 2; // columna 3
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.anchor = GridBagConstraints.NORTH; 
		
	
		this.add(btn11, gbc);
	
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.weightx = 0f;
		// Celda fila 2 col 1

		// inicializamos componente
		btn22 = new JButton("Boton2");
		gbc.gridy = 1; // fila 1
		gbc.gridx = 2; // columna 0
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.anchor = GridBagConstraints.CENTER; 
	
		this.add(btn22, gbc);
		
		//reseteamos 
				gbc.anchor = GridBagConstraints.CENTER;

		

		// Celda fila 2 col 2

		// inicializamos componente
		btn31 = new JButton("Boton3");
		gbc.gridy = 2; // fila 1
		gbc.gridx = 2; // columna 3
		
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
	
		this.add(btn31, gbc);
		gbc.fill = GridBagConstraints.NONE;
		
		
		
	
		// Celda fila 3 col 1
		
		tex=new JTextField();
		gbc.gridy = 2; // fila 1
		gbc.gridx = 1; // columna 3
		gbc.fill = GridBagConstraints.BOTH; 
		this.add(tex, gbc);
		gbc.fill = GridBagConstraints.NONE;
		
		// inicializamos componente
		btn32 = new JButton("Boton4");
		gbc.gridy = 2; // fila 2
		gbc.gridx = 0; // columna 0
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		this.add(btn32, gbc);
		
		
	

		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ventana29();
	}

}