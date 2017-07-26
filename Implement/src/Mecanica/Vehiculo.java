package Mecanica;

public abstract class Vehiculo {
    private final int id;
    private static int contador = 1;
    private int asientos;
    private int llantas;
    private int puertas;
    private int ventanas;
    private EstadoVehiculo estado;
    private final Combustible combustible;
    private int levelCombustible;
    private int velocidad;

    public Vehiculo() {
        this.id = contador++;
        this.asientos = 1;
        this.llantas = 2;
        this.puertas = 0;
        this.ventanas = 0;
        this.estado = EstadoVehiculo.APAGADO;
        this.combustible = Combustible.GASOLINA;
        this.levelCombustible = 0;
        this.velocidad = 90;
    }
    public Vehiculo(int asientos, int llantas, int puertas, int ventanas, 
            Combustible combustible) {
        this.id = contador++;
        this.asientos = asientos;
        this.llantas = llantas;
        this.puertas = puertas;
        this.ventanas = ventanas;
        this.estado = EstadoVehiculo.APAGADO;
        this.combustible = combustible;
        this.levelCombustible = 0;
        this.velocidad = 90;
    }

    public int getId() {
        return id;
    }
    public int getAsientos() {
        return asientos;
    }
    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }
    public int getLlantas() {
        return llantas;
    }
    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }
    public int getPuertas() {
        return puertas;
    }
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    public int getVentanas() {
        return ventanas;
    }
    public void setVentanas(int ventanas) {
        this.ventanas = ventanas;
    }
    public EstadoVehiculo getEstado() {
        return estado;
    }
    public int getLevelCombustible() {
        return levelCombustible;
    }    
    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    
    
    public final boolean encender() {
        if(estado == EstadoVehiculo.APAGADO && this.levelCombustible > 0) {
            this.estado = EstadoVehiculo.ENCENDIDO;
            return true;
        }
        return false;            
    }
    public final boolean apagar() {
        if(estado == EstadoVehiculo.ENCENDIDO) {
            this.estado = EstadoVehiculo.APAGADO;
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return ("Id: " + this.id + ", " + this.asientos + ", " + this.llantas + ", " + 
                this.puertas + ", " + this.ventanas + ", " + this.estado + ", " + 
                this.levelCombustible);
    }
    public void cargarCombustible(int cantidad) {
        this.levelCombustible+=cantidad;
    }
}