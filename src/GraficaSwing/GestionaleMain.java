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
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class GestionaleMain extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	//Creo il menu Bar
	private JMenuBar menuBar = new JMenuBar();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionaleMain frame = new GestionaleMain(0);
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
		
		JLabel lblNewLabel = new JLabel("Home");
		lblNewLabel.setBounds(6, 6, 61, 16);
		home.add(lblNewLabel);
		
		JPanel utentiVisualizza = new JPanel();
		layeredPane.add(utentiVisualizza, "name_23664109098325");
		utentiVisualizza.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Utenti Visualizza");
		lblNewLabel_1.setBounds(6, 6, 224, 16);
		utentiVisualizza.add(lblNewLabel_1);
		
		
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
			}
		});
		utentiMenu.add(visualizzaUtenti);
		
		JMenuItem creaUtente = new JMenuItem("Nuovo");
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
	}
}
