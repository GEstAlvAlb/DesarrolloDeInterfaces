import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class trabajo01 extends JFrame {
	
	String [] cosas1 = {"staff","taffs","affst","ffsta","fstaf"};
	String [] cosas2 = {"/bin/ksh","/bin/asd","/bin/qwe","/bin/home","/bin/casd","/bin/her"};
	
	JLabel NuUser = new JLabel("Create a new user"); 
	JLabel nombreLabel = new JLabel("User Name:"); 
	JLabel FName = new JLabel("Full Name:"); 
	JLabel UId = new JLabel("User ID:"); 
	JLabel Group = new JLabel("Group:"); 
	JLabel Direc = new JLabel("Home Directory:");
	JLabel Log = new JLabel("Login Shell:"); 
	
	
	JTextField CnombreField = new JTextField("mary");
	JTextField CFName = new JTextField("User Mary");
	JTextField CUId = new JTextField("Automatic");	
	JTextField CDirec = new JTextField("Automatic");
	
	JComboBox combo1 = new JComboBox(cosas1);
	JComboBox combo2 = new JComboBox(cosas2);
	
	//Inicialización de componentes que vayamos a utilizar	
	public trabajo01(){
	    super("New user"); //titulo de la pagina

	    this.setLayout(null); //se da mas adelnate
	    this.setSize(350,310); //tamaño de la ventana

	    // Colocación de componentes, por ejemplo
	    				   //x, y, ancho,alto
	    NuUser.setBounds(10,5, 120, 50);   //medidas del texto y su posicion
	    nombreLabel.setBounds(10,45, 75, 35);   
	    FName.setBounds(10,80, 75, 35);   
	    UId.setBounds(10,120, 75, 35);   
	    Group.setBounds(10,160, 75, 35);   
	    Direc.setBounds(10,200, 120, 35); 
	    Log.setBounds(10,240, 75, 35);   
	    
	    
	    CnombreField.setBounds(130,45,200, 25);   //medidas del cuadro de texto y su posicion
	    CFName.setBounds(130,80, 200, 25);
	    CUId.setBounds(130,120, 200, 25);
	    CDirec.setBounds(130,200,200, 25);
	    
	    
	    combo1.setBounds(130,160,75, 25);
	    combo2.setBounds(130,240,125, 25);
	    
	    // Adición de componentes, por ejemplo 
	    
	    
		this.add(NuUser);	//texto
		this.add(nombreLabel);
		this.add(FName);
		this.add(UId);
		this.add(Group);
		this.add(Direc);
		this.add(Log);
		
		
		this.add(CnombreField);	//caja de texto
		this.add(CFName);	
		this.add(CUId);	
		this.add(CDirec);	
		
		
		this.add(combo1);	
		this.add(combo2);    

		
	    this.setResizable(false); 
	    this.setVisible(true);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String [] main){
	  
	            new trabajo01();
	        }
	  
	}