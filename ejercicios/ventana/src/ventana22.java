import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

public class ventana22 extends JFrame{
	
	public ventana22() {
		super("SpringLayout");

		SpringLayout layout = new SpringLayout();
		this.setLayout(layout);
		JLabel jl1 = new JLabel("Nombre del producto");
		JTextField jt=new JTextField(10); // asi se le pone tamaño
		JLabel jl2 = new JLabel("Descripcion");
		JTextField jt2=new JTextField(10); // asi se le pone tamaño
		JLabel jl3 = new JLabel("precio");
		JTextField jt3=new JTextField(10); // asi se le pone tamaño
		JButton jb1=new JButton("Guardar");
		JButton jb2=new JButton("Cancelar");
		
		//El oeste del label lo situamos en el oeste del frame
		//el norte del label lo situamos en el norte del frame
	
		layout.putConstraint(SpringLayout.WEST, jl1, 20, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, jl1, 25, SpringLayout.NORTH, this);
		//Situar el oeste del field con el este del label
		//oeste es la parte derecha del componente
		//este es la izquierda del componente
		//y que entre ellos haya una diferencia de 10 pixeles
		layout.putConstraint(SpringLayout.WEST, jt, 150, SpringLayout.WEST, jl1);
		layout.putConstraint(SpringLayout.NORTH, jt, 25, SpringLayout.NORTH, this);
		
		layout.putConstraint(SpringLayout.WEST, jl2, 20, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, jl2, 60, SpringLayout.NORTH, this);
		//Situar el oeste del field con el este del label
		//oeste es la parte derecha del componente
		//este es la izquierda del componente
		//y que entre ellos haya una diferencia de 10 pixeles
		layout.putConstraint(SpringLayout.WEST, jt2, 150, SpringLayout.WEST, jl2);
		layout.putConstraint(SpringLayout.NORTH, jt2, 60, SpringLayout.NORTH, this);
		
		layout.putConstraint(SpringLayout.WEST, jl3, 20, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, jl3, 95, SpringLayout.NORTH, this);
		//Situar el oeste del field con el este del label
		//oeste es la parte derecha del componente
		//este es la izquierda del componente
		//y que entre ellos haya una diferencia de 10 pixeles
		layout.putConstraint(SpringLayout.WEST, jt3, 150, SpringLayout.WEST, jl3);
		layout.putConstraint(SpringLayout.NORTH, jt3, 95, SpringLayout.NORTH, this);	
		
		layout.putConstraint(SpringLayout.WEST, jb1, 70, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, jb1, 140, SpringLayout.NORTH, this);	
		layout.putConstraint(SpringLayout.WEST, jb2, 90, SpringLayout.WEST, jb1);
		layout.putConstraint(SpringLayout.NORTH, jb2, 140, SpringLayout.NORTH, this);
		
		this.add(jl1);
		this.add(jt);
		this.add(jl2);
		this.add(jt2);
		this.add(jl3);
		this.add(jt3);
		this.add(jb1);
		this.add(jb2);
		
		this.setSize(390, 250);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	


	public static void main(String[] args){
		new ventana22();
	}
}