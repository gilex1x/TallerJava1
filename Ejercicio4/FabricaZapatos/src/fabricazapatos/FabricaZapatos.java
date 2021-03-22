package fabricazapatos;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class FabricaZapatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Para tener mayor control sobre lo que ingresa el usuario se 
        realizara todo porm un menu,a si evitamos que ingresa datos no validos
        */        
        Scanner myScanner= new Scanner(System.in);
        String modelo;
        int talla,opc;
        System.out.println("Bienvenido\n que modelo desea ver?\n"
                + "1->EJECUTIVO\n"
                + "2->PREMIER\n"
                + "3->EMPERADOR\n Digite una opción");
        opc=myScanner.nextInt();
        if(opc==1){
            modelo="EJECUTIVO";
            System.out.println("En que talla desea el modelo:"+ modelo+ "?\n"
                + "1->8\n"
                + "2->9\n"
                + "3->10\n Digite una opción");
                opc=myScanner.nextInt();
            if(opc==1){
                talla=8;
                Zapato myZapato=new Zapato(modelo,talla);
                myZapato.calcularPrecio();
                System.out.println(myZapato.mostrarFinal());
            }else if(opc==2){
                talla=9;
                Zapato myZapato=new Zapato(modelo,talla);
                myZapato.calcularPrecio();
                System.out.println(myZapato.mostrarFinal()); 
            }else if(opc==3){
                talla=10;
                Zapato myZapato=new Zapato(modelo,talla);
                myZapato.calcularPrecio();
                System.out.println(myZapato.mostrarFinal());
            }     
        }else if(opc==2){
            modelo="PREMIER";
            System.out.println("En que talla desea el modelo:"+ modelo+ "?\n"
                + "1->8\n"
                + "2->9\n"
                + "3->10\n Digite una opción");
                opc=myScanner.nextInt();
            if(opc==1){
                talla=8;
                Zapato myZapato=new Zapato(modelo,talla);
                myZapato.calcularPrecio();
                System.out.println(myZapato.mostrarFinal());
            }else if(opc==2){
                talla=9;
                Zapato myZapato=new Zapato(modelo,talla);
                myZapato.calcularPrecio();
                System.out.println(myZapato.mostrarFinal()); 
            }else if(opc==3){
                talla=10;
                Zapato myZapato=new Zapato(modelo,talla);
                myZapato.calcularPrecio();
                System.out.println(myZapato.mostrarFinal());
            }  
        }else if(opc==3){
            modelo="EMPERADOR";
            System.out.println("En que talla desea el modelo:"+ modelo+ "?\n"
                + "1->8\n"
                + "2->9\n"
                + "3->10\n Digite una opción");
                opc=myScanner.nextInt();
            if(opc==1){
                talla=8;
                Zapato myZapato=new Zapato(modelo,talla);
                myZapato.calcularPrecio();
                System.out.println(myZapato.mostrarFinal());
            }else if(opc==2){
                talla=9;
                Zapato myZapato=new Zapato(modelo,talla);
                myZapato.calcularPrecio();
                System.out.println(myZapato.mostrarFinal()); 
            }else if(opc==3){
                talla=10;
                Zapato myZapato=new Zapato(modelo,talla);
                myZapato.calcularPrecio();
                System.out.println(myZapato.mostrarFinal());
            }  
        }else{
            System.out.println("Ingrese una opcion valida");
            System.exit(1);
        }
    }
    
}
