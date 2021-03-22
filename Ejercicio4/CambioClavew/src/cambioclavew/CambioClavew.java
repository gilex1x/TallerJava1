package cambioclavew;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class CambioClavew {


    public static void main(String[] args) {
        Scanner myScanner= new Scanner(System.in);
        String user,password;
        int opc;
        //Para efectos practivos vamos a crear el usuario con antelación
        Usuario usuario=new Usuario("admin", "1234");//Estas cosas pasan :V 
       System.out.println("Ingrese su usario");
       user=myScanner.next();
       System.out.println("Ingrese su clave");
       password=myScanner.next();
       if(usuario.validarLogin(user, password)){
           do {
               System.out.println("¿Que desea hacer?");
               System.out.println(" 1->Cambiar clave\n 2->Cambiar nombre usuario\n 3->SALIR");
               opc=myScanner.nextInt();
               switch(opc){
                   case 1:
                       System.out.println("Ingrese nueva clave");
                       password=myScanner.next();
                       usuario.cambiarClave(password);
                       break;
                   case 2:
                       System.out.println("Ingrese su nuevo nombre");
                       user=myScanner.next();
                       usuario.setNombre(user);
                       break;
                       
                       
               }
           } while (opc<3 & opc>0);
           
           
       }else{
           System.out.println("Intentelo otra vez");
       }
       
    }
    
}
