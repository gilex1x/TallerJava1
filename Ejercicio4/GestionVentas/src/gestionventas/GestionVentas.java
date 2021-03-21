package gestionventas;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionVentas {


    public static void main(String[] args) {
        Scanner myScanner= new Scanner(System.in);
        String nombre;
        String nombreArticulo;
        int valor,opc;
        ArrayList <ArticuloVenta> lista1=new ArrayList<>();
        System.out.println("Ingrese el nombre del vendedor");
        nombre=myScanner.nextLine();
        Vendedor myVendedor= new Vendedor(nombre);
        do{
        System.out.println("Bienvenido "+nombre+" al sistema de gestion de ventas");
        System.out.println("Digite la opcion deseada\n 1->Ingresar nuevo articulo\n "
                + "2->Mostrar resumen\n 3->Salir");
        opc=myScanner.nextInt();
        switch (opc) {
            case 1:
                System.out.println("Nombre del articulo:");
                nombreArticulo=myScanner.next();
                System.out.println("Precio:");
                valor=myScanner.nextInt();
                myVendedor.sumarValores(valor);
                lista1.add(new ArticuloVenta(nombre,valor));
                break;
            case 2:
                myVendedor.calcularTotalSalario();
                System.out.println(myVendedor.mostrarResumen());
                break;
            default:
                System.out.println("Cerrando...");
        }}while(opc<3 & opc>0);
        
    }
    
    

    
}
