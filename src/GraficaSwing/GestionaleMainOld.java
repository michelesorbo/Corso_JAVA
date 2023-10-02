package GraficaSwing;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;

public class GestionaleMainOld extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionaleMainOld frame = new GestionaleMainOld(1); //Metto come default 0 che è un id inesistente
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
	public GestionaleMainOld(int UserID) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Mi trovo le dimensioni dello schermo dove l'applicazione parte
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int height = screenSize.height; //Salvo l'altezza dello schermo
		int width = screenSize.width;
		setBounds(0, 0, 800, 650);
		setLocationRelativeTo(null);
		
		
		
	}
}
