
package paquete;

public class Bus extends Vehiculo{

    public Bus() {
        super(Motor.PETROLERO, 6, 30, Timon.CIRCULAR, "B1B-111", 100);
    }

    public Bus(Motor motor, int ruedas, int asientos, Timon timon, String placa, int tanqueFull) {
        super(motor, ruedas, asientos, timon, placa, tanqueFull);
    }
    
    @Override
    public void Prender() {
        if(this.cantiCombustible > 50)
            this.estado = EstadoMotor.ENCENDIDO;            
    }

    @Override
    public void abastecer(int cantiCombustible) {
        if(this.motor == Motor.PETROLERO) {
            this.cantiCombustible+=cantiCombustible;
        }
        else if(this.motor == Motor.GAS) {
            this.cantiCombustible+=cantiCombustible;
        }
        
    }

    @Override
    public void avanzar(int distancia) {
        this.cantiCombustible-=(distancia*0.2);
    }

    
    

    
    
}
