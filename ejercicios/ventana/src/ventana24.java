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

public class ventana24 extends JFrame {

	// Definimos los dos paneles
	JPanel panelNorte = new JPanel();
	JPanel panelCentro = new JPanel();

	// Dentro del JPanel norte observamos que hay 3 filas
	JPanel panelNorteF1 = new JPanel();
	JPanel panelNorteF2 = new JPanel();
	JPanel panelNorteF3 = new JPanel();

	// Dentro del JPanel central hay 4 filas
	JPanel centroF1 = new JPanel();
	JPanel centroF2 = new JPanel();
	JPanel centroF3 = new JPanel();
	JPanel centroF4 = new JPanel();

	public ventana24() {
		super("Examen");

		// El frame principal tiene un border layout
		BorderLayout layoutPrincipal = new BorderLayout();
		this.setLayout(layoutPrincipal);
		this.setSize(670, 400);

		////////////////////////////////////////////////
		/////////////////// PANEL NORTE ////////////////
		////////////////////////////////////////////////

		GridLayout layoutPanelNorte = new GridLayout(3, 1);
		panelNorte.setLayout(layoutPanelNorte);

		// borde con título del panel norte
		panelNorte.setBorder(BorderFactory.createTitledBorder("Position/Direction"));

		// Cada fila contiene otro jpanel para albergar los elementos de cada fila

		// En la fila 1 tenemos
		SpringLayout layout = new SpringLayout();
		panelNorteF1.setLayout(layout);
		JLabel labelNF1 = new JLabel("Direction [*]");
		JTextField fieldNF1 = new JTextField(20);
		layout.putConstraint(SpringLayout.WEST, labelNF1, 40, SpringLayout.WEST, panelNorteF1);
		layout.putConstraint(SpringLayout.EAST, fieldNF1, 400, SpringLayout.WEST, labelNF1);

		panelNorteF1.add(labelNF1);
		panelNorteF1.add(fieldNF1);

		// En la fila 2 tenemos

		JLabel labelNF2 = new JLabel("Height [m]");
		JTextField fieldNF2 = new JTextField(20);

		panelNorteF2.setLayout(layout);
		layout.putConstraint(SpringLayout.WEST, labelNF2, 40, SpringLayout.WEST, panelNorteF2);
		layout.putConstraint(SpringLayout.EAST, fieldNF2, 400, SpringLayout.WEST, labelNF2);

		panelNorteF2.add(labelNF2);
		panelNorteF2.add(fieldNF2);

		// En la fila 3 tenemos
		JCheckBox checkNF3 = new JCheckBox();
		JLabel labelNF3 = new JLabel("Height is lower edge (not center)");

		panelNorteF3.add(checkNF3);
		panelNorteF3.add(labelNF3);

		// Añadimos las filas en el panel norte

		panelNorte.add(panelNorteF1);
		panelNorte.add(panelNorteF2);
		panelNorte.add(panelNorteF3);

		////////////////////////////////////////////////
		/////////////////// PANEL CENTRO ///////////////
		////////////////////////////////////////////////

		GridLayout layoutPanelCentro = new GridLayout(4, 1);
		panelCentro.setLayout(layoutPanelCentro);

		// borde con título del panel central
		panelCentro.setBorder(BorderFactory.createTitledBorder("System"));

		// Fila 1
		JLabel label1CF1 = new JLabel("Channels");
		JTextField field1CF1 = new JTextField(10);
		JLabel label2CF1 = new JLabel("Watts");
		JTextField field2CF1 = new JTextField(10);
		JButton buttonCF1 = new JButton("Adjust");

		centroF1.setLayout(layout);
		layout.putConstraint(SpringLayout.WEST, label1CF1, 40, SpringLayout.WEST, centroF1);
		layout.putConstraint(SpringLayout.WEST, field1CF1, 170, SpringLayout.WEST, label1CF1);
		layout.putConstraint(SpringLayout.EAST, label2CF1, 150, SpringLayout.WEST, field1CF1);
		layout.putConstraint(SpringLayout.EAST, field2CF1, 160, SpringLayout.WEST, label2CF1);
		layout.putConstraint(SpringLayout.EAST, buttonCF1, 200, SpringLayout.WEST, field2CF1);

		centroF1.add(label1CF1);
		centroF1.add(field1CF1);
		centroF1.add(label2CF1);
		centroF1.add(field2CF1);
		centroF1.add(buttonCF1);

		// fila 2
		JLabel labelCF2 = new JLabel("Antenna type");
		JComboBox<String> comboCF2 = new JComboBox<String>(new String[] { "Kathrein 742151" });
		centroF2.setLayout(layout);
		layout.putConstraint(SpringLayout.WEST, labelCF2, 40, SpringLayout.WEST, centroF2);
		layout.putConstraint(SpringLayout.WEST, comboCF2, 170, SpringLayout.WEST, label1CF1);

		centroF2.add(labelCF2);
		centroF2.add(comboCF2);

		// fila 3
		JLabel label1CF3 = new JLabel("ELectrical downtilt from [*]");
		JTextField field1CF3 = new JTextField(10);
		JLabel label2CF3 = new JLabel("To");
		JTextField field2CF3 = new JTextField(10);
		JButton buttonCF3 = new JButton("Adjust");

		centroF3.setLayout(layout);
		layout.putConstraint(SpringLayout.WEST, label1CF3, 40, SpringLayout.WEST, centroF3);
		layout.putConstraint(SpringLayout.WEST, field1CF3, 170, SpringLayout.WEST, label1CF3);
		layout.putConstraint(SpringLayout.EAST, label2CF3, 130, SpringLayout.WEST, field1CF3);
		layout.putConstraint(SpringLayout.EAST, field2CF3, 160, SpringLayout.WEST, label2CF3);
		layout.putConstraint(SpringLayout.EAST, buttonCF3, 200, SpringLayout.WEST, field2CF3);

		centroF3.add(label1CF3);
		centroF3.add(field1CF3);
		centroF3.add(label2CF3);
		centroF3.add(field2CF3);
		centroF3.add(buttonCF3);

		// fila 4
		JLabel labelCF4 = new JLabel("Polarization");
		JComboBox<String> comboCF4 = new JComboBox<String>(new String[] { "X + 45º" });

		centroF4.setLayout(layout);
		layout.putConstraint(SpringLayout.WEST, labelCF4, 40, SpringLayout.WEST, centroF4);
		layout.putConstraint(SpringLayout.WEST, comboCF4, 170, SpringLayout.WEST, labelCF4);

		centroF4.add(labelCF4);
		centroF4.add(comboCF4);

		// añadimos las filas al panel central
		panelCentro.add(centroF1);
		panelCentro.add(centroF2);
		panelCentro.add(centroF3);
		panelCentro.add(centroF4);

		// añadimos los paneles Norte y Centro al frame
		this.add(panelNorte, BorderLayout.NORTH);
		this.add(panelCentro, BorderLayout.CENTER);

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ventana24();
	}
}