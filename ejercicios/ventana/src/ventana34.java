import java.awt.Color;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class  ventana34 extends JFrame implements ActionListener {
	

static JComboBox<Integer> rojo;
static JComboBox<Integer> azul;
static JComboBox<Integer> verde;
static JButton aceptar;

	public  ventana34() {
				super("Titulo");
				Integer [] num =new  Integer[256];
				for (int i=0; i<num.length;i++) {
					num[i]=i;
				}
				

				rojo = new JComboBox<>(num);
				azul = new JComboBox<>(num);
				verde = new JComboBox<>(num);
				aceptar= new JButton("Aceptar");
				
				
				
				rojo.setBounds(10, 40, 100, 20);
				azul.setBounds(10, 80, 100, 20);
				verde.setBounds(10, 120, 100, 20);
				aceptar.setBounds(10, 160, 100, 20);
				
				aceptar.addActionListener(this);
				
				add(rojo);
				add(verde);
				add(azul);
				add(aceptar);
				
				
				setLayout(null);
				//aceptar.addActionListener(this);
				
				
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setVisible(true);
				setSize(400, 400);

				setLocation(400, 400);
	
	}

	public static void main(String[] args) {
		new ventana34();
	}

	// Es obligatorio sobreescribir los métodos que se implementan de una interfaz
	@Override
	public void actionPerformed(ActionEvent event) {

		aceptar.setBackground(new Color((int) rojo.getSelectedIndex(),(int) verde.getSelectedIndex(),(int)azul.getSelectedIndex()));
	}

}