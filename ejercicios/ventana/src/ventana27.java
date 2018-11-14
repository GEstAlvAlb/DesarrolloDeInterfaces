import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ventana27 extends JFrame {

	// Con el gridBagLayout los componentes no se
	// inicializan aqui porque el GridBagContraints
	// los necesita uno a uno dentro del constructor
	// Sí que puede estar declarados pero no inicilizados
	// fila 1
	JButton btn11;
	JButton btn12;
	JButton btn21;
	JButton btn22;
	JButton btn31;

	// fila 2
	JTextArea txtAreaFila2;

	// fila 3
	JButton btn32;

	public ventana27() {
		super("GridBagLayout");

		setSize(400, 400);

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
		btn11 = new JButton("Abrir...");
		gbc.gridy = 0; // fila 1
		gbc.gridx = 0; // columna 1
		gbc.weightx=0.5;
		gbc.weighty=0.3;
		
		this.add(btn11, gbc);

		gbc.fill = GridBagConstraints.NONE;
		// Celda fila 1 col 2

		// inicializamos componente
		btn12 = new JButton("Guardar");
		gbc.gridy = 0; // fila 1
		gbc.gridx = 1; // columna 3
	
		this.add(btn12, gbc);

		// Celda fila 2 col 1

		// inicializamos componente
		btn21 = new JButton("Nuevo");
		gbc.gridy = 1; // fila 1
		gbc.gridx = 0; // columna 1
	
		this.add(btn21, gbc);

		// Celda fila 2 col 2

		// inicializamos componente
		btn12 = new JButton("Ejecutar");
		gbc.gridy = 1; // fila 1
		gbc.gridx = 1; // columna 3
	
		this.add(btn12, gbc);

		// Celda fila 3 col 1

		// inicializamos componente
		btn31 = new JButton("Salir");
		gbc.gridy = 2; // fila 1
		gbc.gridx = 0; // columna 3
//		gbc.weightx=0.5;
//		gbc.weighty=0.3;
		gbc.gridwidth = 2;

		this.add(btn31, gbc);

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ventana27();
	}

}
