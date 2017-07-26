package primalidad;

interface Internt{

}

public class Test {

    public static void main(String[] args) {
        Primalidad primo;
        primo = new Primalidad(1);
        Primalidad prima;
        prima = primo;
        
        Premier sobri;
        sobri = new Premier(2);
        sobri.mcd(120,12);
        
        primo = sobri;
        //sobri = (Primalidad)primo;
        
        
        int a = 4;
        float b = 34.67F;
        
        a = (int)b;
        b = a;
        
        
        primo.setValor(-45);
        System.out.println(primo.getValor());
        
        for(int i= 2; i <100; i++) {
            if(primo.esPrimo(i))
                System.out.println(i + ": Es primo");
            else
                System.out.println(i + ": No es primo");
        }
        
        System.out.println("MCD: " + primo.mcd(124,30));
        
    }
    
}

























