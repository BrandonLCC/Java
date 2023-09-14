/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_menu;
import java.util.Scanner;
/**
 *
 * @author pc
 */
public class Proyecto_Menu {
    
   
    public static void main(String[] args) {
        
       
        Scanner Teclado = new Scanner (System.in);
        int opcion;
        int conPollo = 0, conCarne =0,conCazuela = 0, conFIdeos = 0;
        
    do{
        System.out.println("---    MENU    --- ");
        System.out.println("-------------------");
        System.out.println("(1) Pollo con arroz");
        System.out.println("(2) Carne Mechada con pure");
        System.out.println("(3) Cazuela de Ave");
        System.out.println("(4) Fideos con Salsa");
        System.out.println("(5) Salir");
        System.out.println("--------------------");
        
        //Imput de las opciones 
        opcion = Teclado.nextInt();
        
        switch (opcion){
            case 1: conPollo++;break;
            case 2: conCarne++;break;
            case 3: conCazuela++;break;
            case 4: conFIdeos++;break; 
            case 5:
                System.out.println(conPollo + "Pollo con arroz");
                System.out.println(conCarne + "Carne mechada con pure");
                System.out.println(conCazuela + "Cazuela de ave");
                System.out.println(conFIdeos + "Fideos con salsa");
                break;
            default:
                    System.out.println("Esta opcion no existe");
        
        }
    } while (opcion != 5);
}
}