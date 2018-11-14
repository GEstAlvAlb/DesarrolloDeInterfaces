
	import java.awt.FlowLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JOptionPane;

	public class ventana43 extends JFrame implements ActionListener{

		JButton infoBtn = new JButton("Informaci�n");
		JButton advertenciaBtn = new JButton("Advertencia");
		JButton malBtn = new JButton("Incorrecto");
		JButton mensajeBtn = new JButton("Mensaje");
		JButton personalizadoBtn = new JButton("Personalizado");

		ImageIcon icono = new ImageIcon("fotos/exito.png");

		public ventana43() {

			super("JDialogs");

			this.setLayout(new FlowLayout());
			
	        ///////// Listeners de eventos ////////////////
			
			infoBtn.addActionListener(this);
			advertenciaBtn.addActionListener(this);
			malBtn.addActionListener(this);
			mensajeBtn.addActionListener(this);
			personalizadoBtn.addActionListener(this);
			
			///////// A�adimos al layout ///////////////////
			
			this.add(infoBtn);
			this.add(advertenciaBtn);
			this.add(malBtn);
			this.add(mensajeBtn);
			this.add(personalizadoBtn);

			this.pack();
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}

		@Override
		public void actionPerformed(ActionEvent evento) {
			
			//Tipos de dialogos disponibles que muestran informaci�n
			
			if(evento.getSource() == infoBtn) {
				JOptionPane.showMessageDialog(this,
						"Esto es un JDialog puramente informativo",
						"Informaci�n",
						JOptionPane.INFORMATION_MESSAGE);
			}

			if(evento.getSource() == advertenciaBtn ) {
				JOptionPane.showMessageDialog(this,
						"Su cuenta est� a punto de caducar",
						"�Cuidado!",
						JOptionPane.WARNING_MESSAGE);
			}
			
			if(evento.getSource() == malBtn ) {
				JOptionPane.showMessageDialog(this,
						"Este campo no puede modificarse",
						"Error",
						JOptionPane.ERROR_MESSAGE);
			}
			
			if(evento.getSource() == mensajeBtn ) {
				JOptionPane.showMessageDialog(this,
						"JDialog sin icono",
						"JDialog - Swing",
						JOptionPane.PLAIN_MESSAGE);
			}
			
			if(evento.getSource() == personalizadoBtn ) {
				JOptionPane.showMessageDialog(this,
						"Ha renovado sus libros con �xito",
						"JDialog - Icono personalizado",
						JOptionPane.INFORMATION_MESSAGE,
						icono);
			}
		}

		public static void main(String[] args) {
			new ventana43();
		}

	}
