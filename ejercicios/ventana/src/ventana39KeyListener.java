import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JTextField;

/*
 * En este ejercicio solo necesitamos un 
 * JTextField situado al norte del frame
 * 
 * Cada vez que introduzcamos un caracter 
 * debemos controlar que tecla fue pulsada
 * y entonces cambiamos el fondo del frame.
 * 
 * Cada caracter minuscula de tipo letra
 * tendrá asociado un codigo RGB.
 * 
 * Los demás caracteres generarán un color aleatorio
 * */
//Al implementar la interfaz que gestiona los eventos de tipo teclado
//se incorporan 3 métodos obligatorios que serán colocados al final del código
public class ventana39KeyListener extends JFrame implements KeyListener{
	public ventana39KeyListener() {
		super("Cambio de color");

		this.setSize(800, 400);

		JTextField campo = new JTextField(5);
		//este campo de texto es el que detecta los eventos de tipo teclado
		campo.addKeyListener(this);

		this.add(campo, BorderLayout.NORTH);

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}

	////////////// Métodos implementados por la interfaz KeyListener /////////////
	
	//Este método se llama cuando una tecla se pulsa
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("Has pulsado una tecla");
	}

	//Este se invoca cuando una tecla se suelta(tras ser pulsada)
	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("Has soltado una tecla");
	}

	//Método usado para detectar inputs
	//se invoca cuando el campo de texto sobre el que estamos escribiendo 
	//detecta que un caracter ha sido escrito
	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("Has escrito un caracter");
		//Gestionamos la letra pulsada
				//La a pone el fondo en rojo
				switch (e.getKeyChar()) {
				case 'a':
					//getContentPane() nos devuelve el panel creado automáticamente por Java
					//sobre el cual yace el frame
					//Es obligatorio invocarlo si queremos cambiar alguna propiedad del frame
					this.getContentPane().setBackground(new Color(252, 205, 198));
					break;
				case 'b':
					this.getContentPane().setBackground(new Color(255,211,92));
					break;
				case 'c':
					this.getContentPane().setBackground(new Color(190,64,75));
					break;
				case 'd':
					this.getContentPane().setBackground(new Color(218,57,59));
					break;
				case 'e':
					this.getContentPane().setBackground(new Color(178,78,80));
					break;
				case 'f':
					this.getContentPane().setBackground(new Color(243,146,75));
					break;
				case 'g':
					this.getContentPane().setBackground(new Color(253,215,130));
					break;
				case 'h':
					this.getContentPane().setBackground(new Color(171,173,89));
					break;
				case 'i':
					this.getContentPane().setBackground(new Color(169,221,199));
					break;
				case 'j':
					this.getContentPane().setBackground(new Color(181,198,130));
					break;
				case 'k':
					this.getContentPane().setBackground(new Color(141,189,193));
					break;
				case 'l':
					this.getContentPane().setBackground(new Color(76,196,213));
					break;
				case 'm':
					this.getContentPane().setBackground(new Color(160,186,161));
					break;
				case 'n':
					this.getContentPane().setBackground(new Color(181,176,76));
					break;
				case 'ñ':
					this.getContentPane().setBackground(new Color(0,145,106));
					break;
				case 'o':
					this.getContentPane().setBackground(new Color(100,165,187));
					break;
				case 'p':
					this.getContentPane().setBackground(new Color(1,198,121));
					break;
				case 'q':
					this.getContentPane().setBackground(new Color(255, 216, 209));
					break;
				case 'r':
					this.getContentPane().setBackground(new Color(255,207,145));
					break;
				case 's':
					this.getContentPane().setBackground(new Color(243,182,177));
					break;
				case 't':
					this.getContentPane().setBackground(new Color(255,237,153));
					break;
				case 'u':
					this.getContentPane().setBackground(new Color(201,221,176));
					break;
				case 'v':
					this.getContentPane().setBackground(new Color(245,131,77));
					break;
				case 'w':
					this.getContentPane().setBackground(new Color(255,217,194));
					break;
				case 'x':
					this.getContentPane().setBackground(new Color(222,181,187));
					break;
				case 'y':
					this.getContentPane().setBackground(new Color(210,201,146));
					break;
				case 'z':
					this.getContentPane().setBackground(new Color(253,173,250));
					break;
				default:
					//Cuando se pulse otra tecla o sean mayusculas generamos un color aleatorio
					Random aleatorio = new Random();
					int r = aleatorio.nextInt(256); //numero entre 0 y 255
					int g = aleatorio.nextInt(256); //numero entre 0 y 255
					int b = aleatorio.nextInt(256); //numero entre 0 y 255
					this.getContentPane().setBackground(new Color(r,g,b));
					break;
				}
	}


	public static void main(String [ ] argumentos) {
		new ventana39KeyListener();
	}
}
