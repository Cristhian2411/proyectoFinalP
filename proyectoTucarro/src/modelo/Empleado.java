package modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Empleado extends Persona {

	private ArrayList<Cliente> clientes;

	public Empleado(String nombre, String apellido, String cedula, String correo, String contrasena, TipoEstado estado,
			ArrayList<Cliente> clientes) {
		super(nombre, apellido, cedula, correo, contrasena, estado);
		this.clientes = new ArrayList<>();

	}

	public boolean buscarCliente(Cliente c) {
		for (int i = 0; i < this.clientes.size(); i++) {
			if (clientes.get(i).getCedula().equals(c.getCedula())) {
				return true;
			}
		}
		return false;
	}

	public void guardarCliente(Cliente c) {
		if (!buscarCliente(c)) {
			clientes.add(c);

		} else {
			System.out.println("el cliente ya ha sido registrado  ");
		}
	}
}