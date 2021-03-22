package concesionario;

/**
 *
 * @author ADMIN
 */
public class Auto extends Vehiculo{
    private int codigo;
    private String marca;
    private int modelo;
    private int kilometraje;
    private int precio;
    public Auto(int codigo,String marca,int modelo,int kilometraje, int precio){
        super(codigo,marca,modelo,kilometraje,precio);
    }

}
