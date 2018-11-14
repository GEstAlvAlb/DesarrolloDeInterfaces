
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/** 
 *	Este sencillo cliente de correo está compuesto por un BorderLayout
 *	y un FlowLayout ( sus componentes son un panel (que vamos a colocar en fila con un flow layout) ,3 botones y un TextArea).
 *
 *	el border layout está en el frame y el flow en el panel.
 *	el panel contiene tres botones que que va al norte del border layout, colocados con un flow layout.
 *	y el textarea va en el frame que va a en la posición center del border layout
 */



public class ventana14 extends JFrame{
	
	
	JButton enviarboton = new JButton("Enviar");
	JButton vaciarBoton = new JButton("Vaciar");
	JButton cancelarBoton = new JButton("Cancelar");
	JTextArea textoCorreo = new JTextArea();
	
	
	public ventana14(){
		
		super("Cliente de correo");
												//horizontal gap, vertical gap
		BorderLayout borderLayout = new BorderLayout(10,10);//especificamos espacios entre componentes
			
		//Layout del frame				
		this.setLayout(borderLayout);
		
		//Layout del panel
		JPanel panelNorte = new JPanel();
		FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER, 10 , 10);
		panelNorte.setLayout(flowLayout);
		
		panelNorte.add(enviarboton);
		panelNorte.add(vaciarBoton);
		panelNorte.add(cancelarBoton);
		
		//Cuando añadimos el componente al frame,
		//especificamos en el segundo parámetro donde se va a colocar en el layout del frame
		this.add(panelNorte, BorderLayout.NORTH);
		
		//texto correo ocupa la posición CENTER y va a ocupar todo el ancho y alto posible
		this.add(textoCorreo, BorderLayout.CENTER);
		
		this.setSize(600,300);
		this.setResizable(false);
		this.setVisible(true);  
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public  static void main(String[] args){
		new ventana14();
	}
}