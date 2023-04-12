
package guia03.ejercicio.pkg03;

import java.util.Scanner;

public class Guia03Ejercicio03 {

    public static void main(String[] args) {
        
        System.out.println("Introducir una frase o palabra: ");
        String cadena;
        Scanner leer = new Scanner (System.in);
        
        cadena = leer.nextLine();
        
        if (cadena.length()<=8) {
            System.out.println("CORRECTO");
            
        }
        else {
            System.out.println("INCORRECTO");
        }
        System.out.println(cadena.length());
    }
    
}
