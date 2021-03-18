package personacuentacelular;

/**
 *
 * @author ADMIN
 */
public class Cuenta {
    private int numeroCuenta=0;//si no añaden el saldo, se asume que es 0
    private long saldo;
    private Persona propietario;
    /**
     * Constructor con parametros 
     * para crear una cuenta con un saldo inical
     **/
    public Cuenta(int numeroCuenta,int saldoInicial,Persona propietario){
        this.numeroCuenta=numeroCuenta;
        this.saldo=saldoInicial;
        this.propietario=propietario;
    }
    /**
     * Constructor sin parametros
     * para crear una cuenta 0$ pesos y que no
     * sabemos aun quien es el dueño o su numero de cuenta
     **/
    public Cuenta(){
        
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }
    
    /**
     * meotodo toString modificado
     * @return String
     **/
    @Override
    public String toString(){
        return "Detalles de la cuenta:\n numero cuenta-> " + getNumeroCuenta()+"\n"
                +" saldo-> "+getSaldo()+"\n propietario->\n"+propietario.toString();
    }
    /**
     * Este metodo permite realzar transacciones de tipo
     * retiro o deposito
     * @param cantidad
     * @param tipoTransaccion
     **/
    public void transaccion(int cantidad,String tipoTransaccion ){
        if(cantidad<0){
            System.out.println("Ingrese solo valores validos");
        }else{
            if(tipoTransaccion=="retiro"){
                if(cantidad>saldo){
                    System.out.println("Error, saldo insuficiente");
                }else{
                    saldo=saldo-cantidad;
                    System.out.println("/******************/\n"
                        + "transaccion:"+tipoTransaccion+"\n"
                        + "nuevo saldo"+getSaldo()+"\n"
                        + "/******************/");
                }
            }else if(tipoTransaccion=="deposito"){
                saldo=saldo+cantidad;
                System.out.println("/******************/\n"
                        + "transaccion:"+tipoTransaccion+"\n"
                        + "nuevo saldo"+getSaldo()+"\n"
                        + "/******************/");
            }
        }

    }
}
