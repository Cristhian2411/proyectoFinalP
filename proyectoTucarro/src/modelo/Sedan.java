package modelo;

public class Sedan extends Vehiculo1 {
    private int velocidadCrucero;
    private int capacidadMaletero;

    public Sedan(String marca, String modelo, Estado  estado, int cambios, int velMax, int cilindraje,
            TipoCombustible tipoCombustible, Transmision transmision, ABS abs, int velocidadCrucero,
            int capacidadMaletero,DisponilidadVehiculo disponilidadVehiculo) {
        super(marca, modelo, estado, cambios, velMax, cilindraje, tipoCombustible, transmision, abs, disponilidadVehiculo);
        this.velocidadCrucero = velocidadCrucero;
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getVelocidadCrucero() {
        return velocidadCrucero;
    }

    public void setVelocidadCrucero(int velocidadCrucero) {
        this.velocidadCrucero = velocidadCrucero;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }
}

