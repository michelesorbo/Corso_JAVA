package GraficaSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AggUtenti extends JFrame {

	private JPanel contentPane;
	
	//Vado ad aggiungere i miei oggetti
	private JavaDB DB = new JavaDB();
	private JTextField tfNome;
	private JTextField tfCognome;
	private JTextField tfEta;
	private JTextField tfResidenza;
	private JTextField tfTdUfficio;

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
		
		JLabel lblNewLabel_1 = new JLabel("Nome: ");
		lblNewLabel_1.setBounds(23, 50, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cognome");
		lblNewLabel_2.setBounds(23, 92, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Età");
		lblNewLabel_3.setBounds(23, 140, 61, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Residenza");
		lblNewLabel_4.setBounds(23, 185, 82, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("ID Ufficio");
		lblNewLabel_5.setBounds(23, 224, 82, 16);
		contentPane.add(lblNewLabel_5);
		
		tfNome = new JTextField();
		tfNome.setBounds(80, 45, 130, 26);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfCognome = new JTextField();
		tfCognome.setBounds(96, 87, 130, 26);
		contentPane.add(tfCognome);
		tfCognome.setColumns(10);
		
		tfEta = new JTextField();
		tfEta.setBounds(80, 135, 130, 26);
		contentPane.add(tfEta);
		tfEta.setColumns(10);
		
		tfResidenza = new JTextField();
		tfResidenza.setBounds(106, 180, 130, 26);
		contentPane.add(tfResidenza);
		tfResidenza.setColumns(10);
		
		tfTdUfficio = new JTextField();
		tfTdUfficio.setBounds(96, 213, 130, 26);
		contentPane.add(tfTdUfficio);
		tfTdUfficio.setColumns(10);
		
		JButton btnNewButton = new JButton("Inserisci");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DB.insUtenti(tfNome.getText(), tfCognome.getText(), tfResidenza.getText(), tfEta.getText(), tfTdUfficio.getText());
				//Dopo aver inmserito l'utente resetto le caselle di input
				tfNome.setText("");
			}
		});
		btnNewButton.setBounds(246, 368, 117, 29);
		contentPane.add(btnNewButton);
	}
}
