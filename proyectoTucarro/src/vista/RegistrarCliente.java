package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class RegistrarCliente extends JFrame {

	private JPanel contentPane;
	private JTextField nombre1;
	private JTextField apellido1;
	private JTextField cedula1;
	private JTextField correo1;

	private ArrayList<String> listaClientes; // ArrayList para almacenar los clientes
	private JTextField contraseña1;
	private JLabel lblNewLabel_5;

	public RegistrarCliente() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Cristhian lopez\\Downloads\\varrp.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 357);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		listaClientes = new ArrayList<>(); // Inicializar el ArrayList

		nombre1 = new JTextField();
		nombre1.setBounds(10, 59, 96, 19);
		contentPane.add(nombre1);
		nombre1.setColumns(10);

		JLabel lblNewLabel = new JLabel("Apellido");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 97, 56, 27);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 29, 56, 20);
		contentPane.add(lblNewLabel_1);

		apellido1 = new JTextField();
		apellido1.setColumns(10);
		apellido1.setBounds(10, 142, 96, 19);
		contentPane.add(apellido1);

		JLabel lblNewLabel_2 = new JLabel("Correo");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(242, 33, 45, 13);
		contentPane.add(lblNewLabel_2);

		cedula1 = new JTextField();
		cedula1.setColumns(10);
		cedula1.setBounds(10, 213, 96, 19);
		contentPane.add(cedula1);

		JLabel lblNewLabel_3 = new JLabel("Cedula");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(10, 183, 56, 16);
		contentPane.add(lblNewLabel_3);

		correo1 = new JTextField();
		correo1.setColumns(10);
		correo1.setBounds(239, 59, 186, 19);
		contentPane.add(correo1);

		JLabel lblNewLabel_4 = new JLabel("Contraseña");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(242, 105, 70, 13);
		contentPane.add(lblNewLabel_4);
		
		contraseña1 = new JTextField();
		contraseña1.setColumns(10);
		contraseña1.setBounds(242, 142, 96, 19);
		contentPane.add(contraseña1);
		
		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = nombre1.getText();
				String apellido = apellido1.getText();
				String cedula = cedula1.getText();//ejemplito
				String correo = correo1.getText();
				String contraseña=contraseña1.getText();

				// Guardar los datos del cliente en el ArrayList
				String cliente = "Nombre: "  + nombre + "\n Apellido:  " + apellido + "\n Cédula:  " + cedula
						+ "\n Correo: " + correo+ "\n contraseña: "+contraseña;
				listaClientes.add(cliente);

				// Limpiar los campos después de guardar
				nombre1.setText("");
				apellido1.setText("");
				cedula1.setText("");
				correo1.setText("");
				contraseña1.setText("");

				System.out.println("Cliente registrado: " + cliente);
			}
		});
		btnNewButton.setBounds(394, 277, 105, 21);
		contentPane.add(btnNewButton);
		
		lblNewLabel_5 = new JLabel("Registrar cliente");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(166, 0, 159, 23);
		contentPane.add(lblNewLabel_5);

		contentPane.setFocusTraversalPolicy(
				new FocusTraversalOnArray(new Component[] { nombre1, lblNewLabel, lblNewLabel_1, apellido1,
						lblNewLabel_2, cedula1, lblNewLabel_3, correo1, lblNewLabel_4, btnNewButton }));

	}

	public static void main(String[] args) {
		RegistrarCliente frame = new RegistrarCliente();
		frame.setVisible(true);

	}
}


/*
public class registroEmpleado extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private ArrayList<String> listaEmpleados;

	public static void main(String[] args) {
		RegistrarCliente frame = new RegistrarCliente();
		frame.setVisible(true);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registroEmpleado frame = new registroEmpleado();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public registroEmpleado() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Cristhian lopez\\Downloads\\varrp.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 507, 317);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		listaEmpleados = new ArrayList<>();

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 0, 485, 276);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Registro de empleados");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel.setBounds(164, 10, 137, 25);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nombre ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 51, 76, 25);
		panel.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(10, 81, 96, 19);
		panel.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Apellido");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 126, 116, 13);
		panel.add(lblNewLabel_2);

		textField_1 = new JTextField();
		textField_1.setBounds(10, 149, 96, 19);
		panel.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Cedula ");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(10, 198, 76, 19);
		panel.add(lblNewLabel_3);

		textField_2 = new JTextField();
		textField_2.setBounds(10, 227, 96, 19);
		panel.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Correo");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(230, 52, 59, 19);
		panel.add(lblNewLabel_4);

		textField_3 = new JTextField();
		textField_3.setBounds(230, 81, 196, 19);
		panel.add(textField_3);
		textField_3.setColumns(10);

		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = textField.getText();
				String apellido = textField_1.getText();
				String cedula = textField_2.getText();// ejemplito
				String correo = textField_3.getText();

				// Guardar los datos del cliente en el ArrayList
				String empleado = "Nombre: " + nombre + "\n Apellido:  " + apellido + "\n Cédula:  " + cedula
						+ "\n Correo: " + correo;
				listaEmpleados.add(empleado);
				// Limpiar los campos después de guardar
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");

				System.out.println("Cliente registrado: " + empleado);
			}
		});
		btnNewButton.setBounds(373, 245, 102, 21);
		panel.add(btnNewButton);
		lblNewLabel_5 = new JLabel("Registrar empleado");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(166, 0, 159, 23);
		contentPane.add(lblNewLabel_5);

		contentPane.setFocusTraversalPolicy(
				new FocusTraversalOnArray(new Component[] { nombre1, lblNewLabel, lblNewLabel_1, apellido1,
						lblNewLabel_2, cedula1, lblNewLabel_3, correo1, lblNewLabel_4, btnNewButton }));

	}

}
*/
