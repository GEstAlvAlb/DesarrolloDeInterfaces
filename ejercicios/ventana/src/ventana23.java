

import java.io.*;
import java.util.*;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ventana23 extends JFrame{

	public ventana23()
	{
		this.setTitle("Antenna");
		this.setSize(670,400);
		this.setLayout(new BorderLayout());
		
		
		
		String[] cadena={"Katterin 742151", "Simmonn 3000"};
		String[] cadena2={"X+45*", "Y-20*"};
		
		JPanel positionPanel = new JPanel();
		
		JLabel direccionLabel = new JLabel("Direction [*]: ");
		JTextField direccionText = new JTextField();
		
		JLabel heightLabel = new JLabel("Height [m]: ");
		JTextField heightText = new JTextField();
		
		JCheckBox caja = new JCheckBox("Height is Lower Edge (Not Center)");
		
		
		JPanel systemPanel = new JPanel(new GridLayout(4,1,5,5));
		
		JLabel channelsLabel = new JLabel("Channels: ");
		JTextField channelsText = new JTextField();
		
		JLabel wattsLabel = new JLabel("Watts: ");
		JTextField wattsText = new JTextField();
		
		JButton wattsBoton = new JButton("Adjust");
		
		JLabel antenaLabel = new JLabel("Antenna Type: ");
		JComboBox antenaCombo = new JComboBox(cadena);
		
		JLabel electricalLabel = new JLabel("Electrical Downtilt From [*]: ");
		JTextField electricalText = new JTextField();
		
		JLabel toLabel = new JLabel("To: ");
		JTextField toText = new JTextField();
		
		JButton toBoton = new JButton("Adjust");
		
		JLabel polaritzationLabel = new JLabel("Polarization: ");
		JComboBox PolaritzationCombo = new JComboBox(cadena2);
		
		/*
		JPanel panelDer = new JPanel();
		JPanel panelIzq = new JPanel();
		*/
		
		JPanel lane1Panel = new JPanel(new FlowLayout());
		JPanel lane2Panel = new JPanel(new FlowLayout());
		JPanel lane3Panel = new JPanel(new FlowLayout());
		JPanel lane4Panel = new JPanel(new FlowLayout());
		
		
		
		
		this.add(positionPanel,BorderLayout.NORTH);
		positionPanel.setBorder(BorderFactory.createTitledBorder("Position/Direction"));
		
		positionPanel.setPreferredSize(new Dimension(0,120));
		
		positionPanel.add(direccionLabel);
		
		
		
		
		
		direccionLabel.setPreferredSize(new Dimension(75,25));
		direccionLabel.setHorizontalAlignment(JLabel.RIGHT);
		positionPanel.add(direccionText);
		direccionText.setPreferredSize(new Dimension(525,25));
		
		
		
		positionPanel.add(heightLabel);
		heightLabel.setPreferredSize(new Dimension(75,25));
		heightLabel.setHorizontalAlignment(JLabel.RIGHT);
		positionPanel.add(heightText);
		heightText.setPreferredSize(new Dimension(525,25));
		
		
		
		
		positionPanel.add(caja);
		caja.setHorizontalAlignment(SwingConstants.LEFT);
		
		
		
		this.add(systemPanel,BorderLayout.CENTER);
		systemPanel.setBorder(BorderFactory.createTitledBorder("System"));
		
		lane1Panel.add(channelsLabel);
		
		
		
		
		channelsLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		channelsLabel.setPreferredSize(new Dimension(160,25));
		lane1Panel.add(channelsText);
		channelsText.setPreferredSize(new Dimension(160,25));
		
		lane1Panel.add(wattsLabel);
		wattsLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		wattsLabel.setPreferredSize(new Dimension(40,25));
		lane1Panel.add(wattsText);
		wattsText.setPreferredSize(new Dimension(160,25));
		
		lane1Panel.add(wattsBoton);
		wattsBoton.setPreferredSize(new Dimension(80,25));
		
		systemPanel.add(lane1Panel);
		
		lane2Panel.add(antenaLabel);
		antenaLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		antenaLabel.setPreferredSize(new Dimension(160,25));
		lane2Panel.add(antenaCombo);
		antenaCombo.setPreferredSize(new Dimension(435,25));
		
		systemPanel.add(lane2Panel);
		
		lane3Panel.add(electricalLabel);
		electricalLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		electricalLabel.setPreferredSize(new Dimension(160,25));
		lane3Panel.add(electricalText);
		electricalText.setPreferredSize(new Dimension(160,25));
		
		lane3Panel.add(toLabel);
		toLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		toLabel.setPreferredSize(new Dimension(40,25));
		lane3Panel.add(toText);
		toText.setPreferredSize(new Dimension(160,25));

		lane3Panel.add(toBoton);
		toBoton.setPreferredSize(new Dimension(80,25));
		
		systemPanel.add(lane3Panel);
		
		lane4Panel.add(polaritzationLabel);
		polaritzationLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		polaritzationLabel.setPreferredSize(new Dimension(160,25));
		
		
		lane4Panel.add(PolaritzationCombo);
		PolaritzationCombo.setPreferredSize(new Dimension(435,25));
		systemPanel.add(lane4Panel);
		
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
	}
	
	public static void main(String[] main)
	{
		new ventana23();
	}
}
