package paquete;

// CLASE BASE, SUPER CLASE, CLASE MADRE
public abstract class Vehiculo {
    Motor motor;
    int ruedas;
    int asientos;
    Timon timon;
    String placa;
    EstadoMotor estado;
    float cantiCombustible;
    int tanqueFull;

    public Vehiculo() {
        this.motor = Motor.GASOLINERO;
        this.ruedas = 2;
        this.asientos = 1;
        this.timon = Timon.RECTO;
        this.placa = "M1M-111";
        this.estado = EstadoMotor.APAGADO;
        this.cantiCombustible = 0;
        this.tanqueFull = 10;
    }

    public Vehiculo(Motor motor, int ruedas, int asientos, Timon timon, String placa, 
            int tanqueFull ) {
        this.motor = motor;
        this.ruedas = ruedas;
        this.asientos = asientos;
        this.timon = timon;
        this.placa = placa;
        this.estado = EstadoMotor.APAGADO;
        this.cantiCombustible = 0;
        this.tanqueFull = tanqueFull;        
    }
    
    
    
    @Override
    public String toString() {
        return ("Vehiculo: " + this.motor + ", " + this.ruedas + ", " + 
                this.asientos + ", " + this.timon + "," + this.placa + ", " + 
                this.estado + ", " + this.cantiCombustible);
    }
    
    public void Prender() {
        if(this.cantiCombustible > 0)
            this.estado = EstadoMotor.ENCENDIDO;     
    }
    public void Apagar() {
        this.estado = EstadoMotor.APAGADO;     
    }
    
    // abstract - Hace que la sub-clase tenga que implementar el procedimiento
    public abstract void abastecer(int cantiCombustible);
    public abstract void avanzar(int distancia);
    
    
    
}
