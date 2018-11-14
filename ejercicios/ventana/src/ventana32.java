
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/*
 * Ejercicio 1. Disponer dos objetos de la clase 
 * JButton con las etiquetas: "varón" y "mujer", al presionarse 
 * mostrar en la barra de títulos del JFrame 
 * la etiqueta del botón presionado. 
 * */

public class ventana32 extends JFrame implements ActionListener {

	static JTextField nombre = new JTextField(" ");
	static JTextField contrasenna = new JTextField(" ");

	JButton aceptar = new JButton("ACEPTAR");

	public ventana32() {
		// Invocamos al constructor de la clase base JFrame
		// que espera un tipo String que es el título de la ventana
		// esto es opcional ya que no tiene obligatoriamente que tener un título
		super("Titulo");

		// Asigando null a la entrada pues ya no hacemos uso de layout managers
		setLayout(null);

		nombre.setBounds(10, 10, 100, 20);
		contrasenna.setBounds(10, 40, 100, 20);
		aceptar.setBounds(10, 70, 100, 20);

		add(nombre);
		add(contrasenna);
		add(aceptar);

		// Se dispara el método actionPerformed cada vez que haya un evento

		aceptar.addActionListener(this);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400, 200);

		// Colocar en la pantalla a gusto del programador (x,y)
		setLocation(400, 400);

	}

	public static void main(String[] args) {
		new ventana32();
	}

	// Es obligatorio sobreescribir los métodos que se implementan de una interfaz
	@Override
	public void actionPerformed(ActionEvent event) {

		String nom = ventana32.nombre.getText();
		String cont = ventana32.contrasenna.getText();

		if (nom.equals(" ") || cont.equals(" ")) {
			this.setTitle("Incorrecto");
		} else {
			this.setTitle("esta");
		}

	}

}
