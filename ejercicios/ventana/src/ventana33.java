import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * Ejercicio 1. Disponer dos objetos de la clase 
 * JButton con las etiquetas: "var�n" y "mujer", al presionarse 
 * mostrar en la barra de t�tulos del JFrame 
 * la etiqueta del bot�n presionado. 
 * */

public class ventana33 extends JFrame implements ActionListener {

	static JTextArea texto = new JTextArea();


	JButton aceptar = new JButton("ACEPTAR");

	public ventana33() {
		// Invocamos al constructor de la clase base JFrame
		// que espera un tipo String que es el t�tulo de la ventana
		// esto es opcional ya que no tiene obligatoriamente que tener un t�tulo
		super("Titulo");

		// Asigando null a la entrada pues ya no hacemos uso de layout managers
		setLayout(null);

		
		texto.setBounds(10, 10, 200, 200);
		aceptar.setBounds(10, 210, 100, 20);

		add(texto);
		add(aceptar);

		// Se dispara el m�todo actionPerformed cada vez que haya un evento

		aceptar.addActionListener(this);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400, 400);

		// Colocar en la pantalla a gusto del programador (x,y)
		setLocation(400, 400);

	}

	public static void main(String[] args) {
		new ventana33();
	}

	// Es obligatorio sobreescribir los m�todos que se implementan de una interfaz
	@Override
	public void actionPerformed(ActionEvent event) {

		String texto = ventana33.texto.getText();

		if (texto.contains("hola")) {
			this.setTitle("esta");
		} else {
			this.setTitle("NO ESTA");
		}

	}

}
