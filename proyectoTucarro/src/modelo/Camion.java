package modelo;

public class Camion extends Vehiculo1 {
	public enum FrenosAire {
		SI, NO
	}

	public enum TipoCamion {
		REMOLQUE, TANQUE, VOLQUETA
	}

	private FrenosAire frenosAire;
	private int capacidadCarga;
	private int numeroEjes;
	private TipoCamion tipoCamion;

	public Camion(String marca, String modelo, Estado estado, int cambios, int velMax, int cilindraje,
			TipoCombustible tipoCombustible, Transmision transmision, ABS abs, FrenosAire frenosAire,
			int capacidadCarga, int numeroEjes, TipoCamion tipoCamion,DisponilidadVehiculo disponilidadVehiculo) {
		super(marca, modelo, estado, cambios, velMax, cilindraje, tipoCombustible, transmision, abs, disponilidadVehiculo);
		this.frenosAire = frenosAire;
		this.capacidadCarga = capacidadCarga;
		this.numeroEjes = numeroEjes;
		this.tipoCamion = tipoCamion;
	}

	public FrenosAire getFrenosAire() {
		return frenosAire;
	}

	public void setFrenosAire(FrenosAire frenosAire) {
		this.frenosAire = frenosAire;
	}

	public int getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

	public int getNumeroEjes() {
		return numeroEjes;
	}

	public void setNumeroEjes(int numeroEjes) {
		this.numeroEjes = numeroEjes;
	}

	public TipoCamion getTipoCamion() {
		return tipoCamion;
	}

	public void setTipoCamion(TipoCamion tipoCamion) {
		this.tipoCamion = tipoCamion;
	}
}
