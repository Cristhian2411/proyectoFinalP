package modelo;

public class Vans extends Vehiculo1 {
    private int capacidadMaletero;

    public Vans(String marca, String modelo, Estado estado, int cambios, int velMax, int cilindraje,
                TipoCombustible tipoCombustible, Transmision transmision, ABS abs, int capacidadMaletero,DisponilidadVehiculo disponilidadVehiculo) {
        super(marca, modelo, estado, cambios, velMax, cilindraje, tipoCombustible, transmision, abs,disponilidadVehiculo);
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }
}
