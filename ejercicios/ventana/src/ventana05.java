import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class ventana05 extends JFrame{
	
	JTextField CuaTex1 = new JTextField();
	JTextArea CuaTex2 = new JTextArea();
	
	
	public ventana05() {
		
		super("titulo");
		
		this.setLayout(null);
		setSize(450,400);
		
		CuaTex1.setBounds(10,10, 200, 25);
		CuaTex2.setBounds(10,55, 350, 300);
		
		
		this.add(CuaTex1);	
		this.add(CuaTex2);	
		
		this.setResizable(false); 
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String [] main){
		  
        new ventana05();
    }
}
