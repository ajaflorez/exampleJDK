package operar;

// static hace que la clase OperaHija ya no se pueda heredar
public final class OperaHija extends Operacion {

    public OperaHija(String nombre) {
        super(nombre);
    }
    
    @Override   // Permite sobreescribir el método o procedimiento
    public int sumar(int num1, int num2) {
        return num1 + num2 + 10;
    }
    
    // no se pudo sobreescribir el procedimiento restar por ser final por lo que se
    // tuvo que crear un nuevo procedimiento
    public int restarPositivo(int num1, int num2) {
        int val = 0;
        val = num1 - num2;
        if(val < 0)
            val = 0;
        return val;
    }
    
    
}
