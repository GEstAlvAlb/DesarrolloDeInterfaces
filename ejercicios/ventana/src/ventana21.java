import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

public class ventana21 extends JFrame{
	
	public ventana21() {
		super("SpringLayout");

		SpringLayout layout = new SpringLayout();
		this.setLayout(layout);
		JLabel jl1 = new JLabel("Nombre");
		JTextField jt=new JTextField(10); // asi se le pone tamaño
		
		//El oeste del label lo situamos en el oeste del frame
		//el norte del label lo situamos en el norte del frame
	
		layout.putConstraint(SpringLayout.WEST, jl1, 20, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, jl1, 25, SpringLayout.NORTH, this);
		//Situar el oeste del field con el este del label
		//oeste es la parte derecha del componente
		//este es la izquierda del componente
		//y que entre ellos haya una diferencia de 10 pixeles
		layout.putConstraint(SpringLayout.WEST, jt, 20, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, jt, 0, SpringLayout.SOUTH, jl1);
		
		
		this.add(jl1);
		this.add(jt);
		

		this.setSize(350, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	


	public static void main(String[] args){
		new ventana21();
	}
}