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

public class Finestra2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finestra2 frame = new Finestra2();
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
	public Finestra2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(24, 255, 103));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Finestra 2");
		lblNewLabel.setBounds(185, 53, 122, 16);
		contentPane.add(lblNewLabel);
		
		JButton btn = new JButton("Finestra 1");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Finestra1 f1 = new Finestra1();
				f1.setVisible(true);
				dispose(); //Deve essere messo alla fine di tutto
			}
		});
		btn.setBounds(179, 139, 117, 29);
		contentPane.add(btn);
	}

}
