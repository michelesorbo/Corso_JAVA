package GraficaSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Nicola extends JFrame {
	
	JavaDB DB = new JavaDB();

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tNome;
	private JLabel lCognome;
	private JTextField tCognome;
	private JTextField tID;
	private JLabel lblInserisciIdDa;
	private JLabel lblResidenza;
	private JTextField tResidenza;
	private JLabel lblEt;
	private JTextField tEta;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nicola frame = new Nicola();
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
	public Nicola() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lNome = new JLabel("Nome");
		lNome.setBounds(6, 28, 61, 16);
		contentPane.add(lNome);
		
		tNome = new JTextField();
		tNome.setBounds(89, 23, 130, 26);
		contentPane.add(tNome);
		tNome.setColumns(10);
		
		lCognome = new JLabel("Cognome");
		lCognome.setBounds(6, 69, 61, 16);
		contentPane.add(lCognome);
		
		tCognome = new JTextField();
		tCognome.setColumns(10);
		tCognome.setBounds(89, 64, 130, 26);
		contentPane.add(tCognome);
		
		tID = new JTextField();
		tID.setColumns(10);
		tID.setBounds(290, 23, 130, 26);
		contentPane.add(tID);
		
		lblInserisciIdDa = new JLabel("Inserisci ID da cercare");
		lblInserisciIdDa.setBounds(276, 6, 144, 16);
		contentPane.add(lblInserisciIdDa);
		
		lblResidenza = new JLabel("Residenza");
		lblResidenza.setBounds(6, 105, 81, 16);
		contentPane.add(lblResidenza);
		
		tResidenza = new JTextField();
		tResidenza.setColumns(10);
		tResidenza.setBounds(89, 100, 130, 26);
		contentPane.add(tResidenza);
		
		lblEt = new JLabel("Età");
		lblEt.setBounds(6, 143, 70, 16);
		contentPane.add(lblEt);
		
		tEta = new JTextField();
		tEta.setColumns(10);
		tEta.setBounds(89, 138, 130, 26);
		contentPane.add(tEta);
		
		
		//Scrivo i codici dei button dopo le caselle di testo altrimenti non vengono viste
		JButton btnNewButton = new JButton("Cerca");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Posso scrivere il codice che verrà eseguito al clik del pulsante
				//System.out.println("Ciao da Nicola");
				//lRis.setText("Ciao da Nicola");
				ResultSet rs = DB.listaUtenti(tID.getText());
				
				try {
					while(rs.next()) {
						tNome.setText(rs.getString("nome"));
						tCognome.setText(rs.getString("cognome"));
						tResidenza.setText(rs.getString("residenza"));
						tEta.setText(rs.getString("eta"));
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(300, 64, 117, 29);
		contentPane.add(btnNewButton);
		
		//Pulsante Modifica
		
		btnNewButton_1 = new JButton("Modifica");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DB.modUtente(tNome.getText(), tCognome.getText(), tResidenza.getText(), tEta.getText(), tID.getText());
			}
		});
		btnNewButton_1.setBounds(53, 176, 117, 29);
		contentPane.add(btnNewButton_1);
		
		//Fine modifica
	}
}
