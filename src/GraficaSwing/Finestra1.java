package GraficaSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Finestra1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finestra1 frame = new Finestra1();
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
	public Finestra1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 31, 50));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Finestra 1");
		lblNewLabel.setBounds(173, 59, 140, 16);
		contentPane.add(lblNewLabel);
		
		JButton btn = new JButton("Vai a finestra 2");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finestra2 f2 = new Finestra2(); //Creo l'oggetto di Finestra 2
				f2.setVisible(true); //Rendo visibile la finestra 2
				dispose(); //Chido la visibilità della finestra in essere e deve essere l'ultima cosa che faccio
			}
		});
		btn.setBounds(134, 129, 147, 29);
		contentPane.add(btn);
	}

}
