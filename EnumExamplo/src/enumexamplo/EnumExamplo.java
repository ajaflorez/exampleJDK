/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumexamplo;

enum meses
{
    // Conjunto de valores
    enero(31,1), febrero(28,1), marzo(31,1), abril(30,1),
    mayo(31,1), junio(30,1), julio(31,1), agosto(31,1),
    septiembre(30,1), octubre(31,1), noviembre(30,1), diciembre(31,1);
    // Atributos
    private final int díasMes;
    public int valor;
    
    // Métodos
    meses(int díasMes, int valor) { this.díasMes = díasMes; this.valor = valor;} // constructor
    public int getDíasMes() { return this.díasMes; }
}

public class EnumExamplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        meses mes = meses.marzo;
        // ...
        int ind = mes.ordinal(); // índice: 0, 1, 2, ...
        System.out.println("el mes " + (ind+1) + " es " + mes.values()[ind]);
        System.out.println(mes + " tiene " + mes.getDíasMes() + " días");
    }
    
}
