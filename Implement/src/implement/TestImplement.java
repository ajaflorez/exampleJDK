package implement;

import Mecanica.Vehiculo;
import Mecanica.Auto;
import Mecanica.Camioneta;

public class TestImplement {
    
    public static void main(String[] args) {
        Vehiculo auto = new Auto();  // creando el auto
        auto.cargarCombustible(10);
        boolean reto = auto.encender();        
        if(reto == false) {
            System.out.println("ERROR en Encendito");
        }
        System.out.println(auto);
        
        
        Camioneta mionca = new Camioneta();
        mionca.cambiarGas();
        mionca.cargarCombustible(20);
        mionca.retornarDeGas();
        mionca.cargarCombustible(69);
        mionca.cambiarGas();
        mionca.cargarCombustible(13);
        System.out.println(mionca.getLevelGas());
        mionca.encender();
        System.out.println(mionca);
        
    }
    
}
