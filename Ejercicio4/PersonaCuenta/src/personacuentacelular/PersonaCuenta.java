package personacuentacelular;

/**
 *
 * @author ADMIN
 */
public class PersonaCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Primero creamos a las personas
       Persona persona1=new Persona("Juan","Ortiz");
       System.out.println(persona1.crearTelefono("987654321"));
       Persona persona2=new Persona("Camila","Torres");
       System.out.println(persona2.crearTelefono(""));
       //Creamos las cuentas, una con parametros y otra sin
       Cuenta cuenta1=new Cuenta(1234,500,persona1);
       Cuenta cuenta2=new Cuenta();
       cuenta2.setNumeroCuenta(1235);
       cuenta2.setPropietario(persona2);
       //deposito a las cuentas
       cuenta1.transaccion(200,"retiro");
       cuenta1.transaccion(700,"deposito");
       System.out.println(cuenta1.toString());
       cuenta2.transaccion(2000, "retiro");//esto nos arroja error
       cuenta2.transaccion(1000, "deposito");
       System.out.println(cuenta2.toString());
       
        
        
    }
    
}
