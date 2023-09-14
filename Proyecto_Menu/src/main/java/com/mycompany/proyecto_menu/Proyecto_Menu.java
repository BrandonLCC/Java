/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_menu;
import java.util.Scanner;
/**
 *
 * @author BrandonLuis
 */
public class Proyecto_Menu {

    public static void main(String[] args) {
        
       
        Scanner Teclado = new Scanner (System.in);
        int opcion;
        int conPollo = 0, conCarne = 0,conCazuela = 0, conFIdeos = 0;
        int precioP = 1500, precioC = 4000, precioCZ = 2000, precioFI = 1200;
        int precio = 0;
        int TotalPrecio = 0;
        
    do{
        System.out.println("---------------------");
        System.out.println("----     MENU    ----");
        System.out.println("---------------------");
        System.out.println("(1) Pollo con arroz");
        System.out.println("(2) Carne Mechada con pure");
        System.out.println("(3) Cazuela de Ave");
        System.out.println("(4) Fideos con Salsa");
        System.out.println("---------------------");
        System.out.println("(5) Salir");
        System.out.println("--------------------");
        
        System.out.print("Opcion:");
        //Imput de las opciones 
        opcion = Teclado.nextInt();
        
        switch (opcion){
            case 1: conPollo++;
                System.out.println("Opcion: (1) Pollo con arroz");
                precio = precioP * conPollo;
                TotalPrecio = TotalPrecio + precio;
                break;
                
            case 2: conCarne++;
                System.out.println("Opcion: (2) Carne Mechada con pure");
                precio = precioC * conCarne;
                TotalPrecio = TotalPrecio + precio;
                break;
                
            case 3: conCazuela++;
                System.out.println("Opcion: (3) Cazuela de Ave");
                precio = precioCZ * conCazuela;
                TotalPrecio = TotalPrecio + precio;
                break;
                
            case 4: conFIdeos++;
                System.out.println("Opcion: (4) Fideos con Salsa");
                precio = precioFI * conFIdeos;
                TotalPrecio = TotalPrecio + precio;
                break; 
                
            case 5:
                System.out.println("----------------------------------");
                System.out.println("            BOLETA FINAL          ");
                System.out.println("----------------------------------");
                System.out.println("CANTIDAD DE PRODUCTO:");
                System.out.println("-----------------------------------");
                System.out.println("("+ conPollo + ") Pollo con arroz");
                System.out.println("("+conCarne + ") Carne mechada con pure");
                System.out.println("("+ conCazuela + ") Cazuela de ave");
                System.out.println("("+ conFIdeos + ") Fideos con salsa");
                System.out.println("-----------------------------------");
                System.out.println("PRECIO TOTAL: "+ TotalPrecio);
                System.out.println("-----------------------------------");
                System.out.println("   ¡MUCHAS GRACIAS POR INGRESAR! "  );
                System.out.println("-----------------------------------");
                break;
                
            default:
                    System.out.println("Esta opcion no existe");
        
        }
    } while (opcion != 5);
  }
}
