import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * Creamos 2 Jpanels uno para un box layout que distribuya 5 botones en una fila
 * que colocamos al norte del border layout del frame
 * Y otro para crear una columna de 5 JLabels que colocaremos al este del border layout
 * en el frame
 * 
 * Le daremos a cada JPanel un color de fondo para distinguir el área que estan ocupando
 * 
 * Por último situamos un JTextArea en el centro del BorderLayout
 */

public class ventana19 extends JFrame{

	//Cinco JButton en el panel NORTE
	JButton jb1 = new JButton("Abrir");
	JButton jb2 = new JButton("Guardar");
	JButton jb3 = new JButton("Compilar");
	JButton jb4 = new JButton("Ejecutar");
	JButton jb5 = new JButton("Salir");
	
	
	//Y cinco JLabels en el panel ESTE
	JLabel jl1 = new JLabel("Abrir");
	JLabel jl2 = new JLabel("Guardar");
	JLabel jl3 = new JLabel("Compilar");
	JLabel jl4 = new JLabel("Ejecutar");
	JLabel jl5 = new JLabel("Salir");
	
	//Y el JTextArea del frame que va en el centro
	JTextArea txtArea = new JTextArea();

	public ventana19() {
		super("Box | Columna");

		this.setSize(700,500);
		BorderLayout layoutFrame = new BorderLayout();
		this.setLayout(layoutFrame);

		////////////////////////////////////////////
		// PRIMER PANEL - PANEL QUE VA AL NORTE ///
		////////////////////////////////////////////
		
		//BoxLayout no puede ser creado directamente sobre el JFRAME!
		JPanel panelNorte = new JPanel();
		//Cramos un layout en el panel, con distribución vertical(Y_AXIS)
		BoxLayout boxLayoutPN = new BoxLayout(panelNorte, BoxLayout.X_AXIS);

		//Establecemos boxLayout como layout del panel
		panelNorte.setLayout(boxLayoutPN);

		//Ponemos un color de fondo
		//Usamos la clase color y el método estático decode();
		//Dentro de decode ponemos un string indicando el color en hexadecimal
		panelNorte.setBackground(Color.decode("#317589"));
		
		//Añadimos los componentes al panel
		//Añadimos además un area transparente alrededor de los componentes para que no se solapen
		//Descomenten las líneas para ver como se comportan las instrucciones 
		panelNorte.add(Box.createRigidArea(new Dimension(50,30)));//ancho, alto del area transparente
		panelNorte.add(jb1);
		panelNorte.add(Box.createRigidArea(new Dimension(50,30)));
		panelNorte.add(jb2);
		panelNorte.add(Box.createRigidArea(new Dimension(50,30)));
		panelNorte.add(jb3);
		panelNorte.add(Box.createRigidArea(new Dimension(50,30)));
		panelNorte.add(jb4);
		panelNorte.add(Box.createRigidArea(new Dimension(50,30)));
		panelNorte.add(jb5);
		panelNorte.add(Box.createRigidArea(new Dimension(50,30)));


		//Añadimos el panel al frame. Especificamos NORTH para que lo coloque al norte(arriba)
		this.add(panelNorte, BorderLayout.NORTH);
		//Al situarlo al norte del border layout, este establcera un ancho y alto por defecto
		//Para intentar cambiar el alto del JPanel usamos setPreferredSize()
		//Es necesario el uso de la clase Dimension que registra el ancho y alto
		panelNorte.setPreferredSize(new Dimension(750,60)); //Jugar con los números para ver las salidas

		////////////////////////////////////////////
		// SEGUNDO PANEL - PANEL QUE VA AL ESTE ///
		////////////////////////////////////////////

		//BoxLayout no puede ser creado directamente sobre el JFRAME!
		JPanel panelEste = new JPanel();
		//Cramos un layout en el panel, con distribución vertical(Y_AXIS)
		BoxLayout boxLayoutPE = new BoxLayout(panelEste, BoxLayout.Y_AXIS);

		//Establecemos boxLayout como layout del panel
		panelEste.setLayout(boxLayoutPE);

		//Ponemos un color de fondo
		//Usamos la clase color y el método estático decode();
		//Dentro de decode ponemos un string indicando el color en hexadecimal
		panelEste.setBackground(Color.decode("#89C4F4"));
		
		
		//Añadimos los componentes al panel
		//Añadimos además un area transparente alrededor de los componentes para que no se solapen
		
		panelEste.add(Box.createRigidArea(new Dimension(20,60)));//ancho, alto del area transparente
		panelEste.add(jl1);                           
		panelEste.add(Box.createRigidArea(new Dimension(20,60)));
		panelEste.add(jl2);
		panelEste.add(Box.createRigidArea(new Dimension(20,60)));
		panelEste.add(jl3);
		panelEste.add(Box.createRigidArea(new Dimension(20,60)));
		panelEste.add(jl4);
		panelEste.add(Box.createRigidArea(new Dimension(20,60)));
		panelEste.add(jl5);
		panelEste.add(Box.createRigidArea(new Dimension(20,60)));


		//Añadimos el panel al frame. Especificamos la constante EAST para colocar el panel a este
		this.add(panelEste, BorderLayout.EAST);
		
		//Al situarlo al norte del border layout, este establcera un ancho y alto por defecto
		//Para intentar cambiar el alto del JPanel usamos setPreferredSize()
		//Es necesario el uso de la clase Dimension que registra el ancho y alto
		panelEste.setPreferredSize(new Dimension(120,700)); //Jugar con los números para ver las salidas!!!

		//////////////////////
		//     JTextArea 	//
		//////////////////////
		
		//añadimos el componente JTextArea en el centro del frame
		this.add(txtArea, BorderLayout.CENTER);
		
		this.setVisible(true);
		//this.pack();//Esto nos ajusta la venta al contenido, si no se pone entonces hay que establecer un setSize();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ventana19();
	}

}
