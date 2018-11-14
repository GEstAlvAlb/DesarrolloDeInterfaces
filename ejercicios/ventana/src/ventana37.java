import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ventana37 extends JFrame {
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton("9");
	JButton bdiv = new JButton("/");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	JButton b6 = new JButton("6");
	JButton bpor = new JButton("*");
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton bmen = new JButton("-");
	JButton b0 = new JButton("0");
	JButton bpun = new JButton(".");
	JButton big = new JButton("=");
	JButton bmas = new JButton("+");

	JTextField num = new JTextField("0");
	
	JLabel var = new JLabel("0");
	JLabel varO = new JLabel();
	JLabel varP =new JLabel("false");
	JPanel panel = new JPanel();

	ActionListener lb7 = new ActionListener() // escuchador para hacer la suma
	{

		// variables internas que desaparecen
		double tot = 0;

		@Override
		public void actionPerformed(ActionEvent e) {

			tot = Double.parseDouble(num.getText());
			tot = tot * 10;
			tot = tot + 7;

			num.setText(Double.toString(tot)); // muestra el total en un lateral
		}
	};
	ActionListener lb1 = new ActionListener() // escuchador para hacer la suma
	{

		// variables internas que desaparecen
		double tot = 0;

		@Override
		public void actionPerformed(ActionEvent e) {
			tot = Double.parseDouble(num.getText());
			if(Boolean.parseBoolean(varP.getText())==false) {
				
				tot = tot * 10;
				tot = tot + 1;
			}else
			{
				//tot=tot
			}
			num.setText(Double.toString(tot)); // muestra el total en un lateral
		}
	};

	ActionListener lb2 = new ActionListener() // escuchador para hacer la suma
	{

		// variables internas que desaparecen
		double tot = 0;

		@Override
		public void actionPerformed(ActionEvent e) {

			tot = Double.parseDouble(num.getText());
			tot = tot * 10;
			tot = tot + 2;

			num.setText(Double.toString(tot)); // muestra el total en un lateral
		}
	};
	ActionListener lb3 = new ActionListener() // escuchador para hacer la suma
	{

		// variables internas que desaparecen
		double tot = 0;

		@Override
		public void actionPerformed(ActionEvent e) {

			tot = Double.parseDouble(num.getText());
			tot = tot * 10;
			tot = tot + 3;

			num.setText(Double.toString(tot)); // muestra el total en un lateral
		}
	};
	ActionListener lb4 = new ActionListener() // escuchador para hacer la suma
	{

		// variables internas que desaparecen
		double tot = 0;

		@Override
		public void actionPerformed(ActionEvent e) {

			tot = Double.parseDouble(num.getText());
			tot = tot * 10;
			tot = tot + 4;

			num.setText(Double.toString(tot)); // muestra el total en un lateral
		}
	};

	ActionListener lb5 = new ActionListener() // escuchador para hacer la suma
	{

		// variables internas que desaparecen
		double tot = 0;

		@Override
		public void actionPerformed(ActionEvent e) {

			tot = Double.parseDouble(num.getText());
			tot = tot * 10;
			tot = tot + 5;

			num.setText(Double.toString(tot)); // muestra el total en un lateral
		}
	};
	ActionListener lb6 = new ActionListener() // escuchador para hacer la suma
	{

		// variables internas que desaparecen
		double tot = 0;

		@Override
		public void actionPerformed(ActionEvent e) {

			tot = Double.parseDouble(num.getText());
			tot = tot * 10;
			tot = tot + 6;

			num.setText(Double.toString(tot)); // muestra el total en un lateral
		}
	};
	ActionListener lb8 = new ActionListener() // escuchador para hacer la suma
	{

		// variables internas que desaparecen
		double tot = 0;

		@Override
		public void actionPerformed(ActionEvent e) {

			tot = Double.parseDouble(num.getText());
			tot = tot * 10;
			tot = tot + 8;

			num.setText(Double.toString(tot)); // muestra el total en un lateral
		}
	};

	ActionListener lb9 = new ActionListener() // escuchador para hacer la suma
	{

		// variables internas que desaparecen
		double tot = 0;

		@Override
		public void actionPerformed(ActionEvent e) {

			tot = Double.parseDouble(num.getText());
			tot = tot * 10;
			tot = tot + 9;

			num.setText(Double.toString(tot)); // muestra el total en un lateral
		}
	};
	ActionListener lb0 = new ActionListener() // escuchador para hacer la suma
	{

		// variables internas que desaparecen
		double tot = 0;

		@Override
		public void actionPerformed(ActionEvent e) {

			tot = Double.parseDouble(num.getText());
			tot = tot * 10;
			tot = tot + 0;

			num.setText(Double.toString(tot)); // muestra el total en un lateral
		}
	};

	ActionListener suma = new ActionListener() // escuchador para hacer la suma
	{

		// variables internas que desaparecen

		double tot = 0;

		@Override
		public void actionPerformed(ActionEvent e) {

			tot = Double.parseDouble(num.getText());

			varO.setText("+");
			num.setText("0");
			var.setText(Double.toString(tot)); // muestra el total en un lateral
		}
	};
	ActionListener resta = new ActionListener() // escuchador para hacer la suma
	{

		// variables internas que desaparecen

		double tot = 0;

		@Override
		public void actionPerformed(ActionEvent e) {

			tot = Double.parseDouble(num.getText());

			varO.setText("-");
			num.setText("0");
			var.setText(Double.toString(tot)); // muestra el total en un lateral
		}
	};

	ActionListener mult = new ActionListener() // escuchador para hacer la suma
	{

		// variables internas que desaparecen

		double tot = 0;

		@Override
		public void actionPerformed(ActionEvent e) {

			tot = Double.parseDouble(num.getText());

			varO.setText("*");
			num.setText("0");
			var.setText(Double.toString(tot)); // muestra el total en un lateral
		}
	};

	ActionListener div = new ActionListener() // escuchador para hacer la suma
	{

		// variables internas que desaparecen

		double tot = 0;

		@Override
		public void actionPerformed(ActionEvent e) {

			tot = Double.parseDouble(num.getText());

			varO.setText("/");
			num.setText("0");
			var.setText(Double.toString(tot)); // muestra el total en un lateral
		}
	};
	
	ActionListener pun = new ActionListener() // escuchador para hacer la suma
	{

		// variables internas que desaparecen


		@Override
		public void actionPerformed(ActionEvent e) {

			
			varP.setText("True"); // muestra el total en un lateral
		}
	};

	ActionListener igual = new ActionListener() // escuchador para hacer la suma
	{

		// variables internas que desaparecen

		double tot = 0;
		String varS = "";
		double ant = 0;

		@Override
		public void actionPerformed(ActionEvent e) {

			tot = Double.parseDouble(num.getText());
			ant = Double.parseDouble(var.getText());
			varS = varO.getText();
			switch (varS) {
			case "/":
				tot = ant / tot;
				break;
			case "*":
				tot = ant * tot;
				break;
			case "+":
				tot = ant + tot;
				break;
			case "-":
				tot = ant - tot;

			}

			num.setText(Double.toString(tot)); // muestra el total en un lateral
		}
	};

	public ventana37() {
		
		super("Calculadora");
		panel.setLayout(new GridLayout(4, 4));
		setSize(450, 250);
		BorderLayout borderLayout = new BorderLayout(10, 10);
		num.setBackground(Color.DARK_GRAY); //cambia el color
		num.setBorder(BorderFactory.createEmptyBorder(15,5,5,5)); //cambia el tamaño de la caja
		num.setFont(num.getFont().deriveFont(22f));//cambua la fuente
		num.setForeground(Color.WHITE);
		
		bmen.setFont(num.getFont().deriveFont(22f)); 
		bmas.setFont(num.getFont().deriveFont(22f));
		bdiv.setFont(num.getFont().deriveFont(22f));
		bpor.setFont(num.getFont().deriveFont(22f));
		big.setFont(num.getFont().deriveFont(22f));
		bpun.setFont(num.getFont().deriveFont(22f));
		b1.setFont(num.getFont().deriveFont(22f)); 
		b2.setFont(num.getFont().deriveFont(22f));
		b3.setFont(num.getFont().deriveFont(22f));
		b4.setFont(num.getFont().deriveFont(22f));
		b5.setFont(num.getFont().deriveFont(22f));
		b6.setFont(num.getFont().deriveFont(22f));
		b7.setFont(num.getFont().deriveFont(22f)); 
		b8.setFont(num.getFont().deriveFont(22f));
		b9.setFont(num.getFont().deriveFont(22f));
		b0.setFont(num.getFont().deriveFont(22f));
		
		
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		panel.add(bdiv);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(bpor);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(bmen);
		panel.add(b0);
		panel.add(bpun);
		panel.add(big);
		panel.add(bmas);

		// listen
		b7.addActionListener(lb7);
		b1.addActionListener(lb1);
		b2.addActionListener(lb2);
		b3.addActionListener(lb3);
		b4.addActionListener(lb4);
		b5.addActionListener(lb5);
		b6.addActionListener(lb6);
		b8.addActionListener(lb8);
		b9.addActionListener(lb9);
		b0.addActionListener(lb0);

		bdiv.addActionListener(div);
		bpor.addActionListener(mult);
		bmen.addActionListener(resta);
		big.addActionListener(igual);
		bmas.addActionListener(suma);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(num, BorderLayout.NORTH);
		this.add(panel);

	}

	public static void main(String[] args) {
		new ventana37();
	}
}
