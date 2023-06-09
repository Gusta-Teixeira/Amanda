package visao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

public class TelaInicial extends JFrame {

	private JPanel contentPane;
	private JTextField textLogin;
	private JTextField textSenha;
	private JLabel lblLogoPinkmanKart;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
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
	public TelaInicial() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1056, 705);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(218, 73, 73));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][53px][221px][grow]", "[grow][24px][24px][23px,grow]"));
		
		Icon logoPinkmanKart = new ImageIcon("imgs/PinkmanKartLogo.png");
		JLabel lblLogoPinkmanKart = new JLabel("");
		lblLogoPinkmanKart.setIcon(logoPinkmanKart);
		contentPane.add(lblLogoPinkmanKart, "cell 2 0");

		JLabel txtLog = new JLabel("Login:");
		txtLog.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPane.add(txtLog, "cell 1 1,alignx left,aligny top");

		JLabel txtSe = new JLabel("Senha:");
		txtSe.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPane.add(txtSe, "cell 1 2,alignx left,aligny top");

		textLogin = new JTextField();
		contentPane.add(textLogin, "cell 2 1,growx,aligny top");
		textLogin.setColumns(10);

		textSenha = new JTextField();
		textSenha.setColumns(10);
		contentPane.add(textSenha, "cell 2 2,growx,aligny bottom");

		JButton btnEntrar = new JButton("Logar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				TelaSelecao ts = new TelaSelecao();
				ts.setExtendedState(JFrame.MAXIMIZED_BOTH);
				ts.setVisible(true);
		
			//	ArrayList<String>  = new ArrayList<>();
				
			}
		});
		contentPane.add(btnEntrar, "cell 2 3,growx,aligny top");
	}
}
