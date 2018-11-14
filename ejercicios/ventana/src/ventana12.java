import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//ejercicio 3

public class ventana12 extends JFrame{

	JPanel generalPanel = new JPanel();
	
	
	JPanel formularioPanel = new JPanel();
	JLabel tituloLabel = new JLabel("Título");
	JTextField tituloCampo = new JTextField();
	
	JLabel etiquetasLabel = new JLabel("Etiquetas");
	JTextField etiquetasCampo = new JTextField();

	JPanel entradaPanel = new JPanel();
	JTextArea entradaArea = new JTextArea();
	
	public ventana12() {
		this.setTitle("Entrada de Blog");
		this.setLayout(null);
		this.setSize(800,650);
		
		//Establecemos el layout de cada panel
		generalPanel.setLayout(null);
		//BorderFactory clase responsable de generar bordes
		generalPanel.setBorder(BorderFactory.createTitledBorder(
		        BorderFactory.createEtchedBorder(), "Blog"));
		
		
		formularioPanel.setLayout(null);
		formularioPanel.setBorder(BorderFactory.createTitledBorder(
		        BorderFactory.createEtchedBorder(), "Detalles de la entrada"));
		
		entradaPanel.setLayout(null);
		entradaPanel.setBorder(BorderFactory.createTitledBorder(
		        BorderFactory.createEtchedBorder(), "Entrada"));
		
		//Situamos los paneles y los componentes con respecto al panel que pertenecen.
		//A su vez, añadimos los componentes al panel correspondiente
		generalPanel.setBounds(10,10, 700, 600);
		
		formularioPanel.setBounds(30,30, 500, 80);
		tituloLabel.setBounds(10,15, 155, 25);
		tituloCampo.setBounds(160,15,185,25);
		etiquetasLabel.setBounds(10,45, 155, 25);
		etiquetasCampo.setBounds(160,45,185,25);
		
		formularioPanel.add(tituloLabel);
		formularioPanel.add(tituloCampo);		
		formularioPanel.add(etiquetasLabel);
		formularioPanel.add(etiquetasCampo);
		
		entradaPanel.setBounds(30,130, 630, 440);
		entradaArea.setBounds(10,25, 570, 400);
		
		//Pequeño borde invisible dentro del textArea para que el cursor no quede tan pegado a la izquierda
		entradaArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		entradaPanel.add(entradaArea);
		
		
		//Añadimos al JPanel General cada JPanel y el JButton
		generalPanel.add(formularioPanel);
		generalPanel.add(entradaPanel);
		
		//Por último añadimos el JPanel general al JFrame
		this.add(generalPanel);
		
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String [] args) {
		
		
		
		new ventana12();
		
		
	}
	
}
