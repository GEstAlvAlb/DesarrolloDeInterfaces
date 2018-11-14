import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ventana11 extends JFrame {
	

	//Inicialización de componentes que vayamos a utilizar
	
	//Creamos 3 contenedores de tipo JPanel
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	
	
	//Atributos de clase
	JLabel Usu = new JLabel("Usuario");
	JLabel Cont = new JLabel("Contraseña");
	
	
	
	JTextField TUsu = new JTextField();
	JTextField Tcon = new JTextField();

	

	JButton Con=new JButton("conectar");
	

	public ventana11(){
		
	    super("jnn");

	    this.setLayout(null);//Layout con posiciones absolutas
	    this.setSize(300, 300);

	    panel1.setLayout(null); //JPanel también pueden distribuir los componentes
	    						// x  y  ancho alto
	    panel1.setBounds(10,10, 275, 260 );
	    panel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"panel general")); //pone el borde y el titulo
	    
	    panel2.setLayout(null);
	    panel2.setBounds(10,20, 255, 40 );
	    panel2.setBackground(Color.blue);
	    
	    panel3.setLayout(null);
	    panel3.setBounds(10,70, 255,40 );
	    panel3.setBackground(Color.red);
	
	   
	   
	    
	    //Establecemos posiciones y dimensiones
	    Usu.setBounds(10,10, 100, 20 );
	    TUsu.setBounds(90,10, 100, 20);
	    
	    Cont.setBounds(10,10, 100, 20 );
	    Tcon.setBounds(90,10, 100, 20);
	    
	    Con.setBounds(100,200, 100, 20 );
	 
	    this.add(panel1);
	    this.add(panel2);
	    this.add(panel3);
	    
	    //Añadimos al panel el checkbox y el label.
	    //De tal forma que ahora las posiciones y dimensiones de ambos componentes
	    //son relativas al panel.
	    panel1.add(panel2);
	    panel1.add(panel3);
	    
	    
	    panel2.add(Usu);
	    panel2.add(TUsu);
	    
	    panel3.add(Cont);
	    panel3.add(Tcon);
	    
	    panel1.add(Con);
	  
	    
	    
	    //Añadimos al layout cada panel
	   

	    
	    
	    this.setResizable(false);
	    this.setVisible(true);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String [] main){
		
        new ventana11();

	}
}

