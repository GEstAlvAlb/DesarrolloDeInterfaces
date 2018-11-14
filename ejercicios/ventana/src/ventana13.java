import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * Sencilla aplicacion de conversión donde se usa un frame
 * El frame contiene un grid de un 5 filas y 1 columna
 * 
 * */


public class ventana13 extends JFrame{

	String[] elementos = {"Kilómetros", "Metros", "Milímetros"};
	JComboBox<String> combo = new JComboBox<>(elementos);
	JTextField campoEntrada = new JTextField("1234.56");
	JTextField campoResultado = new JTextField("9876.54");
	JLabel convertirLabel = new JLabel("Unidad a convertir");
	JLabel resultadoLabel = new JLabel("Resultado");
	
	JComboBox<String> combo1 = new JComboBox<>(elementos);
	JTextField campoEntrada1 = new JTextField("1234.56");
	JTextField campoResultado1 = new JTextField("9876.54");
	JLabel convertirLabel1 = new JLabel("Unidad a convertir");
	JLabel resultadoLabel1 = new JLabel("Resultado");

	public ventana13() {
		
		super("Conversión de unidades");
		setLayout(new GridLayout(5, 2)); //dice el numero de fulas y de columnas
		setSize(450,250);    
	    
	    this.add(combo);		//el orden es por filas primero rellena la primera fila	
	    this.add(combo1);		//primera columna despues primera fila segunda columna
	    this.add(convertirLabel);
	    this.add(convertirLabel1);
	    this.add(campoEntrada);
	    this.add(campoEntrada1);
	    this.add(resultadoLabel);
	    this.add(resultadoLabel1);
	    this.add(campoResultado);
	    this.add(campoResultado1);
	    
	
	    
	    setVisible(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	}
	
	public static void main(String [] args) {
		new ventana13();
	}

}
