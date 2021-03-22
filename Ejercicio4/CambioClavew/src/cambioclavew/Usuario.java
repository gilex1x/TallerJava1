package cambioclavew;

/**
 *
 * @author ADMIN
 */
public class Usuario {
    private String nombre;
    private String clave;
    private String ultimasclaves[];
    
    public Usuario(String nombre,String clave){
       this.clave=clave;
       this.nombre=nombre;
       this.ultimasclaves=new String[4];//definimos el tamaño del array
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String[] getUltimasclaves() {
        return ultimasclaves;
    }

    public void setUltimasclaves(String[] ultimasclaves) {
        this.ultimasclaves = ultimasclaves;
    }
    
    public boolean validarLogin(String user,String password){
       if(user.equals(nombre)){
           if(password.equals(clave)){
               return true;
           }
       }
       return false;
    }
    public boolean validarClaves(String clave){
        boolean result=false;
        for(int i=0;i<ultimasclaves.length;i++){
            if(clave.equals(ultimasclaves[i])){
                result= true;
            }
                result= false;
        }
        return result;
    }
    public void cambiarClave(String clave){
        if(validarClaves(clave)){
            System.out.println("La clava ya ha sido usada una vez");
        }else{
            setClave(clave);
            System.out.println("Su nueva clave ha sido cambiada con exito");
        }
    }
}
