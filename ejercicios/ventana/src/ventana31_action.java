import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


  /*
   * Ejercicio 1. Disponer dos objetos de la clase 
   * JButton con las etiquetas: "var�n" y "mujer", al presionarse 
   * mostrar en la barra de t�tulos del JFrame 
   * la etiqueta del bot�n presionado. 
   * */


public class ventana31_action extends JFrame implements ActionListener{
	
	JButton varonBtn, mujerBtn, nocontestaBtn;
	
	public ventana31_action() {
		//Invocamos al constructor de la clase base JFrame
		//que espera un tipo String que es el t�tulo de la ventana
		//esto es opcional ya que no tiene obligatoriamente que tener un t�tulo
		super("Titulo");
		
		//Asigando null a la entrada pues ya no hacemos uso de layout managers
		setLayout(null);
		
		varonBtn = new JButton("VARON");
		mujerBtn = new JButton("MUJER");
		nocontestaBtn = new JButton("NO CONTESTA");
		
		mujerBtn.setBounds(10,10, 100, 20);
		varonBtn.setBounds(10,40, 100, 20);
		nocontestaBtn.setBounds(10,70, 100, 20);
		
		add(mujerBtn);
		add(varonBtn);
		add(nocontestaBtn);
		
		//Se dispara el m�todo actionPerformed cada vez que haya un evento
		mujerBtn.addActionListener(this);
		nocontestaBtn.addActionListener(this);
		varonBtn.addActionListener(this);		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400, 200);
		
		//Colocar en la pantalla a gusto del programador (x,y)
		setLocation(400,400);
		
	}
	
	public static void main(String [] args) {
		new ventana31_action();
	}

	//Es obligatorio sobreescribir los m�todos que se implementan de una interfaz
	@Override
	public void actionPerformed(ActionEvent event) {
		//Distinguir entre un boton y otro
		if(event.getSource() == mujerBtn) {
			this.setTitle("Mujer");			
		}
		
		if(event.getSource() == varonBtn) {
			this.setTitle("Var�n");
		}
		
		if(event.getSource() == nocontestaBtn) {
			this.setTitle("No contesta");
		}
		
	}

}
