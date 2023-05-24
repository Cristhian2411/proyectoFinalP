package modelo;

public class Bus extends Vehiculo1 {
    private int cantidadEjes;
    private int cantidadSalidasEmergencia;
    private int capacidadMaletero;

    public Bus(String marca, String modelo, Estado estado, int cambios, int velMax, int cilindraje,
               TipoCombustible tipoCombustible, Transmision transmision, ABS abs, int cantidadEjes,
               int cantidadSalidasEmergencia, int capacidadMaletero,DisponilidadVehiculo disponilidadVehiculo) {
        super(marca, modelo, estado, cambios, velMax, cilindraje, tipoCombustible, transmision, abs, disponilidadVehiculo);
        this.cantidadEjes = cantidadEjes;
        this.cantidadSalidasEmergencia = cantidadSalidasEmergencia;
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getCantidadEjes() {
        return cantidadEjes;
    }

    public void setCantidadEjes(int cantidadEjes) {
        this.cantidadEjes = cantidadEjes;
    }

    public int getCantidadSalidasEmergencia() {
        return cantidadSalidasEmergencia;
    }

    public void setCantidadSalidasEmergencia(int cantidadSalidasEmergencia) {
        this.cantidadSalidasEmergencia = cantidadSalidasEmergencia;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }
}

