package Mecanica;

// Para poder usa el interface se usa el implements
// los métodos de las interfaces son igual a los métodos abstractos
public class Camioneta extends Vehiculo implements Toyota { 
    boolean duplex;  // Cuando usar el combustible por defecto o usar GAS
    private int levelGas;

    public Camioneta() {
        super();    // el constructor de la clase base
        this.duplex = false;
        this.levelGas = 0;
    }    

    public int getLevelGas() {
        return levelGas;
    }
    
    
    // Los siguientes metodos son de la interface Toyota
    @Override
    public void encenderTurbo() {
        this.setVelocidad(this.getVelocidad()*2);
    }
    @Override
    public void apagarTurbo() {
        this.setVelocidad(this.getVelocidad()/2);
    }
    @Override
    public void cambiarGas() {
        this.duplex = true;
    }
    @Override
    public void retornarDeGas() {
        this.duplex = false;
    }
    // fin de los metodos de la infertafe Toyota

    @Override
    public void cargarCombustible(int cantidad) {
        if(this.duplex == true) {
            this.levelGas+=cantidad;
        }
        else {
            super.cargarCombustible(cantidad);
        }
    }
    
    
                                
    
}
