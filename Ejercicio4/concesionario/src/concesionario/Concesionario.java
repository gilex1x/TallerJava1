package concesionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Concesionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Vehiculo> listaCompra=new ArrayList<Vehiculo>();
        Scanner myScanner=new Scanner(System.in);
        String nombre,apellido;
        int documento;
        int precio;
        int opc;
        System.out.println("Ingrese los datos del comprador:\n");
        System.out.println("Nombre:\n");
        nombre=myScanner.next();
        System.out.println("Apellido:\n");
        apellido=myScanner.next();
        System.out.println("Numero de documento:\n");
        documento=myScanner.nextInt();
        Comprador myComprador=new Comprador(nombre, apellido,documento);
        Venta myVenta =new Venta(myComprador);
        System.out.println("Bienvenido a CarsLikeNew \n el mejor lugar para "
                + "comprar carros usados");
        do {
            System.out.println("Seleccione lo que desea comprar");
            System.out.println("1->Carro\n 2->Camioneta\n 3->Moto\n 4->Mostrar items comprados"
                    + "\n 5->Mostrar TOTAL\n 6->FINALIZAR Y SALIR");

            opc=myScanner.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Ingrese el precio del vehiculo");
                    precio=myScanner.nextInt();
                    listaCompra.add(new Auto(1,"RENAULT",2017,2000,precio));
                    myVenta.sumarPrecio(precio);
                    break;
                case 2:
                    System.out.println("Ingrese el precio del vehiculo");
                    precio=myScanner.nextInt();
                    listaCompra.add(new Auto(1,"HAMMMER",2017,2000,precio));
                    myVenta.sumarPrecio(precio);
                    break;
                case 3:
                    System.out.println("Ingrese el precio del vehiculo");
                    precio=myScanner.nextInt();
                    listaCompra.add(new Motocicleta(1,"AKT",2017,2000,precio));
                    myVenta.sumarPrecio(precio);
                    break;
                case 4:
                    mostrarItems(listaCompra);
                    break;
                case 5:
                    System.out.println("El total de la venta es de:\n"+myVenta.getTotalVenta());

            }
        } while (true);
        
    }
    public static void mostrarItems(ArrayList lista){
        lista.forEach(System.out::println);
    }
}
