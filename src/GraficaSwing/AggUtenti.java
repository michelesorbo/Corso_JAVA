package GraficaSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class AggUtenti extends JFrame {

	private JPanel contentPane;
	
	//Vado ad aggiungere i miei oggetti
	private JavaDB DB = new JavaDB();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AggUtenti frame = new AggUtenti();
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
	public AggUtenti() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID Uffici");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblNewLabel.setBounds(6, 252, 150, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblUffici = new JLabel("New label");
		lblUffici.setBounds(6, 293, 627, 16);
		lblUffici.setText(DB.idUffici());
		contentPane.add(lblUffici);
	}

}
