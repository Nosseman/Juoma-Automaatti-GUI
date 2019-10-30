import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class TeeTarjoilu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblTee;
	private JLabel lblKuva;
	private JLabel lblOleHyva;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeeTarjoilu frame = new TeeTarjoilu();
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
	public TeeTarjoilu() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setSize(200, 200);
		setLocationRelativeTo(null);
		
		lblTee = new JLabel("T\u00E4ss\u00E4 teesi:");
		lblTee.setHorizontalAlignment(SwingConstants.CENTER);
		lblTee.setFont(new Font("Ravie", Font.PLAIN, 13));
		contentPane.add(lblTee, BorderLayout.NORTH);
		
		lblKuva = new JLabel("");
		lblKuva.setHorizontalAlignment(SwingConstants.CENTER);
		Image tea = new ImageIcon(this.getClass().getResource("tee.png")).getImage();
		lblKuva.setIcon(new ImageIcon(tea));
		contentPane.add(lblKuva, BorderLayout.CENTER);
		
		lblOleHyva = new JLabel("Ole hyv\u00E4!");
		lblOleHyva.setHorizontalAlignment(SwingConstants.CENTER);
		lblOleHyva.setFont(new Font("Ravie", Font.PLAIN, 13));
		contentPane.add(lblOleHyva, BorderLayout.SOUTH);
	}
	
	//luodaan olio juoman tarjoilulle jossa
	// tarjoillaan juoma tai ilmoitetaan sen loppuneen
	public void tarjoaTee(automaatti ja, TeeTarjoilu tt) {
		if (ja.getTee() < 10) {
			JOptionPane.showMessageDialog(null, "Raaka-aine loppu. Täytä säiliö!", "Virhe!", JOptionPane.ERROR_MESSAGE);
		} else {
			tt.setVisible(true);
	}}


}
