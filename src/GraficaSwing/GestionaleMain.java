package GraficaSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GestionaleMain extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ResultSet rs;
	
	private JavaDB DB = new JavaDB();
	
	//Creo il menu Bar
	private JMenuBar menuBar = new JMenuBar();
	private JTextField tNome;
	private JTextField tCognome;
	private JTextField tResidenza;
	private JTextField tEta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionaleMain frame = new GestionaleMain(1);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//Metodo per cambiare Panel
	private void swPanel(JLayeredPane layeredPane, JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}

	/**
	 * Create the frame.
	 */
	public GestionaleMain(int UserID) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		setTitle("Dashboard Gestionale");
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(6, 45, 788, 521);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel home = new JPanel();
		layeredPane.add(home, "name_23631208626237");
		home.setLayout(null);
		
		JLabel lblHome = new JLabel("Home");
		lblHome.setBounds(6, 6, 776, 16);
		home.add(lblHome);
		//Inizializzo il messaggio di Benvenuto
		lblHome.setText("Benvenuto " + DB.UtenteDet(UserID));
		
		JPanel utentiVisualizza = new JPanel();
		layeredPane.add(utentiVisualizza, "name_23664109098325");
		utentiVisualizza.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Utenti Visualizza");
		lblNewLabel_1.setBounds(6, 6, 224, 16);
		utentiVisualizza.add(lblNewLabel_1);
		
		JTextArea txtArea = new JTextArea();
		txtArea.setEditable(false);
		txtArea.setBounds(6, 31, 776, 467);
		utentiVisualizza.add(txtArea);
		
		JPanel utenteNuovo = new JPanel();
		layeredPane.add(utenteNuovo, "name_6091015504422");
		utenteNuovo.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(6, 30, 104, 16);
		utenteNuovo.add(lblNewLabel);
		
		JLabel lblCognome = new JLabel("Cognome");
		lblCognome.setBounds(6, 106, 104, 16);
		utenteNuovo.add(lblCognome);
		
		JLabel lblResidenza = new JLabel("Residenza");
		lblResidenza.setBounds(6, 175, 104, 16);
		utenteNuovo.add(lblResidenza);
		
		JLabel lblEt = new JLabel("Età");
		lblEt.setBounds(6, 225, 104, 16);
		utenteNuovo.add(lblEt);
		
		tNome = new JTextField();
		tNome.setBounds(86, 25, 497, 26);
		utenteNuovo.add(tNome);
		tNome.setColumns(10);
		
		tCognome = new JTextField();
		tCognome.setColumns(10);
		tCognome.setBounds(86, 101, 497, 26);
		utenteNuovo.add(tCognome);
		
		tResidenza = new JTextField();
		tResidenza.setColumns(10);
		tResidenza.setBounds(86, 170, 497, 26);
		utenteNuovo.add(tResidenza);
		
		tEta = new JTextField();
		tEta.setColumns(10);
		tEta.setBounds(86, 220, 497, 26);
		utenteNuovo.add(tEta);
		
		JLabel insInfo = new JLabel("New label");
		insInfo.setHorizontalAlignment(SwingConstants.CENTER);
		insInfo.setBounds(6, 291, 776, 44);
		utenteNuovo.add(insInfo);
		insInfo.setVisible(false);
		
		
		//Gestisco la barra dei menu
		setJMenuBar(menuBar);
		
		JMenu fileMenu = new JMenu("File"); 
		JMenu utentiMenu = new JMenu("Utenti");
		
		//Dopo aver create le voci di menu devo aggiungerle alla MenuBar
		menuBar.add(fileMenu);
		
		JMenuItem chiudi = new JMenuItem("Chiudi");
		fileMenu.add(chiudi);
		menuBar.add(utentiMenu);
		
		JMenuItem visualizzaUtenti = new JMenuItem("Visualizza");
		visualizzaUtenti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				swPanel(layeredPane, utentiVisualizza);
				txtArea.setText(DB.listaUtenti());
			
			}
		});
		utentiMenu.add(visualizzaUtenti);
		
		JMenuItem creaUtente = new JMenuItem("Nuovo");
		creaUtente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				swPanel(layeredPane, utenteNuovo);
			}
		});
		utentiMenu.add(creaUtente);
		
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				swPanel(layeredPane, home);
			}
		});
		btnNewButton.setBounds(6, 6, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Utenti");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				swPanel(layeredPane, utentiVisualizza);
			}
		});
		btnNewButton_1.setBounds(135, 6, 117, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Inserisci");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DB.insUtenti(tNome.getText(), tCognome.getText(), tResidenza.getText(), tEta.getText(), "1");
				insInfo.setVisible(true);
				insInfo.setText("Utente Inserico Correttamente");
				tNome.setText("");
				tCognome.setText("");
				tEta.setText("");
				tResidenza.setText("");
			}
		});
		btnNewButton_2.setBounds(269, 347, 117, 29);
		utenteNuovo.add(btnNewButton_2);
	}
}
