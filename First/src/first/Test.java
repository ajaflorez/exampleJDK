/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first;

/**
 *
 * @author sistemas-16
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Karel ka = new Karel(2, "Jose");
        Karel ka2 = new Karel(3, "Carlos");
        ka.setNombre("Robi");
        ka.encender();
        ka.caminar(10);
        ka.girarIzquierda();        
        ka.caminar(5);
        ka.girarDerecha();
        ka.caminar(2);
        ka.mediaVuelta();
        ka.caminar(5);
        
        System.out.println("El robot esta en: " + ka.getEjeX() + ", " + ka.getEjeY());
        
    }
    
}
