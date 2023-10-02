package GraficaSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MultiWindowPanel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/*
	 * Vado a creare un Frame con vari JPanel che si aprono cliccando dei pulsanti.
	 * Procedimento:
	 * 1) Attivare un absoluteLayout al frame 
	 * 2) Disegnare un area per il JLayeredPain
	 * 3) Applicare al LayeredPain un layout a card -> CardLayout
	 * 4) Aggiungere tutti i pain che servono al CardLayout e rinominarli
	 * 
	 * Ricorda che ogno Pane nel Cardayout può essere gestito come si vuole
	 */
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MultiWindowPanel frame = new MultiWindowPanel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/*
	 * Creo la funzione per cambiare Panel nel CardLayout
	 */
	
	public void switchPanels(JLayeredPane layeredPane, JPanel panel) {
		layeredPane.removeAll(); //Rimuovi tutti i panel visibili
		layeredPane.add(panel); //Aggiungi alla visibilità il panel inviato
		layeredPane.repaint(); //Ridisegna il layout
		layeredPane.revalidate(); //Valida il layout
	}
	

	/**
	 * Create the frame.
	 */
	public MultiWindowPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(6, 86, 788, 480);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel home = new JPanel();
		layeredPane.add(home, "name_21380125037497");
		home.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Home");
		lblNewLabel.setBounds(328, 48, 61, 16);
		home.add(lblNewLabel);
		
		JPanel utenti = new JPanel();
		layeredPane.add(utenti, "name_21435436327523");
		utenti.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Utenti");
		lblNewLabel_1.setBounds(353, 66, 61, 16);
		utenti.add(lblNewLabel_1);
		
		JPanel admin = new JPanel();
		layeredPane.add(admin, "name_21472833372042");
		admin.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Admin");
		lblNewLabel_2.setBounds(364, 168, 61, 16);
		admin.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(layeredPane, home);
			}
		});
		btnNewButton.setBounds(6, 32, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Utenti");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(layeredPane, utenti);
			}
		});
		btnNewButton_1.setBounds(135, 32, 117, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Admin");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(layeredPane, admin);
			}
		});
		btnNewButton_2.setBounds(268, 32, 117, 29);
		contentPane.add(btnNewButton_2);
	}

}
