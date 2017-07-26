/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

/**
 *
 * @author Usuario
 */
public class Quatripo {
    private int a;
    private int b;
    private int c;
    private int d;
    
    Quatripo()
    {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
    }
    Quatripo(int a, int b, int c, int d)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        validar();
    }
    public void validar(){
        if(!(this.b <= 7 && this.c <= 3 && this.d <= 1  ))
        {
            int tmp = 0;
            if(this.getD() > 1)
            {
                tmp = getD() / 2;
                setD(getD() % 2);
                setC(getC() + tmp);
            }
            if(this.getC() > 3)
            {
                tmp = getC() / 4;
                setC(getC() % 4);
                setB(getB() + tmp);
            }
            if(this.getB() > 7)
            {
                tmp = getB() / 8;
                setB(getB() % 8);
                setA(getA() + tmp);
            }
        }
    }
    public void convertir(int natural)
    {
        this.setD(natural);
        validar();
    }
    public int desConvertir()
    {
        return (getA() * 8) + (getB() * 4) + (getC() * 2) + getD();
    }
    public Quatripo sumar(Quatripo entra){
        this.a = this.a + entra.getA();
        this.b = this.b + entra.getB();
        this.c = this.c + entra.getC();
        this.d = this.d + entra.getD();
        this.validar();
        return this;
    }
    public Quatripo restar(Quatripo entra){
        this.a = this.a - entra.getA();
        this.b = this.b - entra.getB();
        this.c = this.c - entra.getC();
        this.d = this.d - entra.getD();
        this.validar();
        return this;
    }

    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public int getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(int c) {
        this.c = c;
    }

    /**
     * @return the d
     */
    public int getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(int d) {
        this.d = d;
    }
}
