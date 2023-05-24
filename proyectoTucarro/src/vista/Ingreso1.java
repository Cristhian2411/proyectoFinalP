package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Ingreso1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ingreso1 frame = new Ingreso1();
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
	public Ingreso1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Cristhian lopez\\Downloads\\varrp.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(5, 100, 663, 522);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Consignataria Tu carro");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setToolTipText("nombre");
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
	
		
		
		txtNombre = new JTextField();
		txtNombre.setToolTipText("nombre");
		txtNombre.setBounds(167, 162, 252, 32);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		JTextPane txtpnNombre = new JTextPane();
		txtpnNombre.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtpnNombre.setEditable(false);
		txtpnNombre.setText("Nombre");
		txtpnNombre.setBounds(273, 128, 56, 19);
		panel.add(txtpnNombre);
		
		JTextPane txtpnIdentificacion = new JTextPane();
		txtpnIdentificacion.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtpnIdentificacion.setEditable(false);
		txtpnIdentificacion.setText("Identificacion");
		txtpnIdentificacion.setBounds(256, 233, 93, 19);
		panel.add(txtpnIdentificacion);
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton.setBounds(167, 332, 116, 32);
		panel.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(174, 262, 255, 32);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Registrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_1.setBounds(313, 330, 116, 32);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 5));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(Ingreso1.class.getResource("/fptps/varrp.jpg")));
		lblNewLabel_1.setBounds(0, 0, 639, 457);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("Recuperar contraseña");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_2.setBounds(222, 386, 175, 32);
		panel.add(btnNewButton_2);
		
	}
	
	
	}
	
	

