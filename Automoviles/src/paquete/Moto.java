
package paquete;

public class Moto extends Vehiculo {

    public Moto() {
        super();
    }

    public Moto(Motor motor, int ruedas, int asientos, Timon timon, String placa, int tanqueFull) {
        super(motor, ruedas, asientos, timon, placa, tanqueFull);
    }

    @Override
    public void abastecer(int cantiCombustible) {
        if(this.motor == Motor.GASOLINERO) {
            this.cantiCombustible+=cantiCombustible;
        }
        else if(this.motor == Motor.ELECTROCIDAD) {
            this.cantiCombustible+=cantiCombustible;
        }
    }

    @Override
    public void avanzar(int distancia) {
        this.cantiCombustible-=(distancia*0.05);
    }

    
    

    
    
    
}
