package GraficaSwing;

/*
 *	Se voglio importarre una classe che si trova in un altro package dello stesso progetto 
 *  si deve usare import NomePackage.NomeClasse
 *  
 *  es: import GestioneDB.MyDbConnection;
 */


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtMail;
	
	//Vado a creare l'oggetto DB
	JavaDB DB = new JavaDB();
	private JPasswordField txtPwd;
	//MyDbConnection mDB = new MyDbConnection();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		setLocationRelativeTo(null); //Apre il Jframe al centro dello schermo
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMail = new JLabel("Email");
		lblMail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMail.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblMail.setBounds(30, 80, 105, 25);
		contentPane.add(lblMail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblPassword.setBounds(30, 133, 105, 25);
		contentPane.add(lblPassword);
		
		txtMail = new JTextField();
		txtMail.setBounds(169, 82, 466, 26);
		contentPane.add(txtMail);
		txtMail.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Benvenuto nell'area amministratore");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 26));
		lblNewLabel.setBounds(30, 6, 638, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblErrore = new JLabel("New label");
		lblErrore.setHorizontalAlignment(SwingConstants.CENTER);
		lblErrore.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblErrore.setBounds(74, 338, 561, 61);
		contentPane.add(lblErrore);
		lblErrore.setVisible(false);
		
		txtPwd = new JPasswordField();
		txtPwd.setBounds(169, 135, 466, 26);
		contentPane.add(txtPwd);
		
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblErrore.setVisible(true);
				//Tuttle le cose per fare il login
				if(DB.login(txtMail.getText(), txtPwd.getText()) < 0) {
					lblErrore.setText("Errore Login");
				}else {
					lblErrore.setText(""+DB.login(txtMail.getText(), txtPwd.getText()));
					GestionaleMainOld gm = new GestionaleMainOld(DB.login(txtMail.getText(), txtPwd.getText()));
					gm.setVisible(true);
					dispose();
				}
			}
		});
		btnLogin.setBounds(291, 229, 117, 29);
		contentPane.add(btnLogin);
		
		
	}
}
