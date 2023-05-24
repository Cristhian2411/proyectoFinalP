package modelo;

public class Pickup extends Vehiculo1 {
	private boolean es4x4;
	private int capacidadCarga;

	public Pickup(String marca, String modelo, Estado estado, int cambios, int velMax, int cilindraje,
			TipoCombustible tipoCombustible, Transmision transmision, ABS abs, boolean es4x4, int capacidadCarga,
			DisponilidadVehiculo disponilidadVehiculo) {
		super(marca, modelo, estado, cambios, velMax, cilindraje, tipoCombustible, transmision, abs,
				disponilidadVehiculo);
		this.es4x4 = es4x4;
		this.capacidadCarga = capacidadCarga;
	}

	public boolean isEs4x4() {
		return es4x4;
	}

	public void setEs4x4(boolean es4x4) {
		this.es4x4 = es4x4;
	}

	public int getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
}
