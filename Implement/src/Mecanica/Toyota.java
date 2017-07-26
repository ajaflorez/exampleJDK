package Mecanica;

public interface Toyota {   // Es igual a una clase Abstract
    boolean turbo = true;   // Son igual a atributos tipo: final
    Combustible miCombustible = Combustible.GAS;
    
    
    public void encenderTurbo();    // Son igual que los metodos abstract
    public void apagarTurbo();
    public void cambiarGas();
    public void retornarDeGas();
}
