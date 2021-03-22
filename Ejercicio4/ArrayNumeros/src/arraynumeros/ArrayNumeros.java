package arraynumeros;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ArrayNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Double>numeros=new ArrayList<Double>();
        int opc;
        double num;
        Scanner myScanner = new Scanner(System.in);
        do {            
            System.out.println("¿Que desea hacer?");
            System.out.println("1->Ingresar un numero\n2->Ver los elementos actuales for"
                    + "3->Ver elementos actuales iterador\n"
                    + "4->Cargar un elemento en la pos 14\n"
                    + "5->Ver elemento pósicion 14\n"
                    + "6->Salir");
            opc=myScanner.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Ingrese el valor a imprimir");
                    num=myScanner.nextDouble();
                    numeros.add(num);
                    break;
                case 2:
                    imprimirFor(numeros);
                    break;
                case 3:
                    imprimirIterador(numeros);
                    break;
                case 4:
                    num=myScanner.nextDouble();
                    numeros.add(14, num);
                    break;
                case 5:
                    System.out.println(numeros.get(14));
                    break;                 
                    
            }
        } while (opc<5);
    }
    
    public static void imprimirIterador(ArrayList lista){
        for (int i=0;i<lista.size();i++){
            System.out.println("Posicion"+i+": "+ lista.get(i));
        }
    }
    public static void imprimirFor(ArrayList<Double> lista){
        for(Double dato : lista){
            System.out.println(dato);
        }
    }
    
    
}
