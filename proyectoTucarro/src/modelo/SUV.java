package modelo;

public class SUV extends Vehiculo1 {
    private int capacidadMaletero;
    private int velocidadCrucero;
    private boolean es4x4;

    public SUV(String marca, String modelo, Estado estado, int cambios, int velMax, int cilindraje,
            TipoCombustible tipoCombustible, Transmision transmision, ABS abs, int capacidadMaletero, int velocidadCrucero,
            boolean es4x4,DisponilidadVehiculo disponibilidadDisponilidadVehiculo) {
        super(marca, modelo, estado, cambios, velMax, cilindraje, tipoCombustible, transmision, abs,disponibilidadDisponilidadVehiculo);
        this.capacidadMaletero = capacidadMaletero;
        this.velocidadCrucero = velocidadCrucero;
        this.es4x4 = es4x4;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getVelocidadCrucero() {
        return velocidadCrucero;
    }

    public void setVelocidadCrucero(int velocidadCrucero) {
        this.velocidadCrucero = velocidadCrucero;
    }

    public boolean isEs4x4() {
        return es4x4;
    }

    public void setEs4x4(boolean es4x4) {
        this.es4x4 = es4x4;
    }
}

