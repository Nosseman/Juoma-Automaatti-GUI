import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;

public class KahviTarjoilu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblKahvi;
	private JLabel lblKuva;
	private JLabel lblOleHyva;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KahviTarjoilu frame = new KahviTarjoilu();
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
	public KahviTarjoilu() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setSize(200, 200);
		setLocationRelativeTo(null);
		
		lblKahvi = new JLabel("T\u00E4ss\u00E4 kahvisi:");
		lblKahvi.setHorizontalAlignment(SwingConstants.CENTER);
		lblKahvi.setFont(new Font("Ravie", Font.PLAIN, 13));
		contentPane.add(lblKahvi, BorderLayout.NORTH);
		
		lblKuva = new JLabel("");
		lblKuva.setHorizontalAlignment(SwingConstants.CENTER);
		Image coffee = new ImageIcon(this.getClass().getResource("kahvi.png")).getImage();
		lblKuva.setIcon(new ImageIcon(coffee));
		contentPane.add(lblKuva, BorderLayout.CENTER);
		
		lblOleHyva = new JLabel("Ole hyv\u00E4!");
		lblOleHyva.setHorizontalAlignment(SwingConstants.CENTER);
		lblOleHyva.setFont(new Font("Ravie", Font.PLAIN, 13));
		contentPane.add(lblOleHyva, BorderLayout.SOUTH);
	}
	
	//luodaan olio juoman tarjoilulle jossa
	// tarjoillaan juoma tai ilmoitetaan sen loppuneen
	public void tarjoaKahvi(automaatti ja, KahviTarjoilu kt) {
		if (ja.getKahvi() < 10) {
			JOptionPane.showMessageDialog(null, "Raaka-aine loppu. Täytä säiliö!", "Virhe!", JOptionPane.ERROR_MESSAGE);
		} else {
			kt.setVisible(true);
	}}

}
