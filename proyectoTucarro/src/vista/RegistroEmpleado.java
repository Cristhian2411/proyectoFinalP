package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class RegistroEmpleado extends JFrame {

    private JPanel contentPane;
    private JTextField textFieldNombre;
    private JTextField textFieldApellido;
    private JTextField textFieldCedula;
    private JTextField textFieldCorreo;
    private ArrayList<String> listaEmpleados;

    public static void main(String[] args) {
        RegistroEmpleado frame = new RegistroEmpleado();
        frame.setVisible(true);
    }

    public RegistroEmpleado() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 507, 317);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        listaEmpleados = new ArrayList<>();

        JLabel lblNewLabel = new JLabel("Registro de empleados");
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblNewLabel.setBounds(164, 10, 137, 25);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Nombre");
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblNewLabel_1.setBounds(10, 51, 76, 25);
        contentPane.add(lblNewLabel_1);

        textFieldNombre = new JTextField();
        textFieldNombre.setBounds(10, 81, 96, 19);
        contentPane.add(textFieldNombre);
        textFieldNombre.setColumns(10);

        JLabel lblNewLabel_2 = new JLabel("Apellido");
        lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblNewLabel_2.setBounds(10, 126, 116, 13);
        contentPane.add(lblNewLabel_2);

        textFieldApellido = new JTextField();
        textFieldApellido.setBounds(10, 149, 96, 19);
        contentPane.add(textFieldApellido);
        textFieldApellido.setColumns(10);

        JLabel lblNewLabel_3 = new JLabel("Cedula");
        lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblNewLabel_3.setBounds(10, 198, 76, 19);
        contentPane.add(lblNewLabel_3);

        textFieldCedula = new JTextField();
        textFieldCedula.setBounds(10, 227, 96, 19);
        contentPane.add(textFieldCedula);
        textFieldCedula.setColumns(10);

        JLabel lblNewLabel_4 = new JLabel("Correo");
        lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblNewLabel_4.setBounds(230, 52, 59, 19);
        contentPane.add(lblNewLabel_4);

        textFieldCorreo = new JTextField();
        textFieldCorreo.setBounds(230, 81, 196, 19);
        contentPane.add(textFieldCorreo);
        textFieldCorreo.setColumns(10);

        JButton btnNewButton = new JButton("Registrar");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = textFieldNombre.getText();
                String apellido = textFieldApellido.getText();
                String cedula = textFieldCedula.getText();
                String correo = textFieldCorreo.getText();

                // Guardar los datos del empleado en el ArrayList
                String empleado = "Nombre: " + nombre + "\nApellido: " + apellido + "\nCédula: " + cedula + "\nCorreo: " + correo;
                listaEmpleados.add(empleado);

                // Limpiar los campos después de guardar
                textFieldNombre.setText("");
                textFieldApellido.setText("");
                textFieldCedula.setText("");
                textFieldCorreo.setText("");

                System.out.println("Empleado registrado:\n" + empleado);
            }
        });
        btnNewButton.setBounds(373, 245, 102, 21);
        contentPane.add(btnNewButton);
    }
}
