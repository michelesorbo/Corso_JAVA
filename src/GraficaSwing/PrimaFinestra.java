package GraficaSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrimaFinestra extends JFrame {

	private JPanel contentPane;
	private JTextField inpNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimaFinestra frame = new PrimaFinestra();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PrimaFinestra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Scrivi dei numeri divisi da virgola e ti farò la somma");
		lblNewLabel.setBounds(60, 19, 343, 16);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(220, 13, 10, 10);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setBounds(6, 47, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		inpNome = new JTextField();
		inpNome.setBounds(60, 42, 130, 26);
		contentPane.add(inpNome);
		inpNome.setColumns(10);
		
		JLabel ris = new JLabel("New label");
		ris.setBounds(70, 116, 270, 16);
		contentPane.add(ris);
		
		JButton btnNewButton = new JButton("Invia Dati");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Stamapre a video il contenuto della casella input
				//System.out.println(inpNome.getText());
				String[] num = inpNome.getText().split(",");
				int somma = 0;
				for(String el:num) {
					somma += Integer.parseInt(el);
				}
				ris.setText("La somma è: " + somma);
				
			}
		});
		btnNewButton.setBounds(154, 144, 117, 29);
		contentPane.add(btnNewButton);
		
		
	}
}
