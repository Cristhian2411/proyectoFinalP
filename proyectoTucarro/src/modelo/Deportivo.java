package modelo;

public class Deportivo extends Vehiculo1 {
    private int velocidad;
    private int caballosFuerza;

    public Deportivo(String marca, String modelo, Estado estado, int cambios, int velMax, int cilindraje,
            TipoCombustible tipoCombustible, Transmision transmision, ABS abs, int velocidad, int caballosFuerza,DisponilidadVehiculo disponilidadVehiculo) {
        super(marca, modelo, estado, cambios, velMax, cilindraje, tipoCombustible, transmision, abs,disponilidadVehiculo);
        this.velocidad = velocidad;
        this.caballosFuerza = caballosFuerza;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getCaballosFuerza() {
        return caballosFuerza;
    }

    public void setCaballosFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }
}

