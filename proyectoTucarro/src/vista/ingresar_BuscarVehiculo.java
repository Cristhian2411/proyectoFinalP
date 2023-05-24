package vista;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ingresar_BuscarVehiculo extends JFrame {

	public abstract class Vehiculo {
		private String tipo;
		private String marca;
		private String modelo;

		public Vehiculo(String tipo, String marca, String modelo) {
			this.tipo = tipo;
			this.marca = marca;
			this.modelo = modelo;
		}
		public String getTipo() {
			return tipo;
		}
		public String getMarca() {
			return marca;
		}
		public String getModelo() {
			return modelo;
		}
	}
	public class Moto extends Vehiculo {
		public Moto(String marca, String modelo) {
			super("Motos", marca, modelo);
		}
	}
	public class Sedan extends Vehiculo {
		public Sedan(String marca, String modelo) {
			super("Sedán", marca, modelo);
		}
	}
	
	private ArrayList<Vehiculo> listaVehiculos;
	private JButton btnRegistrar;
	private JButton btnBuscar;
	private JComboBox<String> comboBoxTipo;
	private JTextField txtMarca;
	private JTextField txtModelo;
	// no recuerdo cuales son los otros cosos que lleva pero van aqui

	public ingresar_BuscarVehiculo() {
		// array que almacenará los vehiculos
		listaVehiculos = new ArrayList<>();

		// Configuración de la ventana
		setTitle("Concesionario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLayout(null);

		// Componentes de la interfaz
		JLabel lblTipo = new JLabel("Tipo de Vehículo:");
		lblTipo.setBounds(10, 10, 120, 20);
		add(lblTipo);

		comboBoxTipo = new JComboBox<>(new String[] { "Motos", "Sedán", "Deportivos", "Camionetas", "Pick Ups",
				"Eléctricos", "Híbridos", "Deportivos", "Vans", "Camiones", "Buses" });
		comboBoxTipo.setBounds(140, 10, 150, 20);
		add(comboBoxTipo);

		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setBounds(10, 40, 120, 20);
		add(lblMarca);

		txtMarca = new JTextField();
		txtMarca.setBounds(140, 40, 150, 20);
		add(txtMarca);

		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(10, 70, 120, 20);
		add(lblModelo);

		txtModelo = new JTextField();
		txtModelo.setBounds(140, 70, 150, 20);
		add(txtModelo);

		// Agrega aquí los demás componentes necesarios

		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(140, 100, 100, 25);
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registrarVehiculo();
			}
		});
		add(btnRegistrar);

		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(250, 100, 100, 25);
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarVehiculo();
			}
		});
		add(btnBuscar);
	}

	private void registrarVehiculo() {
		String tipo = (String) comboBoxTipo.getSelectedItem();
		String marca = txtMarca.getText();
		String modelo = txtModelo.getText();

		// Crea una instancia del tipo de vehículo seleccionado
		Vehiculo vehiculo = null;
		switch (tipo) {
		case "Motos":
			vehiculo = new Moto(marca, modelo);
			break;
		case "Sedán":
			vehiculo = new Sedan(marca, modelo);
			break;
		// Agrega aquí los demás casos para los otros tipos de vehículos
		}

		if (vehiculo != null) {
			listaVehiculos.add(vehiculo);
			JOptionPane.showMessageDialog(this, "Vehículo registrado correctamente");
			// Limpia los campos de texto después de registrar el vehículo
			txtMarca.setText("");
			txtModelo.setText("");
		} else {
			JOptionPane.showMessageDialog(this, "Error al registrar el vehículo");
		}
	}

	private void buscarVehiculo() {
		String tipo = (String) comboBoxTipo.getSelectedItem();
		String marca = txtMarca.getText();

		// Realiza la búsqueda en la lista de vehículos según los criterios
		ArrayList<Vehiculo> resultados = new ArrayList<>();
		for (Vehiculo vehiculo : listaVehiculos) {
			if (vehiculo.getTipo().equals(tipo) && vehiculo.getMarca().equalsIgnoreCase(marca)) {
				resultados.add(vehiculo);
			}
		}

		// Muestra los resultados de la búsqueda
		StringBuilder mensaje = new StringBuilder();
		if (!resultados.isEmpty()) {
			mensaje.append("Resultados de la búsqueda:\n");
			for (Vehiculo vehiculo : resultados) {
				mensaje.append("Tipo: ").append(vehiculo.getTipo()).append("\n");
				mensaje.append("Marca: ").append(vehiculo.getMarca()).append("\n");
				mensaje.append("Modelo: ").append(vehiculo.getModelo()).append("\n");
				// Agrega aquí los demás atributos específicos del tipo de vehículo
				mensaje.append("\n");
			}
		} else {
			mensaje.append("No se encontraron resultados");
		}

		JOptionPane.showMessageDialog(this, mensaje.toString());
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ingresar_BuscarVehiculo concesionarioGUI = new ingresar_BuscarVehiculo();
				concesionarioGUI.setVisible(true);
			}
		});
	}
}
