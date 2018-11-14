import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ventana16 extends JFrame {

	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();

	JLabel saldoIN = new JLabel("Saldo inicial: ");
	JLabel saldoINV = new JLabel("0.00");
	JLabel Ingresar = new JLabel("Ingresar");
	JLabel Retirar = new JLabel("Retirar Efectivo");
	JLabel SaldoAC = new JLabel("Saldo Actual: ");
	JLabel SaldoACV = new JLabel("0.00");

	JTextField ingr = new JTextField(10);
	JTextField ret = new JTextField(10);

	JButton bingr = new JButton("ingresar");
	JButton bret = new JButton("Retirar");

	public ventana16() {

		setLayout(new GridLayout(4, 1));

		panel1.add(saldoIN);
		panel1.add(saldoINV);

		panel2.add(Ingresar);
		panel2.add(ingr);
		panel2.add(bingr);

		panel3.add(Retirar);
		panel3.add(ret);
		panel3.add(bret);

		panel4.add(SaldoAC);
		panel4.add(SaldoACV);

		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);

		this.pack();// EL FRAME TOMA EL ESPACIO NECESARIO PARA DIBUJAR LOS COMPONENTES Y SE MUESTREN
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ventana16();
	}

}
/*
 * 
 * //Componentes necesarios para la interfaz JLabel saldoInicial,
 * saldoActualLabel, ingresoLabel, retiradaLabel, nuevoSaldoLabel,
 * nuevoSaldoLabel2; JTextField ingresoField, retiradaField; JButton ingresoBtn,
 * retiradaBtn; JPanel panelPrincipal, panelValoresIniciales, panelIngreso,
 * panelSacarDinero, nuevoSaldo;
 * 
 * //Constructor public App(){ super("Mi banco");
 * 
 * //El frame se divide en 4 filas y una sola columna setLayout(new
 * GridLayout(4,1));
 * 
 * panelValoresIniciales = new JPanel(); saldoInicial = new
 * JLabel("Saldo inicial: "); saldoActualLabel = new JLabel("0.00");
 * panelValoresIniciales.add(saldoInicial);
 * panelValoresIniciales.add(saldoActualLabel);
 * 
 * //CADA PANEL ES UNA "FILA" DEL GRID LAYOUT panelIngreso = new JPanel();
 * ingresoLabel = new JLabel("Ingresar"); ingresoField = new JTextField(10);//el
 * 10 simboliza el ancho del textField ingresoBtn = new JButton("Ingresar");
 * panelIngreso.add(ingresoLabel); panelIngreso.add(ingresoField);
 * panelIngreso.add(ingresoBtn);
 * 
 * panelIngreso = new JPanel(); ingresoLabel = new JLabel("Ingresar");
 * ingresoField = new JTextField(10); ingresoBtn = new JButton("Ingresar");
 * panelIngreso.add(ingresoLabel); panelIngreso.add(ingresoField);
 * panelIngreso.add(ingresoBtn);
 * 
 * panelSacarDinero = new JPanel(); retiradaLabel = new
 * JLabel("Retirar efectivo"); retiradaField = new JTextField(10); retiradaBtn =
 * new JButton("Retirar"); panelSacarDinero.add(retiradaLabel);
 * panelSacarDinero.add(retiradaField); panelSacarDinero.add(retiradaBtn);
 * 
 * nuevoSaldo = new JPanel(); nuevoSaldoLabel = new JLabel("Saldo actual: ");
 * nuevoSaldoLabel2 = new JLabel("0.00"); nuevoSaldo.add(nuevoSaldoLabel);
 * nuevoSaldo.add(nuevoSaldoLabel2);
 * 
 * //AÑADIMOS AL JFRAME LOS PANELES add(panelValoresIniciales);
 * add(panelIngreso); add(panelSacarDinero); add(nuevoSaldo);
 * 
 * this.pack();//EL FRAME TOMA EL ESPACIO NECESARIO PARA DIBUJAR LOS COMPONENTES
 * Y SE MUESTREN setLocationRelativeTo(null);
 * setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); setVisible(true); }
 * 
 * 
 * public static void main(String[] args) { new App(); }
 */
