import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//ejercicio 2

public class Ejercio2 extends JFrame{
	String[] elementos = {"Si", "No"};
	
	JPanel generalPanel = new JPanel();
	
	
		JPanel NoTrPrSe = new JPanel();
			JLabel lNombre = new JLabel("Nombre");
			JTextField tNombre = new JTextField();
			JLabel lTratamiento = new JLabel("Tratamiento");
			JTextField tTratamiento = new JTextField();
			JLabel lPrimer = new JLabel("Primer Apellido");
			JTextField tPrimer = new JTextField();
			JLabel lSegun = new JLabel("Segundo Apellido");
			JTextField tSegun = new JTextField();
			
	
		
		JPanel EdAlFu = new JPanel();
			JLabel lEdad = new JLabel("Edad");
			JTextField tEdad = new JTextField();
			JLabel lAlco = new JLabel("Alcohol");
			JComboBox<String> cAlco = new JComboBox<>(elementos);
			JLabel lFum = new JLabel("Fumar");
			JComboBox<String> cFum = new JComboBox<>(elementos);
			
		JPanel HiDiRe = new JPanel();
			JLabel lHist = new JLabel("Nº Historial Clinico");
			JTextField tHist = new JTextField();
			JLabel lDiag = new JLabel("Diagnostico");
			JTextField tDiag = new JTextField();	
			JButton regis= new JButton("Registrar paciente");
			
			
		
	
	public Ejercio2() {
		this.setTitle("Wrapper JFrame");
		this.setLayout(null);
		this.setSize(800,650);
		
		//Establecemos el layout de cada panel
		generalPanel.setLayout(null);
		//BorderFactory clase responsable de generar bordes
		generalPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Insertar"));
		
		
		NoTrPrSe.setLayout(null);	
		NoTrPrSe.setBounds(20,20, 600, 170);
			lNombre.setBounds(10,10, 100, 30);
			tNombre	.setBounds(140,10, 100, 30);
			lTratamiento.setBounds(300,10, 100, 30);
			tTratamiento.setBounds(380,10, 100, 30);
			lPrimer.setBounds(10,60, 100, 30);
			tPrimer.setBounds(140,60, 100, 30);
			lSegun.setBounds(10,110, 100, 30);
			tSegun.setBounds(140,110, 100, 30);
			
		EdAlFu.setLayout(null);	
		EdAlFu.setBounds(20,170, 600, 160);
			lEdad.setBounds(10,10, 100, 30);
			tEdad.setBounds(140,10, 100, 30);
			lAlco.setBounds(10,60, 100, 30);
			cAlco.setBounds(140,60, 100, 30);
			lFum.setBounds(10,110, 100, 30);
			cFum.setBounds(140,110, 100, 30);
			
		HiDiRe.setLayout(null);
		HiDiRe.setBounds(20,320, 600, 200);
			lHist.setBounds(10,10, 130, 30);
			tHist.setBounds(140,10, 100, 30);
			lDiag.setBounds(10,60, 100, 30);
			tDiag.setBounds(140,60, 100, 30);
			regis.setBounds(270,60, 300, 30);
		
		//Situamos los paneles y los componentes con respecto al panel que pertenecen.
		//A su vez, añadimos los componentes al panel correspondiente
		generalPanel.setBounds(10,10, 700, 600);
		
		
		
		
			NoTrPrSe.add(lNombre);
			NoTrPrSe.add(tNombre);
			NoTrPrSe.add(lTratamiento);
			NoTrPrSe.add(tTratamiento);
			NoTrPrSe.add(lPrimer);
			NoTrPrSe.add(tPrimer);		
			NoTrPrSe.add(lSegun);
			NoTrPrSe.add(tSegun);
			
				
			EdAlFu.add(lEdad);
			EdAlFu.add(tEdad);
			EdAlFu.add(lAlco);
			EdAlFu.add(cAlco);		
			EdAlFu.add(lFum);
			EdAlFu.add(cFum);
			
			
			HiDiRe.add(lHist);
			HiDiRe.add(tHist);
			HiDiRe.add(lDiag);
			HiDiRe.add(tDiag);		
			HiDiRe.add(regis);
		
		
			//Añadimos al JPanel General cada JPanel y el JButton
		generalPanel.add(NoTrPrSe);
		generalPanel.add(EdAlFu);
		generalPanel.add(HiDiRe);
		
		//Por último añadimos el JPanel general al JFrame
		this.add(generalPanel);
		
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String [] args) {
		
		
		
		new Ejercio2();
		
		
	}
	
}
