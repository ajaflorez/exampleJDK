package operaciones;

import operar.Operacion;
import operar.OperaHija;


public class OperacionText {

    public static void main(String[] args) {
        
        System.out.println("Clase OPERACION");
        
        // La forma tradicional es: (OBJETOS)
        Operacion opera1;       // decalarar el objeto 
        opera1 = new Operacion("uno");    // instanciarlo o inicializarlo        
        int a = opera1.sumar(10, 11);    // llamara el procedimiento mediante 
                                        // el objeto declarado e instanciado
        System.out.println(opera1.getId());
        
        Operacion opera2 = new Operacion("dos");
        System.out.println(opera2.getId());
        Operacion opera3 = new Operacion("tres");
        System.out.println(opera3.getId());
        Operacion opera4 = new Operacion("cuatro");
        System.out.println(opera4.getId());
        Operacion opera5 = new Operacion("cinco");
        System.out.println(opera5.getId());
        
        System.out.println("Clase OPERAHIJA");
        
        OperaHija operah1 = new OperaHija("uno");
        System.out.println(operah1.getId());
        OperaHija operah2 = new OperaHija("dos");
        System.out.println(operah2.getId());
        
        System.out.println(operah2.sumar(10, 20));
        
        System.out.println("Clase OPERACION");
        
        Operacion opera6 = new Operacion("seis");
        System.out.println(opera6.getId());
        System.out.println(opera6.sumar(10, 20));
        

        
        // forma rapida y directa (CLASES)
        int remu = Operacion.multiplicar(15, 8);
        float redi = Operacion.dividir(86, 13);    
        
        int remu2 = OperaHija.multiplicar(15, 20);
        
        
        System.out.println(remu2);
    }
    
}
