package first;

public class Karel {
    private int id;
    private String nombre;    
    private int edad;
    private int tamano;
    private boolean estado;
    private int ejeX;
    private int ejeY;
    private int direccion;  //  1:norte, 2:este, 3:sur, 4:oeste

    // COnstructor
    public Karel(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.edad = 1;
        this.tamano = 1;
        this.estado = false;
        this.ejeX = 0;
        this.ejeY = 0;
        this.direccion = 1;
        
    }
    // Encapsulamiento
    public int getId() {
        return id;
    }
    private void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    private void setEdad(int edad) {
        this.edad = edad;
    }
    public int getTamano() {
        return tamano;
    }
    private void setTamano(int tamano) {
        this.tamano = tamano;
    }
    public boolean isEstado() {
        return estado;
    }
    private void setEstado(boolean estado) {
        this.estado = estado;
    }
    public int getEjeX() {
        return ejeX;
    }
    public void setEjeX(int ejeX) {
        this.ejeX = ejeX;
    }
    public int getEjeY() {
        return ejeY;
    }
    public void setEjeY(int ejeY) {
        this.ejeY = ejeY;
    }
    public int getDireccion() {
        return direccion;
    }
    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }
    
    
    public void encender() {
        estado = true;
    }
    public void apagar() {
        estado = false;
    }
    public void caminar(int cantidad) {
        switch(direccion) {
            case 1: ejeX = ejeX + cantidad;
                break;
            case 2: ejeY+=cantidad;
                break;
            case 3: ejeX-=cantidad;
                break;
            case 4: ejeY = ejeY - cantidad;
                break;
        }
    }
    public void girarIzquierda() {
        switch(direccion) {
            case 1: direccion = 4;
                break;
            case 2: direccion = 1;
                break;
            case 3: direccion = 2;
                break;
            case 4: direccion = 3;
                break;
        }
    }
    public void girarDerecha() {
        switch(direccion) {
            case 1: direccion = 2;
                break;
            case 2: direccion = 3;
                break;
            case 3: direccion = 4;
                break;
            case 4: direccion = 1;
                break;
        }
    }
    public void mediaVuelta() {
        girarIzquierda();
        girarIzquierda();
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
