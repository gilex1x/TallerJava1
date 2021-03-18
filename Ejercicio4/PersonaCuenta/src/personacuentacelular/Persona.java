package personacuentacelular;

/**
 *
 * @author ADMIN
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String telefono;
    /**
     * Inicialmente el constructor solo va apedir el nombre y el
     * apellido, el numero de telefono se solicitara en el programa y en el
     * uy se hara una validación para que sea de nueve digitos
     **/
    public Persona(String nombre,String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    }
    /**
     * Metodo constructor sin parametros
     **/
    public Persona(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    /**
     * Este metodo valida que el numero telefonico del usuario es
     * valido,osea solo 9 digitos, sin aceptar 000000000
     * @return 
     **/
    public String crearTelefono(String numeroTelefono){
        if(numeroTelefono.length()<9 || numeroTelefono.length()>9){
          return "Su número telefonico es invalido \n"
                  + "ejem: 123456789";
        }else{
            setTelefono(numeroTelefono);
            return "Su nnúmero telefonico se creo con exiito \n";
        }

    }
    /**
     * toString modificado
     * @return 
     **/
    @Override
    public String toString(){
        return "Nombre completo ->"+getNombre()+" "+ getApellido()+"\n"
                + "numero de contacto->"+getTelefono();
    }
}
