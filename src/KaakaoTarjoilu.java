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

public class KaakaoTarjoilu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblKaakao;
	private JLabel lblKuva;
	private JLabel lblOleHyva;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KaakaoTarjoilu frame = new KaakaoTarjoilu();
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
	public KaakaoTarjoilu() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setSize(200, 200);
		setLocationRelativeTo(null);
		
		lblKaakao = new JLabel("T\u00E4ss\u00E4 kaakaosi:");
		lblKaakao.setHorizontalAlignment(SwingConstants.CENTER);
		lblKaakao.setFont(new Font("Ravie", Font.PLAIN, 13));
		contentPane.add(lblKaakao, BorderLayout.NORTH);
		
		lblKuva = new JLabel("");
		lblKuva.setHorizontalAlignment(SwingConstants.CENTER);
		Image choco = new ImageIcon(this.getClass().getResource("kaakao.png")).getImage();
		lblKuva.setIcon(new ImageIcon(choco));
		contentPane.add(lblKuva, BorderLayout.CENTER);
		
		lblOleHyva = new JLabel("Ole hyv\u00E4!");
		lblOleHyva.setHorizontalAlignment(SwingConstants.CENTER);
		lblOleHyva.setFont(new Font("Ravie", Font.PLAIN, 13));
		contentPane.add(lblOleHyva, BorderLayout.SOUTH);
	}
	//luodaan olio juoman tarjoilulle jossa
	// tarjoillaan juoma tai ilmoitetaan sen loppuneen
	public void tarjoaKaakao(automaatti ja, KaakaoTarjoilu ct) {
		if (ja.getKaakao() < 10) {
			JOptionPane.showMessageDialog(null, "Raaka-aine loppu. Täytä säiliö!", "Virhe!", JOptionPane.ERROR_MESSAGE);
		} else {
			ct.setVisible(true);
	}}
}
