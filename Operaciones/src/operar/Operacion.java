package operar;

public class Operacion {
    private final int id;  
    private final String nombre;
    private float flotante;
    public static int contador = 1; // todo atributo de tipo static se debe de inicilizar 
                                // al momento de declararlo

    public Operacion(String nombre) {        
        this.id = contador++;   // primero se ejecuta la asignacion y despues la suma        
        this.nombre = nombre;
        this.flotante = 1.5F;
    }
    
    public int getId() {
        return id;
    }    
    public String getCadena() {
        return nombre;
    }    
    public float getFlotante() {
        return flotante;
    }
    public int getContador() {
        return contador;
    }
    public void setFlotante(float flotante) {
        this.flotante = flotante;
    }
    
    public int sumar(int num1, int num2) {
        return num1 + num2 + this.id;
    }
    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }
    public static float dividir(int num1, int num2) {
        return (float)num1 / num2;
    }
    
    public final int restar(int num1, int num2) {
        return num1 - num2;
    }
    public String concatenar(String cadena1, String cadena2) {
        return cadena1 + cadena2;
    }
    public static float calcular(int numero) {
        return numero * 10 / 3 * multiplicar(12,8);
    }
}

