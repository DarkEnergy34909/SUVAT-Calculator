package source;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class App extends JFrame implements ActionListener, KeyListener {
	private static final long serialVersionUID = 1L;
	private final double NaN = Double.NaN;
	
	private JLabel title, description, sLabel, uLabel, vLabel, aLabel, tLabel;
	private JTextField sText, uText, vText, aText, tText;
	private JButton calculate;
	private JPanel panel, sPanel, uPanel, vPanel, aPanel, tPanel;
	private int sFlag, uFlag, vFlag, aFlag, tFlag;
	private Suvat suvat;
	
	
	
	public App() {
		
		title = new JLabel("SUVAT Calculator", JLabel.CENTER);
		title.setFont(new Font("Computer Modern Roman", Font.PLAIN, 30));
		this.add(title, BorderLayout.NORTH);
		
		description = new JLabel("<html>If the calculator returns NaN or infinity anywhere, the values entered are not physically possible.</html>");
		description.setFont(new Font("Computer Modern Roman", Font.PLAIN, 20));
		//this.add(description, FlowLayout.CENTER);
		
		sLabel = new JLabel("Displacement (m):"       );
		sLabel.setFont(new Font("Computer Modern Roman", Font.PLAIN, 15));
		
		sText = new JTextField(16);
		sText.addKeyListener(this);
		sText.addActionListener(this);
		//sText.setForeground(Color.LIGHT_GRAY);
		//sText.setText("Enter displacement (m)");
		
		sPanel = new JPanel();
		sPanel.add(sLabel);
		sPanel.add(sText);
		
		
		uLabel = new JLabel("Initial velocity (m/s):");
		uLabel.setFont(new Font("Computer Modern Roman", Font.PLAIN, 15));
		
		uText = new JTextField(16);
		uText.addKeyListener(this);
		uText.addActionListener(this);
		//uText.setForeground(Color.LIGHT_GRAY);
		//uText.setText("Enter initial velocity (m/s)");
		
		uPanel = new JPanel();
		uPanel.add(uLabel);
		uPanel.add(uText);
		
		
		vLabel = new JLabel("Final velocity (m/s):");
		vLabel.setFont(new Font("Computer Modern Roman", Font.PLAIN, 15));
		
		vText = new JTextField(16);
		vText.addKeyListener(this);
		vText.addActionListener(this);
		//vText.setForeground(Color.LIGHT_GRAY);
		//vText.setText("Enter final velocity (m/s)");
		
		vPanel = new JPanel();
		vPanel.add(vLabel);
		vPanel.add(vText);
		
		
		aLabel = new JLabel("Acceleration (m/s^2):");
		aLabel.setFont(new Font("Computer Modern Roman", Font.PLAIN, 15));
		
		aText = new JTextField(16);
		aText.addKeyListener(this);
		aText.addActionListener(this);
		//aText.setForeground(Color.LIGHT_GRAY);
		//aText.setText("Enter acceleration (m/s^2)");
		
		aPanel = new JPanel();
		aPanel.add(aLabel);
		aPanel.add(aText);
		
		
		tLabel = new JLabel("Time (s):            ");
		tLabel.setFont(new Font("Computer Modern Roman", Font.PLAIN, 15));
		
		tText = new JTextField(16);
		tText.addKeyListener(this);
		tText.addActionListener(this);
		//tText.setForeground(Color.LIGHT_GRAY);
		//tText.setText("Enter time (s)");
		
		tPanel = new JPanel();
		tPanel.add(tLabel);
		tPanel.add(tText);
		
		
		panel = new JPanel(new GridLayout(6, 1));
		//panel.add(title);
		panel.add(description);
		panel.add(sPanel);
		panel.add(uPanel);
		panel.add(vPanel);
		panel.add(aPanel);
		panel.add(tPanel);
		this.add(panel);
		
		this.setVisible(true);
		this.setSize(500, 500);
		this.setTitle("SUVAT Calculator");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		sFlag = 0;
		uFlag = 0;
		vFlag = 0;
		aFlag = 0;
		tFlag = 0;
		
		suvat = new Suvat(NaN, NaN, NaN, NaN, NaN);
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getSource().equals(sText)) {
			if (sText.getText().isEmpty()) {
				sFlag = 0;
				suvat.setS(NaN);
			}
			else {
				try {
				suvat.setS(Double.parseDouble(sText.getText()));
				sFlag = 1;
				}
				catch(NumberFormatException ex) {
					sFlag = 0;
					System.out.print("Poop");
				}
			}
		}
		
		if (e.getSource().equals(uText)) {
			if (uText.getText().isEmpty()) {
				uFlag = 0;
				suvat.setU(NaN);
			}
			else {
				try {
				suvat.setU(Double.parseDouble(uText.getText()));
				uFlag = 1;
				}
				catch(NumberFormatException ex) {
					uFlag = 0;
					System.out.print("Poop");
				}
			}
		}
		
		if (e.getSource().equals(vText)) {
			if (vText.getText().isEmpty()) {
				vFlag = 0;
				suvat.setV(NaN);
			}
			else {
				try {
				vFlag = 1;
				suvat.setV(Double.parseDouble(vText.getText()));
				}
				catch(NumberFormatException ex) {
					vFlag = 0;
					System.out.print("Poop");
				}
			}
		}
		
		if (e.getSource().equals(aText)) {	
			if (aText.getText().isEmpty()) {
				aFlag = 0;
				suvat.setA(NaN);
			}
			else {
				try {
				aFlag = 1;
				suvat.setA(Double.parseDouble(aText.getText()));
				}
				catch(NumberFormatException ex) {
					aFlag = 0;
					System.out.print("Poop");
				}
			}
		}
		
		if (e.getSource().equals(tText)) {	
			if (tText.getText().isEmpty()) {
				tFlag = 0;
				suvat.setT(NaN);
			}
			else {
				try {
				tFlag = 1;
				suvat.setT(Double.parseDouble(tText.getText()));
				}
				catch(NumberFormatException ex) {
					tFlag = 0;
					System.out.print("Poop");
				}
			}
		}
		
		if (sFlag + uFlag + vFlag + aFlag + tFlag == 3) {
			if (sFlag == 0) {
				suvat.calculateS();
				sText.setText("" + suvat.getS());
				sText.setEditable(false);
			}
			if (uFlag == 0) {
				suvat.calculateU();
				uText.setText("" + suvat.getU());
				uText.setEditable(false);
			}
			if (vFlag == 0) {
				suvat.calculateV();
				vText.setText("" + suvat.getV());
				vText.setEditable(false);
			}
			if (aFlag == 0) {
				suvat.calculateA();
				aText.setText("" + suvat.getA());
				aText.setEditable(false);
			}
			if (tFlag == 0) {
				suvat.calculateT();
				tText.setText("" + suvat.getT());
				tText.setEditable(false);
			}
			
		}
		else {
			if (!sText.isEditable()) {
				sText.setEditable(true);
				sText.setText("");
				suvat.setS(NaN);
			}
			if (!uText.isEditable()) {
				uText.setEditable(true);
				uText.setText("");
				suvat.setU(NaN);
			}
			if (!vText.isEditable()) {
				vText.setEditable(true);
				vText.setText("");
				suvat.setV(NaN);
			}
			if (!aText.isEditable()) {
				aText.setEditable(true);
				aText.setText("");
				suvat.setA(NaN);
			}
			if (!tText.isEditable()) {
				tText.setEditable(true);
				tText.setText("");
				suvat.setT(NaN);
			}
		}
		suvat.displayValues();
		
	}
}
