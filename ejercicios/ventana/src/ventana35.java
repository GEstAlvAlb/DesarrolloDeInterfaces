import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ventana35 extends JFrame {

	JLabel etiqueta = new JLabel("¿Esta de acuerdo con las normas del servicio?");
	JCheckBox verificarBox = new JCheckBox("Acepto");
	JButton continuarBtn = new JButton("Continuar");

	public ventana35() {

		super("Verficar normativa");

		GridLayout grid = new GridLayout(3, 1);
		setLayout(grid);

		// Deshabilitación del boton
		continuarBtn.setEnabled(false);

		add(etiqueta);
		add(verificarBox);
		add(continuarBtn);

		// Cuando hagamos click sobre el checkbox, debemos comprobar si está
		// seleccionado o sin seleccionar
		verificarBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (verificarBox.isSelected()) // true si esta seleccionado, false si no lo está
				{
					continuarBtn.setEnabled(true);
				} else {
					continuarBtn.setEnabled(false);
				}
			}
		});

		setResizable(true);
		setVisible(true);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ventana35();
	}

}
