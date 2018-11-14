import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class banco {
JFrame f = new JFrame("Banco Zantanger");
JLabel lini = new JLabel();
JLabel ling = new JLabel("Ingresar");
JLabel lr = new JLabel("Retirar efectivo");
JLabel lf = new JLabel();

JTextField jti = new JTextField("");
JTextField jte = new JTextField("");

JButton bi = new JButton("Ingresar");
JButton br = new JButton("Retirar");

double i=0.00;double j=0.00;double fi=0.00;
public banco()
{
	
	f.setLayout(new GridLayout(4,3,10,10));
	
	lini.setText("Saldo inicial: "+i);
	lf.setText("Saldo actual: "+j);
	f.add(new JLabel(""));	f.add(lini);	f.add(new JLabel(""));	f.add(ling);	f.add(jti);	f.add(bi);	
	f.add(lr);	f.add(jte);	f.add(br);f.add(new JLabel(""));	f.add(lf);f.add(new JLabel(""));
	

	ActionListener ingresar = new ActionListener()
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			i=Double.parseDouble(jti.getText());
			lini.setText("Saldo inicial: "+i);
			bi.setEnabled(false);
			jti.setText("");
			jti.disable();
			fi=i;
			lf.setText("Saldo actual: "+i);
		}
	};
	ActionListener retirar = new ActionListener()
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			j=Double.parseDouble(jte.getText());
			lf.setText("Saldo actual: "+(fi-j));
			jte.setText("");
			if (fi-j<0)
				lf.setForeground(Color.RED);
			else
				lf.setForeground(Color.BLACK);
			fi=fi-j;
			
		}
	};
	
	bi.addActionListener(ingresar);
	br.addActionListener(retirar);
	f.setResizable(false);
	f.setVisible(true);
	//f.pack();
	//jti.setPreferredSize(new Dimension(150,30));
	f.setSize(450,200);
}
public static void main (String[] args)
{
	new banco();
}
}
