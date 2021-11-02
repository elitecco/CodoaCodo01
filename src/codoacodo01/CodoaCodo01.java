/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codoacodo01;

import java.util.Scanner;

/**
 *
 * @author Andres
 */
public class CodoaCodo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a Codo a Codo 4.0 \n\nA continuacion se le requerira algunos datos personales.");
        
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        
        System.out.println("Edad: ");
        String edad = sc.nextLine(); //int edad = sc.nextInt();
        
        System.out.println("Un hobbie: ");
        String hobbie = sc.nextLine();
        
        System.out.println("¿Cuál es su editor de codigo favorito? ");
        String editor = sc.nextLine();
        
        System.out.println("Sistema operativo que utiliza habitualmente: ");
        String os = sc.nextLine();
        
        
        System.out.println("\nMuchas gracias por completar el formulario con sus datos. \n\nA continuacion se detallán los datos ingresados para su confirmacion.\n");
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Hobbie: " + hobbie);
        System.out.println("Editor de codigo: " + editor);
        System.out.println("Sistema Operativo: " + os);
        
        System.out.println("\nAprete la tecla Y para confirmar ");
        if("y".equals(sc.nextLine().trim().toLowerCase()))
        {
            System.out.println("Confirmado! \n\nMuchas Gracias!!!" );
        }
    }
    
}
