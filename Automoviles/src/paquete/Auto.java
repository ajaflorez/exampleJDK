package paquete;

public class Auto extends Vehiculo {

    public Auto() {
        super(Motor.GASOLINERO, 4, 5, Timon.CIRCULAR, "A1A-111", 30);
    }

    public Auto(Motor motor, int ruedas, int asientos, Timon timon, String placa, int tanqueFull) {
        super(motor, ruedas, asientos, timon, placa, tanqueFull);
    }

    @Override
    public void abastecer(int cantiCombustible) {        
        this.cantiCombustible+=cantiCombustible;        
    }

    @Override
    public void avanzar(int distancia) {
        this.cantiCombustible-=(distancia*0.1);
    }

    
    

    
    
}
