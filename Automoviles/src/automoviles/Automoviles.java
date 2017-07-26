/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automoviles;

import paquete.Timon;
import paquete.Auto;
import paquete.Bus;
import paquete.Moto;
import paquete.Motor;

/**
 *
 * @author sistemas-16
 */
public class Automoviles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*paquete.Vehiculo vehi = new paquete.Vehiculo();
        System.out.println(vehi);*/
        
        /*paquete.Moto moto = new paquete.Moto(Motor.PETROLERO, 3, 1, Timon.RECTO, "A5T-569");
        moto.Prender();
        System.out.println(moto);
        
        Auto auto = new Auto(Motor.GAS, 4, 5, Timon.CIRCULAR, "A5T-458");
        System.out.println(auto);
        
        Bus bus =  new Bus(Motor.PETROLERO, 10, 40, Timon.CIRCULAR, "T9W-569");
        System.out.println(bus);*/
        
        paquete.Vehiculo vehi;
        vehi = new paquete.Bus();
        vehi.abastecer(51);
        vehi.Prender();
        System.out.println(vehi);
        vehi.avanzar(30);
        System.out.println(vehi);
        
        Moto moto = new Moto(Motor.GASOLINERO, 2, 1, Timon.RECTO, "Y8U-896", 10);
        moto.abastecer(2);
        moto.Prender();
        System.out.println(moto);
        moto.avanzar(5);
        System.out.println(moto);
        
        Auto auto = new Auto(Motor.GASOLINERO, 4, 5, Timon.CIRCULAR, "Y9E-698", 40);
        auto.abastecer(10);
        auto.Prender();
        System.out.println(auto);
        auto.avanzar(9);
        System.out.println(auto);
        
        
    }
    
}
