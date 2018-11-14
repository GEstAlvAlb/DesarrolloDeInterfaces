import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ventana10jpanel extends JFrame {
	
	String [] Com = {"instrumenos","a","d","s","c","r"};
	//Inicialización de componentes que vayamos a utilizar
	
	//Creamos 3 contenedores de tipo JPanel
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	JPanel panel5 = new JPanel();
	
	
	//Atributos de clase
	JLabel Nom = new JLabel("Nombre del producto");
	JLabel Cat = new JLabel("Categoria");
	JLabel Desc = new JLabel("Descripcion");
	JLabel Pre = new JLabel("Precio");
	
	
	JTextField TNom = new JTextField();
	
	JTextField TDesc = new JTextField();
	JTextField TPre = new JTextField();

	JComboBox combo = new JComboBox(Com);
	
	JButton Gua=new JButton("Guardar");
	JButton Can=new JButton("Cancelar");
	

	public ventana10jpanel(){
		
	    super("jnn");

	    this.setLayout(null);//Layout con posiciones absolutas
	    this.setSize(300, 250);

	    panel1.setLayout(null); //JPanel también pueden distribuir los componentes
	    					// x  y  ancho alto
	    panel1.setBounds(10,10, 900, 30 );
	    panel2.setLayout(null);
	    panel2.setBounds(10,40, 900, 30 );
	    panel3.setLayout(null);
	    panel3.setBounds(10,70, 900, 30 );
	    panel4.setLayout(null);
	    panel4.setBounds(10,100, 900, 30 );
	    panel5.setLayout(null);
	    panel5.setBounds(10,130, 900, 30 );
	
	   
	   
	    
	    //Establecemos posiciones y dimensiones
	    Nom.setBounds(10,10, 125, 20 );
	    TNom.setBounds(140,10, 100, 20);
	    
	    Cat.setBounds(10,10, 125, 20 );
	    combo.setBounds(140,10, 100, 20);
	    
	    Desc.setBounds(10,10, 125, 20 );
	    TDesc.setBounds(140,10, 100, 20);
	    
	    Pre.setBounds(10,10, 125, 20 );
	    TPre.setBounds(140,10, 100, 20);
	    
	    Gua.setBounds(10,10, 125, 20 );
	    Can.setBounds(140,10, 100, 20);
	    
	    
	    //Añadimos al panel el checkbox y el label.
	    //De tal forma que ahora las posiciones y dimensiones de ambos componentes
	    //son relativas al panel.
	    panel1.add(Nom);
	    panel1.add(TNom);
	    
	    panel2.add(Cat);
	    panel2.add(combo);
	    
	    panel3.add(Desc);
	    panel3.add(TDesc);
	    
	    panel4.add(Pre);
	    panel4.add(TPre);
	    
	    panel5.add(Gua);
	    panel5.add(Can);
	    
	  
	    
	    
	    //Añadimos al layout cada panel
	    this.add(panel1);
	    this.add(panel2);
	    this.add(panel3);
	    this.add(panel4);
	    this.add(panel5);

	    
	    
	    this.setResizable(false);
	    this.setVisible(true);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String [] main){
		
        new ventana10jpanel();

	}
}

