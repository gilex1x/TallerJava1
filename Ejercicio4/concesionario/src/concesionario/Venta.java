package concesionario;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Venta {
    private int consecutivoVenta=0;
    private int totalVenta;
    private Comprador comprador;
    private List <Vehiculo> vehiculosComprados=new ArrayList();
    
    public Venta(Comprador comprador){
        this.comprador=comprador;
    }

    public int getConsecutivoVenta() {
        return consecutivoVenta;
    }

    public void setConsecutivoVenta(int consecutivoVenta) {
        this.consecutivoVenta = consecutivoVenta;
    }

    public int getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(int totalVenta) {
        this.totalVenta = totalVenta;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public List<Vehiculo> getVehiculosComprados() {
        return vehiculosComprados;
    }

    public void setVehiculosComprados(List<Vehiculo> vehiculosComprados) {
        this.vehiculosComprados = vehiculosComprados;
    }
    
    public void confirmarVenta(){
       consecutivoVenta= consecutivoVenta+1;
    }
    
    public void sumarPrecio(int precio){
        this.totalVenta=getTotalVenta() + precio;
    }
    
    @Override
    public String toString(){
        return"";
    }

    
    
}
