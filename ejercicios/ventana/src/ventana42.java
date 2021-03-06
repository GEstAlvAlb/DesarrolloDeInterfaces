
/**
* Ejercicio 6.
* Crear la ventana que aparece abajo y 
* que nos muestre el Jdialog que tenemos arriba 
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ventana42 extends JFrame implements ActionListener {

	JLabel nombreLabel = new JLabel("Nombre");
	JTextField nombreTxt = new JTextField();

	JLabel passwordLbl = new JLabel("Password");
	JTextField passwordTxt = new JTextField();

	JButton aceptarBtn = new JButton("Aceptar");

	public ventana42() {
		super("Login");
		this.setLayout(null);
		this.setSize(250, 200);

		nombreLabel.setBounds(20, 20, 80, 30);
		nombreTxt.setBounds(110, 20, 80, 20);

		passwordLbl.setBounds(20, 60, 80, 30);
		passwordTxt.setBounds(110, 60, 80, 20);

		aceptarBtn.setBounds(20, 110, 120, 30);

		// A�adimos al frame

		add(nombreLabel);
		add(nombreTxt);
		add(passwordLbl);
		add(passwordTxt);
		add(aceptarBtn);

		///////// Listeners de eventos ////////////////
		aceptarBtn.addActionListener(this);

		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] main) {
		new ventana42();
	}

	///////////////////// Action Listener ///////////////////////

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this, "Conexi�n establecida", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

	}
}
