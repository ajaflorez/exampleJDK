package primalidad;

public class Primalidad extends Metaclase{
    private int valor;  // Encapsulamiento -> get y set
    private Cliente mio;
    
    public Primalidad(int valor) {
        this.valor = valor;
        mio  =  new Cliente();
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        if(valor > 0)
            this.valor = valor;
        else
            this.valor = 0;
    }
    public boolean esPrimo(int numero) {
        if(numero > 3) {
            if (numero % 2 != 0) {
                for(int i = 3; i <= numero / 3; i++) {
                    if(numero % i == 0)
                        return false;
                }
                return true;
            }
            else
                return false;
        }
        return true;
    }
    public int mcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        else {
            return mcd(b, a % b);
        }        
    }

    @Override
    public int sumar(int a, int b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
