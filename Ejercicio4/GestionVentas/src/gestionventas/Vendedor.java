package gestionventas;

public class Vendedor {
    private final int salarioBase=200;
    public String nombre;
    public int totalVentas=0;
    public int totalSalario;
    
    public Vendedor(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(int totalVentas) {
        this.totalVentas = totalVentas;
    }

    public int getTotalSalario() {
        return totalSalario;
    }

    public void setTotalSlario(int totalSalario) {
        this.totalSalario = totalSalario;
    }
    
    /**
     * El siguiente metodo calcula el total del salario
     **/
    
    public int calcularPorcentaje(){
        double totalAux= (9*getTotalVentas())/100;//sacamos el 9% del total de las ventas
        return (int) totalAux;
    }
    public void calcularTotalSalario(){
        setTotalSlario(calcularPorcentaje() + salarioBase);
    }
    
    public String mostrarResumen(){
        return "Resumen de "+getNombre()+"\n"
                +"Salario base: 200 \n"
                + "tota ventas: "+getTotalVentas()+"\n"
                + "9% de las ventas" + calcularPorcentaje()+"\n"
                + "*---------------------------------*\n"
                + "Total del salario: "+getTotalSalario();
    }
    /**
     * Este metodo suma los valores para despues calcular el total
     **/
    public void sumarValores(int valor){
        int valAux=getTotalVentas()+valor;//Sumamos los valores que vamos pasando
        setTotalVentas(valAux);
    }
    
}
