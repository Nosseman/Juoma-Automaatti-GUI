import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;


public class Versiotiedot extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblVersioNro;
	private JLabel lblTekija;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Versiotiedot frame = new Versiotiedot();
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
	public Versiotiedot() {
		//vaihdetaan sulkemistapahtuma ettei koko ohjelma sulkeudu
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1));
		setSize(300, 150);
		setLocationRelativeTo(null);
		
		lblVersioNro = new JLabel("Juoma-Automaatti v.1.1");
		lblVersioNro.setFont(new Font("Ravie", Font.PLAIN, 14));
		contentPane.add(lblVersioNro);
		
		lblTekija = new JLabel("Tekij\u00E4: Juuso Nousiainen");
		lblTekija.setFont(new Font("Ravie", Font.PLAIN, 14));
		contentPane.add(lblTekija);
	}

}
