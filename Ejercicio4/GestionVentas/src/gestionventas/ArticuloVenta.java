package gestionventas;

public class ArticuloVenta {
    public String nombre;
    public int valor;
    
    public ArticuloVenta(String nombre,int valor){
        this.nombre=nombre;
        this.valor=valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
