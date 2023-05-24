package modelo;

public abstract class Vehiculo1 {
	private String marca;
	private String modelo;
	private Estado estadoV;
	private int cambios;
	private int velMax;
	private int cilindraje;
	private TipoCombustible tipoCombustible;
	private Transmision transmision;
	private ABS abs;
	private String placa;
	private DisponilidadVehiculo disponibilidadVehiculo;
	public Vehiculo1(String marca2, String modelo2, Estado estado, int cambios2, int velMax2, int cilindraje2,
			TipoCombustible tipoCombustible2, Transmision transmision2, ABS abs2, DisponilidadVehiculo disponibilidadDisponilidadVehiculo) {
		// TODO Auto-generated constructor stub
		this.marca = marca;
		this.modelo = modelo;
		this.estadoV = estadoV;
		this.cambios = cambios;
		this.velMax = velMax;
		this.cilindraje = cilindraje;
		this.tipoCombustible = tipoCombustible;
		this.transmision = transmision;
		this.abs = abs;
		this.placa = placa;
		this.disponibilidadVehiculo=disponibilidadVehiculo;
		

	}

	public DisponilidadVehiculo getDisponibilidadVehiculo() {
		return disponibilidadVehiculo;
	}

	public void setDisponibilidadVehiculo(DisponilidadVehiculo disponibilidadVehiculo) {
		this.disponibilidadVehiculo = disponibilidadVehiculo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Estado getEstadoV() {
		return estadoV;
	}

	public void setEstadoV(Estado estadoV) {
		this.estadoV = estadoV;
	}

	public int getCambios() {
		return cambios;
	}

	public void setCambios(int cambios) {
		this.cambios = cambios;
	}

	public int getVelMax() {
		return velMax;
	}

	public void setVelMax(int velMax) {
		this.velMax = velMax;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	public TipoCombustible getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(TipoCombustible tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	public Transmision getTransmision() {
		return transmision;
	}

	public void setTransmision(Transmision transmision) {
		this.transmision = transmision;
	}

	public ABS getAbs() {
		return abs;
	}

	public void setAbs(ABS abs) {
		this.abs = abs;
	}

	
	public enum TipoCombustible {
		GASOLINA, DIESEL, ELECTRICO, HIBRIDO
	}

	
	public enum Transmision {
		MANUAL, AUTOMATICO
	}


	public enum ABS {
		SI, NO
	}

	
	public enum Estado {
		automatico, manual
	}
	public enum DisponilidadVehiculo{
		si,no
	}
}
