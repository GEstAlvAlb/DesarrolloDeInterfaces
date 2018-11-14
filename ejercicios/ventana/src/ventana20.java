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

/**
 * Creamos 2 Jpanels uno para un box layout que distribuya 5 botones en una fila
 * que colocamos al norte del border layout del frame Y otro para crear una
 * columna de 5 JLabels que colocaremos al este del border layout en el frame
 * 
 * Le daremos a cada JPanel un color de fondo para distinguir el área que estan
 * ocupando
 * 
 * Por último situamos un JTextArea en el centro del BorderLayout
 */

public class ventana20 extends JFrame {
	String [] lista = {"x +45º","A +90º","x +30"};
	String [] lista2 = {"Kathrein 742151","Kathrein 7425"};
	
	JPanel JP1=new JPanel();
		JPanel JP11=new JPanel();
			JLabel jl11 = new JLabel("Direction");
			JTextField jt11=new JTextField(50);
		JPanel JP12=new JPanel();
			JLabel jl12 = new JLabel("Height");
			JTextField jt12=new JTextField(50);
		JPanel JP13=new JPanel();	
			JCheckBox jcb = new JCheckBox("Height is lower edge (Not center)");
	
	JPanel JP2=new JPanel();
		JLabel jl21 = new JLabel("Channets");
		JTextField jt21=new JTextField(20);
		JLabel jl22 = new JLabel("Watts");
		JTextField jt22=new JTextField(20);
		JButton jb21 =new JButton("adjust");
		JLabel jl23 = new JLabel("Antenna Type");
		JComboBox jc1=new JComboBox(lista2);
		JLabel jl24 = new JLabel("Electrical downtilt from");
		JTextField jt23=new JTextField(20);
		JLabel jl25 = new JLabel("to");
		JTextField jt24=new JTextField(20);
		JButton jb22 =new JButton("adjust");
		JLabel jl26 = new JLabel("polarization");
		JComboBox jc2=new JComboBox(lista);

	JPanel JP22=new JPanel();
	JPanel JP23=new JPanel();
	JPanel JP24=new JPanel();
	JPanel JP25=new JPanel();
	
		
	public ventana20() {
		super("Antenna");

		this.setSize(700, 500);
		BorderLayout layoutFrame = new BorderLayout();
		this.setLayout(layoutFrame);
		
		
	

		// Añadimos los componentes al panel
	
		GridLayout Grid=new GridLayout(3,1);
		JP1.setLayout(Grid);
		
		JP11.add(jl11);
		JP11.add(jt11);
		JP12.add(jl12);
		JP12.add(jt12);
		JP13.add(jcb);
		
		JP1.add(JP11);
		JP1.add(JP12);
		JP1.add(JP13);

		// Añadimos el panel al frame. Especificamos NORTH para que lo coloque al
		// norte(arriba)
		this.add(JP1, BorderLayout.NORTH);
		JP1.setBorder(BorderFactory.createTitledBorder("Posicion/direction"));
		
		JP1.setPreferredSize(new Dimension(250, 100)); // Jugar con los números para ver las salidas

		GridLayout Grid2=new GridLayout(4,1);
		JP2.setLayout(Grid2);
		
		
		JP22.add(jl21);
		JP22.add(jt21);
		JP22.add(jl22);
		JP22.add(jt22);
		JP22.add(jb21);
		JP23.add(jl23);
		JP23.add(jc1);
		JP24.add(jl24);
		JP24.add(jt23);
		JP24.add(jl25);
		JP24.add(jt24);
		JP24.add(jb22);
		JP25.add(jl26);
		JP25.add(jc2);
		
		JP2.add(JP22);
		JP2.add(JP23);
		JP2.add(JP24);
		JP2.add(JP25);
		
		
		this.add(JP2, BorderLayout.CENTER);
		JP2.setPreferredSize(new Dimension(100, 100));
		JP2.setBorder(BorderFactory.createTitledBorder("Posicion/direction"));
		
	/*	///////////////////////////////////////////
		// SEGUNDO PANEL - PANEL QUE VA AL ESTE ///
		///////////////////////////////////////////

		
		
		mos un color de fondo
		// Usamos la clase color y el método estático decode();
		// Dentro de decode ponemos un string indicando el color en hexadecimal
		panelEste.setBackground(Color.decode("#89C4F4"));

		// Añadimos los componentes al panel
		// Añadimos además un area transparente alrededor de los componentes para que no
		// se solapen

		panelEste.add(Box.createRigidArea(new Dimension(20, 60)));// ancho, alto del area transparente
		panelEste.add(jl1);
		panelEste.add(Box.createRigidArea(new Dimension(20, 60)));
		panelEste.add(jl2);
		panelEste.add(Box.createRigidArea(new Dimension(20, 60)));
		panelEste.add(jl3);
		panelEste.add(Box.createRigidArea(new Dimension(20, 60)));
		panelEste.add(jl4);
		panelEste.add(Box.createRigidArea(new Dimension(20, 60)));
		panelEste.add(jl5);
		panelEste.add(Box.createRigidArea(new Dimension(20, 60)));

		// Añadimos el panel al frame. Especificamos la constante EAST para colocar el
		// panel a este
		this.add(panelEste, BorderLayout.EAST);

		// Al situarlo al norte del border layout, este establcera un ancho y alto por
		// defecto
		// Para intentar cambiar el alto del JPanel usamos setPreferredSize()
		// Es necesario el uso de la clase Dimension que registra el ancho y alto
		panelEste.setPreferredSize(new Dimension(120, 700)); // Jugar con los números para ver las salidas!!!

		//////////////////////
		// JTextArea //
		//////////////////////

		// añadimos el componente JTextArea en el centro del frame
		this.add(txtArea, BorderLayout.CENTER);*/

		this.setVisible(true);
		// this.pack();//Esto nos ajusta la venta al contenido, si no se pone entonces
		// hay que establecer un setSize();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ventana20();
	}

}
