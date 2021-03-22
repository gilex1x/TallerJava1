package concesionario;

/**
 *
 * @author ADMIN
 */
public abstract class Vehiculo {
    private int codigo;
    private String marca;
    private int modelo;
    private int kilometraje;
    private int precio;
    /**
     * Metodo contructor del vehiculo
     **/
    public Vehiculo(int codigo,String marca,int modelo,int kilometraje, int precio){
        super();
        this.codigo=codigo;
        this.marca=marca;
        this.modelo=modelo;
        this.kilometraje=kilometraje;
        this.precio=precio;
    }


    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }
    
    @Override
    public String toString(){
        return "Marca:\n"
                + getMarca()+"\n"
                + "Modelo:\n"
                + getModelo()+"\n"
                + "Kilometraje:\n"
                + getKilometraje();
    }
    
    
}
