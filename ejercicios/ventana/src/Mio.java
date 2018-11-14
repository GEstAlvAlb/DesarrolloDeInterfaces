import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Mio extends JFrame {


	JLabel num1 = new JLabel("numero1"); 
	JLabel num2 = new JLabel("numero2"); 
	JLabel total = new JLabel(); 

	JTextField Tnum1 = new JTextField();	
	JTextField Tnum2 = new JTextField();	

	JButton sum = new JButton("sumar");
	JButton rest = new JButton("restar"); 
	JButton divi = new JButton("dividir"); 
	JButton mult = new JButton("multi"); 

	//Inicialización de componentes que vayamos a utilizar	



	public Mio(){
		super("Titulo"); //titulo de la pagina

		this.setLayout(null); //se da mas adelnate
		this.setSize(350, 200); //tamaño de la ventana

		// Colocación de componentes, por ejemplo
		//x, y, ancho,alto
		num1.setBounds(10,10, 75, 35);   
		num2.setBounds(10,30, 75, 35); 

		total.setBounds(10,60,75,35);

		Tnum1.setBounds(90,10,250, 25); 
		Tnum2.setBounds(90,30,250, 25); 

		sum.setBounds(10, 100,80 , 35); 
		rest.setBounds(90, 100, 80, 35); 
		mult.setBounds(170, 100, 80, 35); 
		divi.setBounds(250, 100, 80, 35);

		// Adición de componentes, por ejemplo 
		this.add(num1);	
		this.add(num2);	

		this.add(Tnum1);	
		this.add(Tnum2);	

		this.add(sum);
		this.add(rest);
		this.add(divi);
		this.add(mult);

		this.add(total);

		int val1=0;
		int val2=0;

		this.setResizable(false); 
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ActionListener suma = new ActionListener() //escuchador para hacer la suma
				{

			//variables internas que desaparecen	
			int val1=0; 
			int val2=0;
			int tot=0;

			@Override
			public void actionPerformed(ActionEvent e) {

				val1=Integer.parseInt(Tnum1.getText());
				val2=Integer.parseInt(Tnum2.getText());
				tot=val1+val2;

				total.setText(Integer.toString(tot)); // muestra el total en un lateral
			}
				};

				ActionListener resta = new ActionListener(){

					//variables internas que desaparecen	
					int val1=0; 
					int val2=0;
					int tot=0;

					@Override
					public void actionPerformed(ActionEvent e) {

						val1=Integer.parseInt(Tnum1.getText());
						val2=Integer.parseInt(Tnum2.getText());
						tot=val1-val2;

						total.setText(Integer.toString(tot));
					}
				};

				ActionListener divide = new ActionListener(){

					//variables internas que desaparecen	
					int val1=0; 
					int val2=0;
					int tot=0;

					@Override
					public void actionPerformed(ActionEvent e) {

						val1=Integer.parseInt(Tnum1.getText());
						val2=Integer.parseInt(Tnum2.getText());
						tot=val1/val2;

						total.setText(Integer.toString(tot));
					}
				};
				ActionListener multiplica = new ActionListener(){

					//variables internas que desaparecen	
					int val1=0; 
					int val2=0;
					int tot=0;

					@Override
					public void actionPerformed(ActionEvent e) {

						val1=Integer.parseInt(Tnum1.getText());
						val2=Integer.parseInt(Tnum2.getText());
						tot=val1*val2;

						total.setText(Integer.toString(tot));
					}
				};					


				sum.addActionListener(suma); //llama al escuchador suma
				rest.addActionListener(resta);
				divi.addActionListener(divide);
				mult.addActionListener(multiplica);
	}


	public static void main(String [] main){

		new Mio();
	}

}

