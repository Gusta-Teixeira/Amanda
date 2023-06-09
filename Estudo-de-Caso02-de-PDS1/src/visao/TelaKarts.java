package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Panel;

public class TelaKarts extends JFrame {

	private JPanel contentPane;
	private JTextField textBuscarKarts;
	private JTextField textMarcaKart;
	private JTextField textAno;
	private JTextField textPreco;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaKarts frame = new TelaKarts();
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
	public TelaKarts() {
		setTitle("Karts");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 967, 659);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(218, 73, 73));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(10, 11, 89, 23);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaSelecao ts = new TelaSelecao();
				ts.setVisible(true);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnVoltar);
		
		JLabel lblBuscarKarts = new JLabel("Buscar:");
		lblBuscarKarts.setBounds(32, 140, 67, 30);
		lblBuscarKarts.setForeground(new Color(255, 255, 255));
		lblBuscarKarts.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblBuscarKarts);
		
		textBuscarKarts = new JTextField();
		textBuscarKarts.setBounds(121, 143, 187, 30);
		contentPane.add(textBuscarKarts);
		textBuscarKarts.setColumns(10);
		
		JLabel lblMarcaKarts = new JLabel("Marca:");
		lblMarcaKarts.setBounds(32, 181, 67, 30);
		lblMarcaKarts.setForeground(new Color(255, 255, 255));
		lblMarcaKarts.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblMarcaKarts);
		
		textMarcaKart = new JTextField();
		textMarcaKart.setBounds(432, 143, 187, 30);
		textMarcaKart.setColumns(10);
		contentPane.add(textMarcaKart);
		
		JLabel lblAno = new JLabel("Ano:");
		lblAno.setBounds(650, 140, 59, 30);
		lblAno.setForeground(Color.WHITE);
		lblAno.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblAno);
		
		textAno = new JTextField();
		textAno.setBounds(719, 143, 187, 30);
		textAno.setColumns(10);
		contentPane.add(textAno);
		
		textPreco = new JTextField();
		textPreco.setBounds(432, 184, 187, 30);
		textPreco.setColumns(10);
		contentPane.add(textPreco);
		
		JLabel lblPreo = new JLabel("Preço:");
		lblPreo.setBounds(318, 181, 67, 30);
		lblPreo.setForeground(Color.WHITE);
		lblPreo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblPreo);
		
		Panel panel = new Panel();
		panel.setBounds(32, 221, 874, 389);
		panel.setBackground(new Color(255, 255, 255));
		panel.setForeground(new Color(255, 255, 255));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setForeground(Color.WHITE);
		lblQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblQuantidade.setBounds(318, 140, 104, 30);
		contentPane.add(lblQuantidade);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(121, 184, 187, 30);
		contentPane.add(textField);
	}
}
