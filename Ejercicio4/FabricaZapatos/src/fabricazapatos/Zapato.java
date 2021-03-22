package fabricazapatos;



/**
 *
 * @author ADMIN
 */
public  class Zapato {
    private String modelo;
    private int  talla;
    private double precio;
    private double precioFinal;

    public Zapato(String modelo, int talla) {
        this.modelo = modelo;
        this.talla = talla;
        
        if(modelo.toUpperCase() == "EJECUTIVO"){
            this.precio=95345.50;
        }else if(modelo.toUpperCase() == "PREMIER"){
            this.precio = 72980.70;
        }else if(modelo.toUpperCase() == "EMPERADOR"){
            this.precio= 52460.00;
        }
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * El siguiente metodo calcula el precio del modelo
     **/
    
    public void calcularPrecio(){
        double aux;
        if(getTalla() == 8){
            setPrecioFinal(precio);
        } else if(getTalla() == 9){
            aux=(10*getPrecio())/100;
            setPrecioFinal(aux);
        }else if(getTalla() == 10){
            aux=(10*getPrecio())/100;
            aux=(10*aux)/100;
            setPrecioFinal(aux);
        }
    }
    
    public String mostrarFinal(){
        return "El precio final para el modelo"
                + getModelo()+"es de: "+getPrecioFinal();
    }
        
}
