import javax.swing.JFrame;
import javax.swing.JLabel;

public class ventana01 extends JFrame {
	
	//Inicialización de componentes que vayamos a utilizar
	JLabel rojoLabel = new JLabel("Rojo");
	JLabel verdeLabel = new JLabel("Verde");
	JLabel amarilloLabel = new JLabel("Amarillo");

	public ventana01(){
	    super("Titulo");
	    this.setLayout(null);
	    this.setSize(200, 200);


    // Colocación de componentes, por ejemplo
	    				   //x, y, ancho,alto
	    rojoLabel.setBounds(10,10, 150,35);
	    verdeLabel.setBounds(10,55, 150, 35);
	    amarilloLabel.setBounds(10,100, 150, 35);
	    
	    // Adición de componentes, por ejemplo (el this es opcional)
	    this.add(rojoLabel); //el add es para que muestre el valor creado en el metodo
	    this.add(amarilloLabel);
	    this.add(verdeLabel);
	   	    

	    this.setResizable(false);
	    this.setVisible(true);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String [] main){
	  
	            new ventana01();  //Invocamos al constructor para que se ejecuten las acciones de dentro 

	        }
}