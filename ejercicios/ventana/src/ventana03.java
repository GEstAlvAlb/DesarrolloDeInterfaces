import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ventana03 extends JFrame{
	
	JTextField CuaTex1 = new JTextField();
	JTextField CuaTex2 = new JTextField();
	JButton Butt = new JButton("Sumar");
	
	public ventana03() {
		
		super("titulo");
		
		this.setLayout(null);
		setSize(200,200);
		
		CuaTex1.setBounds(10,10, 75, 35);
		CuaTex2.setBounds(10,55, 75, 35);
		Butt.setBounds(10,100, 75, 35);
		
		this.add(CuaTex1);	
		this.add(CuaTex2);	
		this.add(Butt);
		
		this.setResizable(false); 
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String [] main){
		  
        new ventana03();
    }
}
