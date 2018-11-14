import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ventana04 extends JFrame{
	
	JLabel User = new JLabel("User"); 
	JLabel Pass = new JLabel("Password"); 
	JTextField CuaTex1 = new JTextField();
	JTextField CuaTex2 = new JTextField();
	JButton Butt1 = new JButton("login");
	JButton Butt2 = new JButton("register");
	
	public ventana04() {
		
		super("titulo");
		
		this.setLayout(null);
		setSize(300,200);
		
		CuaTex1.setBounds(150,10, 100, 25);
		CuaTex2.setBounds(150,55, 100, 25);
		User.setBounds(10,10, 75, 35);
		Pass.setBounds(10,55, 100, 35);
		Butt1.setBounds(10,100, 100, 25);
		Butt2.setBounds(150,100, 100, 25);
		
		
		
		this.add(User);
		this.add(Pass);
		this.add(CuaTex1);	
		this.add(CuaTex2);	
		this.add(Butt1);
		this.add(Butt2);
		
		this.setResizable(false); 
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String [] main){
		  
        new ventana04();
    }
}
