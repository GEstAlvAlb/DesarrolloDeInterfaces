package ventana;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class actiivdad5 extends JFrame {
	JPanel JP=new JPanel();
		JPanel JP1 = new JPanel(); //panel principal
			JPanel JP11 = new JPanel();	//paneles secundariosa
				JLabel jl111 = new JLabel("Nombre");
				JTextField jt111 = new JTextField(30);
			
			JPanel JP12 = new JPanel();
				JLabel jl121 = new JLabel("Apellido");
				JTextField jt121 = new JTextField(30);
			
			JPanel JP13 = new JPanel();
				JLabel jl131 = new JLabel("Sexo");
				JTextField jt131 = new JTextField(30);
				
			JPanel JP14 = new JPanel();
				JLabel jl141 = new JLabel("Fecha de Nacimiento");
				JTextField jt141 = new JTextField(30);
			
			JPanel JP15 = new JPanel();
				JLabel jl151 = new JLabel("Fecha de ingreso");
				JTextField jt151 = new JTextField(30);
		
				
		JPanel JP2 = new JPanel(); //panel principal
			JPanel JP22 = new JPanel();
		
			JLabel jl21 = new JLabel("Salario");
			JTextField jt21 = new JTextField(30);
			JButton jb21 =new JButton("Modificar");
		
		JPanel JP3 = new JPanel(); //panel principal
			JPanel JP31 = new JPanel();
				JButton jb311 =new JButton("Calcular edad");
				JTextField jt311 = new JTextField(30);
			JPanel JP32 = new JPanel();	
			
				JButton jb321 =new JButton("Cakcular Antiguedad");
				JTextField jt321 = new JTextField(30);
			JPanel JP33 = new JPanel();	
		
				JButton jb331 =new JButton("Calcular Prestaciones");
				JTextField jt331 = new JTextField(30);
		
		JPanel JP4= new JPanel(); //panel principal
			JPanel JP41= new JPanel();
				JButton jb41 =new JButton("Obcion1");
				JButton jb42 =new JButton("Obcion2");

	public actiivdad5() {
		super("Sistema de EMpleados Uniandes");

		//this.setSize(800, 600);
		
		BorderLayout layoutFrame = new BorderLayout();
		this.setLayout(layoutFrame);
		this.setSize(620,520);
		// Añadimos los componentes al panel

		GridLayout Grid1 = new GridLayout(5, 1);
		JP1.setLayout(Grid1);
		this.add(JP1, BorderLayout.WEST);
		
		JP1.setBorder(BorderFactory.createTitledBorder("Datos Personales"));
		JP1.setPreferredSize(new Dimension(600, 200)); // Jugar con los números para ver las salidas

		//Colocar los componentes dentro de su panel
			JP11.add(jl111);
			JP11.add(jt111);
			JP12.add(jl121);
			JP12.add(jt121);
			JP13.add(jl131);
			JP13.add(jt131);
			JP14.add(jl141);
			JP14.add(jt141);
			JP15.add(jl151);
			JP15.add(jt151);
			
		
		//colocar los paneles dentro del panel principal
			JP1.add(JP11);
			JP1.add(JP12);
			JP1.add(JP13);
			JP1.add(JP14);
			JP1.add(JP15);

			
		// Añadimos el panel al frame. Especificamos NORTH para que lo coloque al
		// norte(arriba)
	
		
		
		GridLayout Grid2 = new GridLayout(1, 1);
		JP2.setLayout(Grid2);
		JP2.setBorder(BorderFactory.createTitledBorder("Salario"));
		JP2.setPreferredSize(new Dimension(600, 60));
		
		//Colocar los componentes dentro de su panel
		JP22.add(jl21);
		JP22.add(jt21);
		JP22.add(jb21);
		
		JP2.add(JP22);
		
		GridLayout Grid3 = new GridLayout(3, 1);
		JP3.setLayout(Grid3);
		JP3.setBorder(BorderFactory.createTitledBorder("Calculos"));
		JP3.setPreferredSize(new Dimension(600, 130));
		
		JP31.add(jb311);
		JP31.add(jt311);
		JP32.add(jb321);
		JP32.add(jt321);
		JP33.add(jb331);
		JP33.add(jt331);
		
		JP3.add(JP31);
		JP3.add(JP32);
		JP3.add(JP33);
		
		
		GridLayout Grid4 = new GridLayout(1, 1);
		JP4.setLayout(Grid4);
		JP4.setBorder(BorderFactory.createTitledBorder("Puntos de Extension"));
		JP4.setPreferredSize(new Dimension(600, 60));
		JP41.add(jb41);
		JP41.add(jb42);
		JP4.add(JP41);
		
		
		
		SpringLayout layout = new SpringLayout();
		this.setLayout(layout);
		
		layout.putConstraint(SpringLayout.WEST, JP1, 20, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, JP1, 25, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.NORTH, JP2, 5, SpringLayout.SOUTH, JP1);
		layout.putConstraint(SpringLayout.NORTH, JP3, 5, SpringLayout.SOUTH, JP2);
		layout.putConstraint(SpringLayout.NORTH, JP4, 5, SpringLayout.SOUTH, JP3);
	
		
		this.add(JP1);
		this.add(JP2);
		this.add(JP3);
		this.add(JP4);
		
		
		/*GridLayout Grid = new GridLayout(4, 1);
		JP.setLayout(Grid);
		
		
		this.add(JP, BorderLayout.NORTH);
		JP.setPreferredSize(new Dimension(800, 600));
		JP.add(JP1);
		JP.add(JP2);
		JP.add(JP3);
		JP.add(JP4);*/
		
		
		/*JP11.setLayout(Grid4);
		JP12.setLayout(Grid4);
		JP13.setLayout(Grid4);
		JP14.setLayout(Grid4);
		JP15.setLayout(Grid4);
		JP31.setLayout(Grid4);
		JP32.setLayout(Grid4);
		JP33.setLayout(Grid4);*/
		
	
			
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new actiivdad5();
	}

}
