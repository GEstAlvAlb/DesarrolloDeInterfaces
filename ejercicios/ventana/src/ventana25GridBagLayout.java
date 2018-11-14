
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ventana25GridBagLayout extends JFrame {

	// Con el gridBagLayout los componentes no se
	// inicializan aqui porque el GridBagContraints
	// los necesita uno a uno dentro del constructor
	// Sí que puede estar declarados pero no inicilizados
	// fila 1
	JButton btn11;
	JButton btn12;
	JButton btn13;

	// fila 2
	JTextArea txtAreaFila2;

	// fila 3
	JButton btn32;

	public ventana25GridBagLayout() {
			super("GridBagLayout");
			
			setSize(400,400);
			
			this.getContentPane().setBackground(Color.ORANGE);
			
			//Inicializamos layout
			GridBagLayout layout = new GridBagLayout();
			this.setLayout(layout);
			
			//Para situar y demás propiedades
			//usamos un objeto de tipo GridBagConstraints
			//Esta clase está asociada a GridBagLayout
			//Es una clase auxiliar que contiene métodos
			//para personalizar el layout
			GridBagConstraints gbc = new GridBagConstraints();

			//Con este objeto es con el que situamos las celdas
			
			
			//Celda fila 1 col 1
			
			//inicializamos componente
			btn11 = new JButton ("Boton 1|1");
			gbc.gridy = 0; //fila 1
			gbc.gridx = 0; //columna 1
			this.add(btn11,gbc);
			
			//Celda fila 1 col 2
			
			//inicializamos componente
			btn12 = new JButton ("Boton 1|2");
			gbc.gridy = 0; //fila 1
			gbc.gridx = 1; //columna 3
			this.add(btn12,gbc);

			//Celda fila 1 col 3
			
			//inicializamos componente
			btn13 = new JButton ("Boton 1|3");
			gbc.gridy = 0; //fila 1
			gbc.gridx = 2; //columna 3
			this.add(btn13,gbc);
			
			//Celda fila 2 columnas 1,2,3
			txtAreaFila2 = new JTextArea();
			gbc.gridy = 1; //fila 2
			gbc.gridx = 0; //columna 1
			//ancho disponible
			gbc.gridwidth = 3; //tres celdas de ancho
			//GridBagConstraints nombre de la clase + BOTH que es una variable estática
			gbc.fill = GridBagConstraints.BOTH; //textArea rellena todo el ancho y alto posible asignado
			
			this.add(txtAreaFila2,gbc);
			
			//reseteamos aquellas propiedades que no se vayan a usar con el siguiente componente
			gbc.fill = GridBagConstraints.NONE;
			gbc.gridwidth = 1;

			
			//Celda fila 3 columnas 2,3
			btn32 = new JButton("Boton último");
			gbc.gridy = 2; //fila 3
			gbc.gridx = 1;//col 2
			gbc.gridwidth = 2; //ancho máximo disponible
			gbc.fill = GridBagConstraints.HORIZONTAL; //hace que ocupe ese ancho máximo 
			this.add(btn32, gbc);
			
			
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

	public static void main(String[] args) {
		new ventana25GridBagLayout();
	}

}
