import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.GridLayout;


public class Ohje extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea txtrValitseHaluamasiJuoma;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ohje frame = new Ohje();
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
	public Ohje() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(300, 200);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		txtrValitseHaluamasiJuoma = new JTextArea();
		txtrValitseHaluamasiJuoma.setLineWrap(true);
		txtrValitseHaluamasiJuoma.setText("Valitse haluamasi juoma nappia painamalla. Napin alapuolella n\u00E4et j\u00E4ljell\u00E4 olevien raaka-aineiden m\u00E4\u00E4r\u00E4n. Jos raaka-aine on loppunut tulee sit\u00E4 lis\u00E4t\u00E4 s\u00E4ili\u00F6\u00F6n. Raaka-aineiden lis\u00E4\u00E4minen tapahtuu Yll\u00E4pito-valikon kautta. Yll\u00E4pito-valikosta voit my\u00F6s tallentaa automaatin tilan tai ladata aikaisemmin tallennetun automaatin. Rattoisia nautiskeluhetki\u00E4!");
		txtrValitseHaluamasiJuoma.setFont(new Font("Ravie", Font.PLAIN, 11));
		contentPane.add(txtrValitseHaluamasiJuoma);
	}

}
