import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ventana02 extends JFrame {
	
	JLabel nombreLabel = new JLabel("Nombre"); // metodo para poner un texto
	JTextField nombreField = new JTextField();	// metodo para hacer una caja de texto	
	JButton aceptarBtn = new JButton("Aceptar"); // metodo para poner un boton y los parentesis un texto dentro del boton
	
	//Inicialización de componentes que vayamos a utilizar	
	public ventana02(){
	    super("Titulo"); //titulo de la pagina

	    this.setLayout(null); //se da mas adelnate
	    this.setSize(350, 200); //tamaño de la ventana

	    // Colocación de componentes, por ejemplo
	    				   //x, y, ancho,alto
	    nombreLabel.setBounds(10,10, 75, 35);   //medidas del texto y su posicion
	    nombreField.setBounds(90,10,250, 25);   //medidas del cuadro de texto y su posicion
	    aceptarBtn.setBounds(10, 100, 100, 35); //medidas del boton y su posicion 
	    
	    // Adición de componentes, por ejemplo 
		this.add(nombreLabel);	//texto
		this.add(nombreField);	//caja de texto
		this.add(aceptarBtn);	//boton
	   	    

	    this.setResizable(false); 
	    this.setVisible(true);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String [] main){
	  
	            new ventana02();
	        }
	  
	}