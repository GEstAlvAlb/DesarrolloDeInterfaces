import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;


public class ventana06 extends JFrame{

	String [] listColores = {"Rojo","Verde","Azul","Amarillo","Cyan","Celeste"}; //crea un string que contengas los colores 
	
	JComboBox combo = new JComboBox(listColores);
	
	public ventana06() {
		super("Ventana colores");
		
		this.setLayout(null);
	    this.setSize(225, 250);
	    
	    combo.setBounds(50,50, 80, 40);
	    this.add(combo);
	    
	    this.setResizable(false);
	    this.setVisible(true);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String [] main){
		 
        new ventana06();

	}
}
