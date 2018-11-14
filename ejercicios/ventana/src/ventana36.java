
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * Ejercicio 1. Disponer dos objetos de la clase 
 * JButton con las etiquetas: "varón" y "mujer", al presionarse 
 * mostrar en la barra de títulos del JFrame 
 * la etiqueta del botón presionado. 
 */




public class ventana36 extends JFrame implements ActionListener {

	JButton btnHola, btnAdios;
	JTextField txAlgo;
	JLabel hola;
	public ventana36() {
		// Invocamos al constructor de la clase base JFrame
		// que espera un tipo String que es el título de la ventana
		// esto es opcional ya que no tiene obligatoriamente que tener un título
		super("Titulo");

		// Asigando null a la entrada pues ya no hacemos uso de layout managers
		setLayout(null);

		btnHola = new JButton("Hola");
		btnAdios = new JButton("Adios");
		txAlgo = new JTextField();
		hola = new JLabel("hola");
		
		hola.setBounds(10, 10, 70, 20);
		btnHola.setBounds(10, 40, 70, 20);
		btnAdios.setBounds(80, 40, 70, 20);
		txAlgo.setBounds(10, 60, 100, 20);
		
		add(hola);
		add(btnHola);
		add(btnAdios);
		add(txAlgo);

		// Se dispara el método actionPerformed cada vez que haya un evento
		btnHola.addActionListener(this);
		btnAdios.addActionListener(this);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400, 200);

		// Colocar en la pantalla a gusto del programador (x,y)
		setLocation(400, 400);

	}

	public static void main(String[] args) {
		new ventana36();
	}

	// Es obligatorio sobreescribir los métodos que se implementan de una interfaz
	@Override
	public void actionPerformed(ActionEvent event) {
		// Distinguir entre un boton y otro
		if (event.getSource() == btnHola) {
			txAlgo.setText(btnHola.getText());

		}

		if (event.getSource() == btnAdios) {
			txAlgo.setText(btnAdios.getText());
		}

	}

}
