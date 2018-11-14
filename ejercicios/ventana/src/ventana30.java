import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ventana30  extends JFrame  {
	JButton btn12;
	JButton btn22;
	JButton btn32;
	JCheckBox ChIma;
	JCheckBox ChText;
	JLabel tipo;
	JLabel Cantidad;
	JComboBox<String> calidad;
	
	String[] cadena = {"ALTA","MEDIA","BAJA","BN"};
	public ventana30() {
		super("GridBagLayout");

		setSize(600, 400);

		this.getContentPane().setBackground(Color.ORANGE);

		// Inicializamos layout
		GridBagLayout layout = new GridBagLayout();
		this.setLayout(layout);

		// Para situar y demás propiedades
		// usamos un objeto de tipo GridBagConstraints
		// Esta clase está asociada a GridBagLayout
		// Es una clase auxiliar que contiene métodos
		// para personalizar el layout
		GridBagConstraints gbc = new GridBagConstraints();

		// Con este objeto es con el que situamos las celdas

		// Celda fila 1 col 1

		// inicializamos componente
		
		tipo = new JLabel("Tipo");
		gbc.gridy = 0; // fila 1
		gbc.gridx = 0; // columna 1
		gbc.weightx=0.25;
		this.add(tipo, gbc);

		
		
		// Celda fila 1 col 2

		// inicializamos componente
		btn12 = new JButton("Aceptar");
		gbc.gridy = 0; // fila 1
		gbc.gridx = 2; // columna 3
		gbc.weightx=0.25;
		gbc.weighty=0.25;
		
	
		this.add(btn12, gbc);
	
		
		// Celda fila 2 col 1

		// inicializamos componente
		ChIma = new JCheckBox("Imagen");
		gbc.gridy = 1; // fila 1
		gbc.gridx = 0; // columna 0
		gbc.weightx=0.25;
		gbc.weighty=0.25;
		this.add(ChIma, gbc);
				
		btn12 = new JButton("Configurar");
		gbc.gridy = 1; // fila 2
		gbc.gridx = 2; // columna 0
		gbc.weightx=0.25;
		gbc.weighty=0.25;
		this.add(btn12, gbc);

		ChText = new JCheckBox("texto");
		gbc.gridy = 2; // fila 1
		gbc.gridx = 0; // columna 3
		gbc.weightx=0.25;
		gbc.weighty=0.25;
		this.add(ChText, gbc);
		
		
		btn22 = new JButton("cerrar");
		gbc.gridy = 2; // fila 2
		gbc.gridx = 2; // columna 0
		gbc.weightx=0.25;
		gbc.weighty=0.25;
		this.add(btn22, gbc);
		
	
		// Celda fila 3 col 1
		
		Cantidad=new JLabel("Calidad de impresion");
		gbc.gridy = 3; // fila 1
		gbc.gridx =0; // columna 3
		gbc.weightx=1;
		gbc.weighty=1;
		this.add(Cantidad, gbc);
		
		// inicializamos componente
		calidad = new JComboBox<String>(cadena);
		gbc.gridy = 3; // fila 2
		gbc.gridx = 2; // columna 0
		gbc.weightx=1;
		gbc.weighty=1;
		this.add(calidad, gbc);
		


		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ventana30();
	}
	
}
